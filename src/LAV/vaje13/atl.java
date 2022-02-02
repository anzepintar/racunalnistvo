public class atl {
  public static void main(String[] args) {
    int r[][] = new int[12][6];
    int stmetov = 0;
    double meti = 0;
    filltab(r);

    printTab(r);
    for (int i = 0; i < r.length; i++) {
      for (int j = 0; j < r[0].length; j++) {

        if (r[i][j] > 0) {
          stmetov = stmetov + r[i][j];
          meti++;
        }
      }
      povprecjeSerije(i, stmetov, meti);
      meti = 0;
      stmetov = 0;

    }

  }

  public static void filltab(int[][] r) {
    for (int i = 0; i < r.length; i++) {
      for (int j = 0; j < r[0].length; j++) {
        r[i][j] = (int) (Math.random() * 10);
      }
    }
  }

  public static void povprecjeSerije(int i, int stmetov, double meti) {
    System.out.println("Povprečna dolžina metov " + (i + 1) + ". serije je " + String.format("%.2f", stmetov / meti));

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
