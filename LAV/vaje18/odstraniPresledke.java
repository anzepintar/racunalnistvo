package vaje18;

public class odstraniPresledke {
  public static void main(String[] args) {
    String niz = "aaa          aa                   .  aa   11     aaa       aaa                 aa";
    String tab[] = niz.split("\\s+");
    String niz2 = "";
    for (int i = 0; i < tab.length; i++) {
      niz2 += tab[i] + " ";
    }
    System.out.println(niz2.trim());
  }

}