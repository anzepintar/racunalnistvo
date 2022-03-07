package tabele;

public class bubbleSort {
  public static void main(String[] args) {
    int tab[] = { 8, 2, 7, 4, 5, 6, 7, 8, 3, 10 };
    boolean ch = true;
    int notsorted = tab.length;
    int tmp = 0;
    while (ch) {
      ch = false;
      notsorted--;
      for (int i = 0; i < notsorted; i++) {
        if (tab[i] > tab[i + 1]) {
          tmp = tab[i];
          tab[i] = tab[i + 1];
          tab[i + 1] = tmp;
          ch = true;

        }

      }

    }
    for(int j =0; j < tab.length; j++) {
      System.out.print(tab[j] + " ");
    }
  }
}
