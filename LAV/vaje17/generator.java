package vaje17;
import java.util.Random;

public class generator {
  public static void main(String[] args) {
    String geslo = "";
    Random r = new Random();
    boolean velikeCrke = true;
    boolean maleCrke = true;
    boolean stevilke = true;
    boolean znaki = true;
    int dolzina = 8;
    for (int i = 0; i < dolzina; i++) {
      geslo += geslo + (char) (r.nextInt(26) + 65);
    }
    System.out.println(geslo);

  }
}