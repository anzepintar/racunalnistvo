package vaje18;

// preveri, če sta niza anagrama (sestavljena iz istih črk)
public class anagram {
  public static void main(String[] args) {
    String niz1 = "mother in law";
    String niz2 = "woman hitler";
    preveriAnagram(niz1, niz2);
  }

  public static void preveriAnagram(String niz1, String niz2) {

    StringBuffer sb1 = new StringBuffer(niz1);
    StringBuffer sb2 = new StringBuffer(niz2);

    for (int i = 0; i < sb1.length(); i++) {
      if (sb1.indexOf(sb2.charAt(i) + "") != -1) {
        sb1.deleteCharAt(i--);
      }

    }
    System.out.println((sb1.isEmpty() ? "Sta" : "Nista") + " anagrama");
  }
}
