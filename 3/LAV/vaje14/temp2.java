package vaje14;

public class temp2 {
  public static void main(String[] args) {
    int tab[][] = new int[4][4];

    napolniTabelo(tab);
    izpisiTabelo(tab);
  }

  public static void izpisiTabelo(int[][] tab) {
    for (int i = 0; i < tab.length; i++) {
      for (int j = 0; j < tab[0].length; j++) {
        System.out.print(tab[i][j]);
      }
      System.out.println();
    }
  }

  public static void napolniTabelo(int[][] tab) {
    for (int i = 0; i < tab.length; i++) {
      for (int j = 0; j < tab[0].length; j++) {
        // 0 - 9,9999 in +0 -> 0-9
        tab[i][j] = (int) (Math.random() * 10) + 0;
      }
    }
  } 
}
