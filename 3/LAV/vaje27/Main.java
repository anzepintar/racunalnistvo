package vaje27;

public class Main {
  public static void main(String[] args) {
    TovornoVozilo Mercedes = new TovornoVozilo("Mercedes", 21.4, 120000, 24, 17.3);
    TovornoVozilo Volvo = new TovornoVozilo("Volvo", 20.6, 100000, 25, 18);
    TovornoVozilo MAN = new TovornoVozilo("MAN", 22, 89000, 23, 17);
    if (Mercedes.dejanskaPoraba() == Math.min(Mercedes.dejanskaPoraba(),
        Math.min(Volvo.dejanskaPoraba(), MAN.dejanskaPoraba())))
      System.out.println("Mercedes");
    else if (Volvo.dejanskaPoraba() == Math.min(Mercedes.dejanskaPoraba(),
        Math.min(Volvo.dejanskaPoraba(), MAN.dejanskaPoraba())))
      System.out.println("Volvo");
    else
      System.out.println("MAN");

    System.out.println(Volvo);

  }
}

class Vozilo {
  private String znamka;
  private double poraba;
  private int cena;

  public Vozilo(String znamka, double poraba, int cena) {
    this.znamka = znamka;
    this.poraba = poraba;
    this.cena = cena;
  }

  public void izpis() {
    System.out.print(this.znamka + " " + this.poraba + " " + this.cena);
  }

  public String toString() {
    return this.znamka + " " + this.poraba + " " + this.cena;
  }

  public double getPoraba() {
    return this.poraba;
  }
}

class TovornoVozilo extends Vozilo {
  private double masaTovora;
  private double dolzina;

  public TovornoVozilo(String znamka, double poraba, int cena, double masaTovora, double dolzina) {
    super(znamka, poraba, cena);
    this.masaTovora = masaTovora;
    this.dolzina = dolzina;
  }

  public double dejanskaPoraba() {
    return this.masaTovora * 0.1 + this.getPoraba();
  }

  public void izpis() {
    super.izpis();
    System.out.print(" " + this.masaTovora + " " + this.dolzina + this.dejanskaPoraba());
  }
}