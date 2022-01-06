package Racunalnistvo.java.tabele;

class sSortiranjeZVstavljanjem {
  public static void main(String[] args) {
    int tab[] = { 7, 1, 5, 9, 2, 8, -1, 22, 22, 12, -22 };
    int uStart = 0;
    int uEnd = 0;
    int nStart = 1;
    int nEnd = tab.length - 1;
    int tmp = 0;

    for (int i = 0; i < nEnd; i++) {

      for (int j = uStart; j <= uEnd; j++) {

        if (tab[nStart] > tab[uEnd])
          break;
        else if (tab[j] > tab[nStart]) {
          tmp = tab[j];
          tab[j] = tab[nStart];
          tab[nStart] = tmp;
        }
      }
      uEnd++;
      nStart++;
    }

    for (int i = 0; i < tab.length; i++)
      System.out.print(tab[i] + " ");
  }
}
