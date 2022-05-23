package vaje25;

public class BancniRacun {
  // lastnosti
  private double stanje;
  private double dovoljeni_limit;

  // konstruktorji
  public BancniRacun() {
    stanje = 0;
    dovoljeni_limit = 500;
  }

  public BancniRacun(double stanje, double dovoljeni_limit) {
    this.stanje = stanje;
    this.dovoljeni_limit = dovoljeni_limit;
  }

  // metode
  public void polog(double znesek) {
    this.stanje += znesek;
  }

  public boolean dvig(double znesek) {
    if ((this.stanje + this.dovoljeni_limit - znesek) >= 0) {
      this.stanje -= znesek;
      return true;
    } else
      return false;
  }

  public void spremeniLimit(double novLimit) {
    this.dovoljeni_limit = novLimit;
  }

  public void pripisObresti(double odstotek) {
    this.stanje += this.stanje * odstotek;
  }

  public double vrniStanje() {
    return this.stanje;
  }

  public double vrniLimit() {
    return this.dovoljeni_limit;
  }

}
