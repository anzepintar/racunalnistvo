/*
Na atletskem tekmovanju je v metu krogle nastopilo 12 tekmovalcev. vsak je imel na voljo šest metov. Rezultati, ki so jih dosegli v posameznih serijah, so shranjeni
v tabeli r, ki ima 12 vrstic (vsaka vrstica ustreza enemu tekmovalcu) in 6 stolpcev (vsak stolpec ustreza eni seriji metov). Neveljavni meti so zabelezeni kot meti
z dolzino 0. Napisite podprogram povprecjeSerije, ki za vsako serijo posebej izpiše povprecno dolzino metov. Pri tem naj uposteva samo veljavne mete (tiste z dolzino > 0).
*/
package LAV.vaje13;

public class atl {
  public static void main(String[] args) {
    int r[][] = new int[12][6];
    int vsota = 0;
    double stmetov = 0;

    filltab(r);

    printTab(r);

    for (int i = 0; i < r[0].length; i++) {
      for (int j = 0; j < r.length; j++) {
        if (r[j][i] > 0) {
          vsota = vsota + r[j][i];
          stmetov++;
        }
      }
      povprecjeSerije(i, vsota, stmetov);
      stmetov = 0;
      vsota = 0;
    }

  }

  public static void filltab(int[][] r) {
    for (int i = 0; i < r.length; i++) {
      for (int j = 0; j < r[0].length; j++) {
        r[i][j] = (int) Math.round((Math.random() * 20));
      }
    }
  }

  public static void povprecjeSerije(int i, int stmetov, double meti) {
    System.out.println("Povprečna dolžina metov " + (i + 1) + ". serije je " + String.format("%.2f", stmetov / meti) + " m");
  }

  public static void printTab(int tab[][]) {
    for (int i = 0; i < tab.length; i++) {
      System.out.print("Tekmovalec " + (i + 1) + ": ");
      for (int j = 0; j < tab[0].length; j++)
        System.out.print(tab[i][j] + " ");
      System.out.println();
    }
    System.out.println();
  }
}
