package vaje19.Ulomek;

public class Ulomek {
  int stevec;
  int imenovalec;

  public Ulomek(int ste, int ime) {
    stevec = ste;
    imenovalec = ime;
  }

  public void pokrajsaj() {
    for (int i = 2; i <= imenovalec; i++) {
      if (stevec % i == 0 && imenovalec % i == 0) {
        stevec /= i;
        imenovalec /= i;
        i--;
      }
    }
    System.out.println(stevec + "/" + imenovalec);

  }

  public void primerjaj(Ulomek a){

  }
}
