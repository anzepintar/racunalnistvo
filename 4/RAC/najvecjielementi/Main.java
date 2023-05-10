package najvecjielementi;

public class Main {
  public static void main(String[] args) {
    int tab[] = { 1, 3, 4, 8, 5, 6, 7, 3, 1, 9, 9, 9, 9 };
    int max[] = new int[3];
    int min = tab[0];
    for (int i = 0; i < tab.length; i++) {
      if (tab[i] < min) {
        min = tab[i];
      }
    }
    max[0] = max[1] = max[2] = min;
    for (int i = 0; i < tab.length; i++) {
      if (tab[i] > tab[max[0]]) {
        max[2] = max[1];
        max[1] = max[0];
        max[0] = i;
      } else if (tab[i] > tab[max[1]]) {
        max[2] = max[1];
        max[1] = i;
      } else if (tab[i] > tab[max[2]]) {
        max[2] = i;
      }
    }
    System.out.print("Indeksi: ");
    for (int i = 0; i < max.length; i++) {
      System.out.print(max[i] + " ");
    }
    System.out.println();
    for (int i = 0; i < tab.length; i++) {
      System.out.print(tab[i] + " ");
    }
  }
}
