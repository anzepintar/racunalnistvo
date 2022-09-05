package vaje01;

public class Main {
  public static void main(String[] args) {
    Cas zdaj = new Cas();
    zdaj.ura = 9;
    zdaj.min = 1;
    System.out.println(zdaj.ura + ":" + zdaj.min);
    
    Cas potem = new Cas(9, 4);
    System.out.println(potem);
    potem.izpis();
  }
}

class Cas {
  int ura;
  int min;

  public Cas() {
  }

  public Cas(int ura, int min) {
    this.ura = ura;
    this.min = min;
  }

  public String toString() {
    return this.ura + ":" + this.min;
  }

  public void izpis() {
    System.out.println(this.ura + ":" + this.min);
    System.out.printf("%02d:%02d", this.ura, this.min);
  }

}