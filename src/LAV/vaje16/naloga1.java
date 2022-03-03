package LAV.vaje16;

public class naloga1 {
  public static void main(String[] args) {
    String besedilo = "test0 test1 test2 test3 tes4";
    String niz = "test";

    System.out.println(besedilo.contains(niz));
    // argumenti
    int stPonovitev = iskanjePonovitev(besedilo, niz);
    System.out.println(stPonovitev);
    izpisPoVrsticah(besedilo);
    obrniNiz(besedilo);
    String besedilo2 = "123aa321";
    // z reverse
    palindrom(besedilo2);
    // z zanko
    palindromZzanko(besedilo2);
    String lorem = "Suspendisse bibendum venenatis finibus. Donec ultricies ex in erat scelerisque, eget tincidunt sapien elementum. Nunc efficitur arcu sit amet est faucibus bibendum. Proin arcu urna, vulputate non ultricies eget, fermentum eu metus.";
    informacije(lorem);

  }

  public static void informacije(String niz) {
    int besede = 0;
    int samoglasniki = 0;
    int soglasniki = 0;
    int presledki = 0;
    for (int i = 0; i < niz.length(); i++) {
      char crka = niz.charAt(i);
      if (crka == 'A') {
      }
    }

  }

  public static void palindromZzanko(String niz) {
    boolean a = true;
    for (int i = 0; i < niz.length(); i++) {
      if (niz.charAt(i) != niz.charAt(niz.length() - 1 - i)) {
        a = false;
        break;
      }
    }
    String izpis = a ? "je palindrom" : "ni palindrom";
    System.out.println(izpis);
  }

  public static void palindrom(String niz) {
    StringBuffer strBuff = new StringBuffer(niz);
    StringBuffer obrnjeno = strBuff.reverse();
    // equals lahko sprejme samo enake tipe podatkov
    if (obrnjeno.equals(strBuff))
      System.out.println("je palindrom");
    else
      System.out.println("ni palindrom");
  }

  public static void obrniNiz(String niz) {
    StringBuffer stb = new StringBuffer(niz);
    System.out.println(stb.reverse());

  }

  public static void izpisPoVrsticah(String niz) {
    for (int i = 0; i < niz.length(); i++) {
      System.out.print(niz.charAt(i));
    }
    System.out.println();

  }

  // javno/ -- / vrne tip int / ime metode / parametra/
  public static int iskanjePonovitev(String niz, String iskano) {
    int stevec = 0;
    int index = 0;
    while ((index = niz.indexOf(iskano, index)) != -1) {
      stevec++;
      index += iskano.length();
    }
    return stevec;
  }
}
