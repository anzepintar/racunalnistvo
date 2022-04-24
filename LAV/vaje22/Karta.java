package vaje22;

public class Karta {
  // lastnosti
  String barva; // srce, karo, pik, križ
  int vrednost; // 2,3,4,5,6....

  // konstruktorji
  public Karta(String barva, int vrednost) {
    this.barva = barva;
    this.vrednost = vrednost;
  }

  // metode
  public void izpis() {
    System.out.println(barva + "(" + vrednost + ")");
  }

  // večja = 1, enaka = 0, manjša -1
  public int primerjaj(Karta k){ 
    return vrednost;

  }
}