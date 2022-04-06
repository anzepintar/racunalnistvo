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

  public Ulomek(int k) {
    System.out.println(k + " / " + 1);
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

    int maxDel = NajvecjiDelitelj(this.st, this.im);
    System.out.println(this.st / maxDel + " / " + this.im / maxDel);

  }

  private int NajvecjiDelitelj(int a, int b) {
    int maxDel = 1;
    for (int i = 1; i <= Math.min(a, b); i++) {
      if (a % i == 0 && b % i == 0) {
        maxDel = i;
      }
    }

    return maxDel;
  }

}
