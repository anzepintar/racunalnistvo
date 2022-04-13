package razredi;

public class UlomekNaloge {
  public static void main(String[] args) {
    Ulomek prvi = new Ulomek(5, -4);
    Ulomek drugi = new Ulomek(4, -5);
    Ulomek tretji = new Ulomek(5);
    prvi.pokrajsaj();
    drugi.pokrajsaj();
    System.out.println("Ali sta enaka: " + prvi.enak(drugi));
    int stevilo = prvi.compareTo(drugi);
    System.out.println((stevilo == -1) ? ("Drugi je vecji od prvega")
        : ((stevilo == 0) ? ("Sta enaka") : ("Prvi je vecji od drugega")));
    System.out.println(tretji.toString());
    System.out.println(prvi.vsota(drugi).toString());
    System.out.println(prvi.razlika(drugi).toString());
    System.out.println(prvi.zmnozek(drugi).toString());
    System.out.println(prvi.kvocient(drugi).toString());
    prvi.pristej(drugi);
    prvi.odstej(drugi);
    prvi.zmnozi(drugi);
    prvi.deli(drugi);
  }
}

class Ulomek {
  public int st;
  public int im;

  Ulomek(int stevec, int imenovalec) {
    this.st = stevec;
    this.im = imenovalec;
  }

  Ulomek(int k) {
    this.st = k;
    this.im = 1;
  }

  public void pokrajsaj() {
    int skupniDel = najvecjiSkupniDelitelj(this.st, this.im);
    this.st /= skupniDel;
    this.im /= skupniDel;

  }

  public int najvecjiSkupniDelitelj(int a, int b) {
    if (a < b) {
      int tmp = a;
      a = b;
      b = tmp;
    }
    while (b != 0) {
      int tmp = b;
      b = a % b;
      a = tmp;
    }
    return a;
  }

  public boolean enak(Ulomek a) {
    if (this.st * a.im == this.im * a.st)
      return true;
    else
      return false;
  }

  public int compareTo(Ulomek a) {
    boolean obrni = false; // ce imamo negativna oba ulomka, je vecji tisti z manjsimi stevilkami
    if ((this.st ^ this.im) < 0) {
      if ((a.st ^ a.im) < 0)
        obrni = true;
      else
        return -1;
    } else {
      if ((a.st ^ a.im) < 0)
        return 1;
      else
        obrni = true;
    }

    if (this.st * a.im >= this.im * a.st) {
      if (this.st * a.im == this.im * a.st)
        return 0;
      else
        return obrni ? -1 : 1;
    } else
      return obrni ? 1 : -1;
  }

  public String toString() {
    return this.st + "/" + this.im;
  }

  public Ulomek vsota(Ulomek a) {
    int stevec = this.st * a.im + this.im * a.st;
    int imenovalec = this.im * a.im;
    return new Ulomek(stevec, imenovalec);
  }

  public void pristej(Ulomek a) {
    this.st = this.st * a.im + this.im * a.st;
    this.im *= a.im;
  }

  public Ulomek razlika(Ulomek a) {
    int stevec = Math.abs(this.st * a.im - this.im * a.st);
    int imenovalec = this.im * a.im;
    return new Ulomek(stevec, imenovalec);
  }

  public void odstej(Ulomek a) {
    this.st = Math.abs(this.st * a.im - this.im * a.st);
    this.im = this.im * a.im;
  }

  public Ulomek zmnozek(Ulomek a) {
    int stevec = this.st * a.st;
    int imenovalec = this.im * a.im;
    return new Ulomek(stevec, imenovalec);
  }

  public void zmnozi(Ulomek a) {
    this.st *= a.st;
    this.im *= a.im;
  }

  public Ulomek kvocient(Ulomek a) {
    int stevec = this.st * a.im;
    int imenovalec = this.im * a.st;
    return new Ulomek(stevec, imenovalec);
  }

  public void deli(Ulomek a) {
    this.st *= a.im;
    this.im *= a.st;
  }
}
