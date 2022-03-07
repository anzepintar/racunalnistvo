package tabele;

public class drugoNajvecje {
  public static void main(String[] args) {
    int tab[][] = {
        { -1, -7, -1, -7, -5, -9 },
        { -2, -5, -1, -1, -7, -9 },
        { -3, -6, -1, -7, -8, -1 },
        { -4, -1, -1, -2, -8, -4 }
    };
    int max1 = tab[0][0];
    int max2 = tab[0][0];
    int tempmax2 = 0;

    for (int i = 0; i < tab.length; i++) {
      for (int j = 0; j < tab[0].length; j++) {
        if (tab[i][j] >= max1) {
          tempmax2 = max1;
          max1 = tab[i][j];

        } else if ((tab[i][j] >= max2) && (tab[i][j] >= tempmax2)) {
          max2 = tab[i][j];

        } else if (tempmax2 >= max2) {
          max2 = tempmax2;

        }
      }

    }
    System.out.println(max1 + ", " + max2);
    System.out.println("Drugo največje število je: " + max2);
  }
}