package Racunalnistvo.java.tabele;

class izbiranje {
  public static void main(String[] args) {
    int tab[] = { 7, 1, 5, 9, 2, 8, -1, 22, 22, 12, -22 };
    for (int u = 0; u < tab.length; u++) {
      int min = tab[u];
      int index = u;
      for (int n = u; n < tab.length; n++) {
        if (tab[n] < min) {
          min = tab[n];
          index = n;

        }
      }
    }
    for (int i = 0; i < tab.length; i++) {
      System.out.print(tab[i] + " ");
    }
  }
}