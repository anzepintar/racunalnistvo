package delavci;

public class Main {
  public static void main(String[] args) {
    Delavec[] delavci = new Delavec[100];
    polnjenje(delavci);

    // 1.del
    Delavec najmanj = delavci[0];
    int minsum = -1;
    for (int i = 0; i < delavci.length; i++) {
      int sum = 0;
      int[] placa = delavci[i].getOd();
      for (int j = 0; j < placa.length; j++) {
        sum += placa[j];
      }
      if (sum < minsum) {
        minsum = sum;
        najmanj = delavci[i];
      }
    }
    System.out.println(najmanj.getPriimek() + " " + najmanj.getIme());

    // 2.del
    int sum = 0;
    double count = 0;
    for (int i = 0; i < delavci.length; i++) {
      if (delavci[i].getZaposlitev().equals("nedolocen"))
        continue;
      int[] pl = delavci[i].getOd();
      for (int j = 0; j < pl.length; j++) {
        sum += pl[j];
        count++;
      }
    }
    System.out.println("Povprečna placa: " + sum / count);
  }

  private static void polnjenje(Delavec[] delavci) {
    int n = 0;
    for (int i = 0; i < delavci.length; i++) {
      delavci[i] = new Delavec();
      delavci[i].setPriimek("Novak" + n);
      delavci[i].setIme("Lojze");
      delavci[i].setOd(new int[] { (int) (Math.random()*100), 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21 });
      delavci[i].setZaposlitev("dolocen");
      n++;
    }
  }
}
