package LAV.vaje12;

class sudokuChecker {

  public static void main(String[] args) {
    int sudoku[][] = {
        { 6, 7, 9, 5, 1, 8, 2, 4, 3 },
        { 5, 4, 3, 7, 2, 9, 6, 1, 8 },
        { 8, 2, 1, 6, 3, 4, 9, 5, 7 },
        { 7, 9, 4, 3, 5, 2, 1, 8, 6 },
        { 3, 5, 8, 4, 6, 1, 7, 2, 9 },
        { 2, 1, 6, 8, 9, 7, 5, 3, 4 },
        { 4, 8, 5, 2, 7, 6, 3, 9, 1 },
        { 9, 6, 2, 1, 8, 3, 4, 7, 5 },
        { 1, 3, 7, 9, 4, 5, 8, 6, 2 }
    };

    boolean pravilno = true;
    // vrstice
    for (int i = 0; i < 9; i++)
      for (int j = 0; j < 8; j++)
        for (int j2 = j + 1; j2 < 9; j2++)
          if (sudoku[i][j] == sudoku[i][j2]) {
            pravilno = false;
            System.out.println("Ena izmed vrstic ni pravilna");
          }

    // stolpci
    for (int i = 0; i < 9; i++)
      for (int j = 0; j < 8; j++)
        for (int j2 = j + 1; j2 < 9; j2++)
          if (sudoku[j][i] == sudoku[j2][i]) {
            pravilno = false;
            System.out.println("Eden izmed stolpcev ni pravilen");
          }

    // kvadrati
    for (int i = 0; i < 9; i += 3)
      for (int j = 0; j < 9; j += 3)
        for (int pozicija = 0; pozicija < 8; pozicija++)
          for (int pozicija2 = pozicija + 1; pozicija2 < 9; pozicija2++)
            if (sudoku[i + pozicija % 3][j + pozicija / 3] == sudoku[i + pozicija2 % 3][j + pozicija2 / 3]) {
              pravilno = false;
              System.out.println("Eden izmed kvadratkov ni pravilen");
            }
    String izpis = (pravilno) ? "\nSudoku je pravilen\n" : "\nSudoku ni pravilen\n";
    System.out.println(izpis);
  }
}