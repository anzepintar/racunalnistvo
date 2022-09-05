package tabele;

class izbiranje {
  public static void main(String[] args) {
    int tab[] = { 7, -1111, 5, 9, 2, 8, -1, 22, 22, 12, -22 };
    int index = 0;
    for (int i = 0; i < tab.length; i++) {
      int min = tab[i];
      index = i;
      for (int j = i; j < tab.length; j++) {
        if (tab[j] < min) {
          min = tab[j];
          index = j;
          
        }
      }
    }
    for (int i = 0; i < tab.length; i++) {
      System.out.print(tab[i] + " " + index + " ");
    }
  }
}