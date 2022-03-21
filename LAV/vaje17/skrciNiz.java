package vaje17;

public class skrciNiz {
  public static void main(String[] args) {
    String niz = "AAAABBBBCCDDDDDEEEEFFG";
    skrci(niz);

  }

  private static void skrci(String niz) {
    String result = "";
    for (int i = 0; i < niz.length(); i++) {
      for (int j = i; j < niz.length(); j++) {
        if (niz.charAt(i) == niz.charAt(j)) {

          j++;
        }
        else {
          result+=niz.charAt(i) + j;
          j++;
          i++;
        }
      }
    }
  }

}
