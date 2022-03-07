package tabele;

public class sortiranjeV1Tabeli {
  public static void main(String[] args) {
    int tab[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int i = 0;
    int liha1 = 0;
    while (i < tab.length) {
      if (tab[i] % 2 == 0) {
        int t = tab[i];
        tab[i] = tab[liha1];
        tab[liha1] = t;
        liha1++;
      }
      i++;
    }
    for (int j = 0; j < tab.length; j++)
      System.out.print(tab[j] + " ");

  }
}
