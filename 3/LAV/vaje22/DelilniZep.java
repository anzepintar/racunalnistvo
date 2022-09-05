package vaje22;

import java.util.Random;

public class DelilniZep {
  // lastnosti
  Karta[] dz;
  int index = 0;

  // konstruktorji
  public DelilniZep(int kapaciteta) {
    dz = new Karta[kapaciteta];
  }

  // metode
  public void premesaj() {
    Random r = new Random();
    for (int i = 0; i < 100; i++) {
      int index1 = r.nextInt(dz.length);
      int index2 = r.nextInt(dz.length);
      Karta tmp = dz[index1];
      dz[index1] = dz[index2];
      dz[index2] = tmp;
    }

  }

  public void dodajKarto(Karta k) {
    dz[index++] = k;
  }

  public void izpis() {
    for(int i = 0; i < dz.length;i++){
      dz[i].izpis();
    }
  }
}
