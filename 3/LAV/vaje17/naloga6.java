package vaje17;

public class naloga6 {
  public static void main(String[] args) {
    StringBuffer niz = new StringBuffer("lorem ipsum ititit iitii ");
    zamenjajCrke(niz);
    obratniVrstniRed(niz);

    System.out.println(niz);
  }

  private static StringBuffer obratniVrstniRed(StringBuffer niz) {
    String[] besede = niz.toString().split("\\s+");
    String ret = "";
    for (int i = 0; i < besede.length; i++) {
      StringBuffer temp = new StringBuffer(besede[i]);
      ret += temp.reverse().toString();

    }
    StringBuffer re = new StringBuffer(ret);
    return re;

  }

  private static void zamenjajCrke(StringBuffer niz) {
    for (int i = 0; i < niz.length(); i++) {
      char crka = niz.charAt(i);
      if (Character.isUpperCase(crka)) {
        niz.setCharAt(i, Character.toLowerCase(crka));
      } else if (Character.isLowerCase(crka)) {
        niz.setCharAt(i, Character.toUpperCase(crka));
      }
    }
  }
}
