package LAV.vaje13;

public class napolnitevTabele {
  public static void main(String[] args) {
    int[][] tabela = new int[6][7];
    int st = 1;
    for (int i = 0; i < tabela.length; i++) {
      for (int j = 0; j < tabela[i].length; j++) {
        tabela[i][j] = st;
        st++;
      }
    }
    printTab(tabela);
    System.out.println();
    printTabVertical(tabela);
  }

  private static void printTabVertical(int[][] tab) {
    for (int i = 0; i < tab[0].length; i++) {
      for (int j = 0; j < tab.length; j++)
        System.out.print(tab[j][i] + " ");
      System.out.println();
    }
  }

  public static void printTab(int tab[][]) {
    for (int i = 0; i < tab.length; i++) {
      for (int j = 0; j < tab[0].length; j++)
        System.out.print(tab[i][j] + " ");
      System.out.println();
    }
  }
}
