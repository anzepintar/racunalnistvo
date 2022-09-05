package razredi;

public class vozilaDn {
  public static void main(String[] args) {
    avto Audi_S8 = new avto(5.05, 2200, 5, "bela", 80000);
    Audi_S8.setLastnik("Janez", "Novak");
    Audi_S8.izpisiLastik();
  }
}

class vozilo {
  public double dolzina;
  public int masa;
  public int st_oseb;

  public vozilo(double dolzina, int masa, int st_oseb) {
    this.dolzina = dolzina;
    this.masa = masa;
    this.st_oseb = st_oseb;
  }

}

class avto extends vozilo {
  public String barva;
  public int cena;
  private String lastnikIme;
  private String lastnikPiimek;

  public avto(double dolzina, int masa, int st_oseb, String barva, int cena) {
    super(dolzina, masa, st_oseb);
    this.barva = barva;
    this.cena = cena;
  }

  public void setLastnik(String ime, String priimek) {
    this.lastnikIme = ime;
    this.lastnikPiimek = priimek;
  }

  public String getLastnik() {
    return this.lastnikIme + " " + this.lastnikPiimek;
  }

  public void izpisiLastik() {
    System.out.println("Lastnik: " + this.lastnikIme + " " + this.lastnikPiimek);
  }

}