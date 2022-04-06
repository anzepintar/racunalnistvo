package razredi;

public class Main {
  public static void main(String[] args) {
    Ulomek ul1 = new Ulomek(8, 4);
    Ulomek ul2 = new Ulomek(2, 8);
    ul1.izpis();
    ul2.izpis();
    ul1.primerjaj(ul2);

    ul1.sestej(ul2);
    ul1.odstej(ul2);
    ul1.krajsaj();
  }
}