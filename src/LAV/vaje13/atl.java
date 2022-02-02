public class atl {
  public static void main(String[] args) {
    int r[][] = new int[6][12];
    int stmetov = 0;
    double meti = 0;
    for (int i = 0; i < r.length; i++) {
      for (int j = 0; j < r[0].length; j++) {
        r[i][j] = (int) (Math.random() * 20);
      }
    }
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

  public static void povprecjeSerije(int i, int stmetov, double meti) {
    System.out.println("Povprečna dolžina metov" + i + "serije je " + String.format("%.2f", stmetov / meti));

  }
}
