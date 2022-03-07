package tabele;

public class TableIzSlike {
  public static void main(String[] args) {
    // +1. tabela
    int tab1[][] = new int[4][4];
    int n = 1;
    for (int i = 0; i < tab1.length; i++) {
      for (int j = 0; j < tab1[0].length; j++) {
        if (j < n)
          tab1[i][j] = 1;
        else
          tab1[i][j] = 0;
      }
      n++;
    }
    System.out.println("\n---1. tabela---");
    for (int i = 0; i < tab1.length; i++) {
      for (int j = 0; j < tab1[0].length; j++) {
        System.out.print("|" + tab1[i][j]);
      }
      System.out.println("|");
    }
    // -1. tabela

    // +2. tabela
    int tab2[][] = new int[4][4];
    for (int i = 0; i < tab2.length; i++) {
      for (int j = 0; j < tab2[0].length; j++) {
        if ((j == 1 || j == 2) && (i == 1 || i == 2))
          tab2[i][j] = 0;
        else
          tab2[i][j] = 1;
      }

    }
    System.out.println("\n---2. tabela---");
    for (int i = 0; i < tab2.length; i++) {
      for (int j = 0; j < tab2[0].length; j++) {
        System.out.print("|" + tab2[i][j]);
      }
      System.out.println("|");
    }
    // -2. tabela

    // +3. tabela

    int tab3[][] = new int[4][4];
    for (int i = 0; i < tab3.length; i++) {
      for (int j = 0; j < tab3[0].length; j++) {
        if ((i % 2 == 0 && j % 2 == 0) || (i % 2 != 0 && j % 2 != 0))
          tab3[i][j] = 1;
        else
          tab3[i][j] = 0;
      }

    }
    System.out.println("\n---3. tabela---");
    for (int i = 0; i < tab3.length; i++) {
      for (int j = 0; j < tab3[0].length; j++) {
        System.out.print("|" + tab3[i][j]);
      }
      System.out.println("|");
    }

    // -3. tabela

    // +4. tabela
    int tab4[][] = new int[5][5];
    for (int i = 0; i < tab4.length; i++) {
      for (int j = 0; j < tab4[0].length; j++) {
        if (i % 2 == 0 && j % 2 == 1)
          tab4[i][j] = 0;
        else
          tab4[i][j] = 1;
      }

    }
    System.out.println("\n---4. tabela---");
    for (int i = 0; i < tab4.length; i++) {
      for (int j = 0; j < tab4[0].length; j++) {
        System.out.print("|" + tab4[i][j]);
      }
      System.out.println("|");
    }
    // -4. tabela

    // +5. tabela
    int tab5[][] = new int[5][5];
    for (int i = 0; i < tab5.length; i++) {
      for (int j = 0; j < tab5[0].length; j++) {
        if (i % 2 == 0 && j % 2 == 1)
          tab4[i][j] = 0;
        else
          tab4[i][j] = 1;
      }

    }
    System.out.println("\n---5. tabela---");
    for (int i = 0; i < tab5.length; i++) {
      for (int j = 0; j < tab5[0].length; j++) {
        System.out.print("|" + tab5[i][j]);
      }
      System.out.println("|");
    }
    // -5. tabela
  }

}
