// pi = 4*(1-1/3+1/5-1/7....)
public class Pi {
  public static void main(String[] args) {
    double pi = 0;
    double predznak = 1;
    for (long i = 1; i < 62; i += 2) {
      pi = pi + (1 / (i * predznak));
      predznak *= -1;
    }

    pi = pi * 4;

    int tab[] = new int[10];
    for (int i = 0; i < tab.length; i++) {
      int x = (int) pi;
      pi = pi - x;
      pi *= 10;
      tab[i] = (int) pi;
    }

    for (int i = 0; i < tab.length; i++) {
      System.out.print(tab[i] + " ");
    }
  }
}