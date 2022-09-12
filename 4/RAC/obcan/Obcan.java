package obcan;

public class Obcan {
  private String emso;
  private String naslov;

  public Obcan(String emso, String naslov) {
    this.emso = emso;
    this.naslov = naslov;
  }

  public void izpis() {
    System.out.println("EMŠO: " + emso + "\nStalni naslov: " + naslov);
  }
}
