package LAV.vaje14;

public class naloga6 {
  public static void main(String[] args) {
    int tabela[][] = new int[6][7];
    int stevec = 1;
    for (int i = 0; i < tabela.length; i++) {
      for (int j = 0; j < tabela[i].length; j++) {
        tabela[i][j] = stevec;
        stevec++;
      }
    }
    for (int i = 0; i < tabela.length; i++) {
      for (int j = 0; j < tabela[i].length; j++) {
        if (tabela[i][j] < 10)
          System.out.print(tabela[i][j] + "  ");
        else
          System.out.print(tabela[i][j] + " ");
      }
      System.out.println();
    }
  }
}
