package vaje18;

public class papajscina {
  public static void main(String[] args) {

    String niz = "Matura je enostavna";
    zNizi(niz);
    zStringBuffer(niz);
  }

  public static void zNizi(String niz) {
    for (int i = 0; i < niz.length(); i++) {
      String samoglasniki = "AEIOUaeiou";
      // preveri za samoglasnike, če ga ne najde vrne -1
      if (samoglasniki.indexOf(niz.charAt(i)) != -1) {
        System.out.print(niz.charAt(i) + "p" + niz.charAt(i));
      } else {
        System.out.print(niz.charAt(i));
      }
    }
    System.out.println();
  }

  public static void zStringBuffer(String niz) {
    StringBuffer sb = new StringBuffer(niz);
    String samoglasniki = "AEIOUaeiou";
    for (int i = 0; i < sb.length(); i++) {
      if (samoglasniki.indexOf(sb.charAt(i)) != -1) {
        // .insert(začetni index, "kaj vstavi")
        sb.insert(i + 1, "p" + sb.charAt(i));
        i += 2;
      }
    }
    System.out.println(sb);
  }

}