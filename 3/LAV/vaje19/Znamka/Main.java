package vaje19.Znamka;

public class Main {
  public static void main(String[] args) {
    Znamka z = new Znamka("madagaskar", 2020, "žival", 12.55);
    z.drzava = "Egipt";
    z.letnica = 1920;

    Znamka z2 = new Znamka("maroko", 1999, "pokrajina", 2.20);
    z2.drzava = "aaa";
    System.out.println(z.drzava);
    System.out.println(z.letnica);
    System.out.println(z2.letnica);

    z2.izpis();
  }
}
