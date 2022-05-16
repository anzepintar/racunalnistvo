package vaje23;

public class Main {
  public static void main(String[] args) {
    Pravokotnik moj = new Pravokotnik(12, 15, 11, 11);
    moj.izpis();
    Krog prvi = new Krog(5, 0, 0);
    prvi.izpis();
  }
}

class Lik {
  // Lastnosti
  private double x;
  private double y;

  // Konstruktor
  public Lik(int a, int b) {
    this.x = 0;
    this.y = 0;
  }

  public void izpis() {
    System.out.println(this.x + " " + this.y);
  }

  // Metode
  public void premik(int a, int b) {
    this.x += a;
    this.y += b;
  }
}

class Pravokotnik extends Lik {
  double a;
  double b;

  public Pravokotnik(double a, double b, int x, int y) {
    super(x, y); // klic konstruktorja nadrazreda
    this.a = a;
    this.b = b;
  }

  public double ploscina() {
    return (this.a * this.b);
  }
}

class Krog extends Lik {
  double r;

  public Krog(double radij, int x, int y) {
    super(x, y);
    this.r = radij;

  }

  public double ploscina() {
    return this.r * this.r * Math.PI;
  }
}

// lahko extend tudi pravokotnik z npr. kvadrat domača naloga -- obseg, ploščine, za več likov s temi stvarmi