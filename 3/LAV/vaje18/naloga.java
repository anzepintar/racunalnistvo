package vaje18;

public class naloga {
  public static void main(String[] args) {
    String niz1 = "velikost";
    String niz2 = "telefon";
    int podobnost = 0;

    for (int i = 0; i < Math.min(niz1.length(), niz2.length()); i++) {
      if (niz1.charAt(i) == niz2.charAt(i)) {
        podobnost++;
      }
    }
    System.out.println(podobnost);
  }
}
