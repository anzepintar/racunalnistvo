package LAV.vaje14;

import java.util.Random;

public class naloga7 {
  public static void main(String[] args) {
    int tab[][] = new int[10][12];

    Random r = new Random();

    for (int i = 0; i < tab.length; i++) {
      for (int j = 0; j < tab[0].length; j++) {
        tab[i][j] = r.nextInt(100);
      }
    }

    String mesec;
    int vsota = 0;
    for (int i = 0; i < tab[0].length; i++) {
      for (int j = 0; j < tab.length; j++) {
        vsota = vsota + tab[j][i];
      }
      switch (i) {
        case 0:
          mesec = "januar";
          break;
        case 1:
          mesec = "februar";
          break;
        case 2:
          mesec = "marec";
          break;
        case 3:
          mesec = "april";
          break;
        case 4:
          mesec = "maj";
          break;
        case 5:
          mesec = "junij";
          break;
        case 6:
          mesec = "julij";
          break;
        case 7:
          mesec = "avgust";
          break;
        case 8:
          mesec = "september";
          break;
        case 9:
          mesec = "oktober";
          break;
        case 10:
          mesec = "november";
          break;
        default:
          mesec = "december";
          break;

      }
      System.out.println(mesec + " - " + vsota);
      vsota = 0;
    }

  }
}
