package vaje14;

public class naloga3 {
  public static void main(String[] args) {
    int tab[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
    boolean padajoce = true;
    for (int i = 0; i < tab.length - 1; i++) {
      if (tab[i] <= tab[i + 1]) {
        padajoce = false;

      }

    }
    String izpis = (padajoce ? "Je padajoče urejena" : "Ni padajoče urejena");
    System.out.println(izpis);
  }
}
