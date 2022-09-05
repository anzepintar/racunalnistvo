package vaje01;

public class Evidenca {
  public static void main(String[] args) {
    Dijak[] krozek = new Dijak[30];
    krozek[0] = new Dijak("Anže", "Arh");
    krozek[1] = new Dijak("Matej", "Noč");
    krozek[2] = new Dijak("Jože", "Grah");
    krozek[3] = new Dijak("Janko", "Volk");
    izpisTabele(krozek);
  }
  public static void izpisTabele(Dijak[] tab){
    for (int i = 0; i < tab.length; i++) {
      if (tab[i] != null)
        System.out.println(tab[i]);
    }
  }
}

class Dijak {
  static int st = 0;
  int zapSt = 0;
  String ime;
  String priimek;

  public Dijak(String ime, String priimek) {
    Dijak.st++;
    this.zapSt = Dijak.st;
    this.ime = ime;
    this.priimek = priimek;
  }

  public String toString() {
    return (this.zapSt + ". " + this.ime + " " + this.priimek);
  }
}
