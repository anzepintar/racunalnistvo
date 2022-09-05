package vaje25;

public class Atlet {
  // lastnosti
  int startna_st;
  String drzava;

  // konstruktorji
  public Atlet(int ss, String d) {
    startna_st = ss;
    drzava = d;
  }

  // metode
  public void izpis() {
    System.out.println("Startna številka: " + startna_st);
    System.out.println("Država: " + drzava);
  }
}

class Skakalec extends Atlet {
  // lastnosti
  double dolzina1skoka;
  double dolzina2skoka;
  double dolzina3skoka;

  // konstruktorji
  public Skakalec(int ss, String d, double d1, double d2, double d3) {
    super(ss, d);
    this.dolzina1skoka = d1;
    this.dolzina2skoka = d2;
    this.dolzina3skoka = d3;
  }

  // metode
  public double najboljsiSkok() {

    return (Math.max(Math.max(dolzina1skoka, dolzina2skoka), dolzina3skoka));
  }

  public boolean boljsi(Skakalec s) {
    return (this.najboljsiSkok() > s.najboljsiSkok());
  }

  public void izpis() {
    System.out.println(
        "Startna številka: " + startna_st
            + "\nDržava: " + drzava
            + "\n1. skok: " + dolzina1skoka
            + "\n2. skok: " + dolzina2skoka
            + "\n3. skok: " + dolzina3skoka
            + "\nNajboljši skok: " + this.najboljsiSkok());
  }
}
