package vaje24;

public class Main {
  public static void main(String[] args) {
    Tovornjak t1 = new Tovornjak("MAN", 300, 95, 32);
    t1.izpisiVse();
  }
}

class MotornoVozilo {
  protected String proizvajalec;
  protected int moc;
  protected int hitrost;

  public MotornoVozilo(String proizvajalec, int moc, int hitrost) {
    this.proizvajalec = proizvajalec;
    this.moc = moc;
    this.hitrost = hitrost;
  }

  public void izpisiVse() {
    System.out.println("Proizvajalec: " + proizvajalec + "\nMoč motorja: " + moc + "\nMaksimalna hitost: " + hitrost);

  }
}

class Tovornjak extends MotornoVozilo {
  private int nosilnost;

  public Tovornjak(String proizvajalec, int moc, int hitrost, int nosilnost) {
    super(proizvajalec, moc, hitrost);
    this.proizvajalec = proizvajalec;
    this.nosilnost = nosilnost;
    this.moc = moc;
  }

  public void izpisiVse() {
    super.izpisiVse();
    System.out.println("Nosilnost: " + nosilnost);

  }
}