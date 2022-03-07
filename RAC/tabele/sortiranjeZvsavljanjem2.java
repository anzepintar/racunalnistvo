package tabele;

public class sortiranjeZvsavljanjem2 {
  public static void main(String[] args) {
    int tab[] = { 7, 1, 5, 9, 2, 8, -1, 22, 22, 12, -22 };
    int uStart = 0;
    int uEnd = 0;
    int nStart = 1;
    int nEnd = tab.length - 1;
    int index = 0;
    int tmp = 0;

    for (int j = nStart; j <= nEnd; j++) {
      for (int i = uEnd; i >= uStart; i--) {
        if (tab[j] > tab[i])
          break;
        else
          index = i;
      }
      tmp = tab[j];
      for (int k = j - 1; k >= index; k--){
        tab[k + 1] = tab[k];
      }
      tab[index] = tmp;
      uEnd++;
      nStart++;

      
    }
    for (int i = 0; i < tab.length; i++)
        System.out.print(tab[i] + " ");

  }
}
