package LAV.vaje12;

import java.util.Random;

class minolovec2 {
  public static void main(String[] args) {
    int colNum = 20, rowNum = 20;
    int[][] tab = new int[colNum][rowNum];
    Random r = new Random();
    int stBomb = 20;
    for (int i = 0; i < stBomb; i++) {
      int row = r.nextInt(colNum);
      int col = r.nextInt(rowNum);
      if (tab[row][col] == 9)
        i--;
      tab[row][col] = 9;
    }
    printTab(tab);
    int bombNum = 0;
    for (int i = 0; i < rowNum; i++) {
      for (int j = 0; j < colNum; j++) {

        bombNum = 0;
        if (tab[i][j] == 0) {
          for (int ii = i - 1; ii <= i + 1; ii++)
            for (int jj = j - 1; jj <= j + 1; jj++)
              if (ii >= 0 && jj >= 0 && ii < rowNum && jj < colNum && tab[ii][jj] == 9)
                bombNum++;
          tab[i][j] = bombNum;
        }

      }

    }

    // klic metode printTab
    printTab(tab);
  }

  // void => ne vrne ničesar
  public static void printTab(int tab[][]) {
    for (int i = 0; i < tab.length; i++) {
      for (int j = 0; j < tab[0].length; j++)
        // System.out.print(tab[i][j]);
        if (tab[i][j] == 0)
          System.out.print(".");
        else if (tab[i][j] == 9)
          System.out.print("x");
        else
          System.out.print(tab[i][j]);
      System.out.println();
    }
    System.out.println();
  }
}