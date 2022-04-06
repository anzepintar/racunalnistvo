package razredi;

public class Ulomek {
  public int st = 0; // stevec
  public int im = 1; // imenovalec

  public Ulomek() {
  }

  public Ulomek(int st, int im) {
    this.st = st;
    this.im = im;
  }

  public void izpis() {
    System.out.println(st + "/" + im);
  }

  public void primerjaj(Ulomek a) {

    if (a.im * this.st > this.im * a.st) {
      System.out.println("1. je večji");
    }
    if (a.im * this.st < this.im * a.st) {
      System.out.println("2. je večji");
    } else {
      System.out.println("Ulomka sta enaka");
    }
  }

  public void sestej(Ulomek a) {
    int st1 = this.st * a.im;
    int st2 = a.st * this.im;
    System.out.println(st1 + st2 + " / " + this.im * a.im);
  }

  public void odstej(Ulomek a) {
    int st1 = this.st * a.im;
    int st2 = a.st * this.im;
    System.out.println(st1 - st2 + " / " + this.im * a.im);
  }

  public void krajsaj() {
    int st = 0;
    int im = 0;

    System.out.println(this.st / this.im);

  }

}
