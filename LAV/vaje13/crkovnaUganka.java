package vaje13;

public class crkovnaUganka {

  /*Dan je spodnji program v katerem sta deklarirani dve polji. Prvo polje je poljeCrk, ki v dveh dimenzijah velikosti 15 x 15 hrani črke. Drugo polje pa je seznam devetih besed, ki jih je potrebno poiskati v polju črk.
  Spodnji program dopolni tako, da bo v polju črk poiskal besede in izpisal koordinato začetka besede.*/

  public static void main(String[] args) {
    char poljeCrk[][] = {
        { 'H', 'B', 'A', 'T', 'R', 'V', 'V', 'T', 'C', 'O', 'R', 'Ž', 'F', 'F', 'K' },
        { 'Ž', 'A', 'M', 'N', 'N', 'I', 'T', 'V', 'G', 'C', 'I', 'G', 'T', 'R', 'S' },
        { 'M', 'M', 'F', 'A', 'T', 'Č', 'O', 'L', 'P', 'P', 'N', 'G', 'I', 'A', 'L' },
        { 'K', 'V', 'L', 'R', 'R', 'K', 'D', 'G', 'B', 'M', 'Z', 'Č', 'K', 'I', 'O' },
        { 'P', 'H', 'G', 'B', 'A', 'I', 'F', 'C', 'J', 'Č', 'G', 'D', 'H', 'S', 'E' },
        { 'E', 'Ž', 'A', 'L', 'Z', 'H', 'Ž', 'U', 'U', 'Č', 'I', 'E', 'N', 'G', 'Š' },
        { 'M', 'M', 'T', 'E', 'S', 'A', 'U', 'K', 'Š', 'Š', 'U', 'K', 'V', 'E', 'C' },
        { 'E', 'H', 'F', 'M', 'E', 'Ž', 'G', 'C', 'A', 'N', 'T', 'S', 'T', 'A', 'G' },
        { 'B', 'E', 'S', 'K', 'R', 'B', 'O', 'V', 'N', 'K', 'C', 'O', 'D', 'Š', 'F' },
        { 'L', 'A', 'C', 'Š', 'K', 'J', 'C', 'F', 'A', 'L', 'M', 'Z', 'Z', 'I', 'I' },
        { 'J', 'B', 'Č', 'T', 'Š', 'A', 'B', 'F', 'U', 'L', 'J', 'L', 'F', 'G', 'H' },
        { 'V', 'A', 'I', 'D', 'R', 'T', 'S', 'I', 'R', 'O', 'K', 'V', 'C', 'S', 'M' },
        { 'L', 'F', 'N', 'H', 'F', 'J', 'R', 'O', 'A', 'J', 'M', 'O', 'U', 'G', 'I' },
        { 'B', 'C', 'T', 'H', 'Ž', 'T', 'A', 'H', 'C', 'D', 'G', 'G', 'R', 'M', 'L' },
        { 'K', 'Č', 'L', 'R', 'F', 'Š', 'V', 'F', 'Z', 'Ž', 'G', 'Z', 'N', 'U', 'C' },
    };
    String besede[] = { "vrt", "nit", "korist", "urok", "tri", "skrb", "harfa", "vokal", "kres" };
    int stevec = 0;
    for (int i = 0; i < besede.length; i++) { //beseda
      for (int j = 0; j < poljeCrk.length; j++) { //stolpec
        for (int k = 0; k < poljeCrk[0].length; k++) { //vrstica

          if (poljeCrk[j][k] == besede[i].toUpperCase().charAt(0)) {
            for (int l = 1; l < besede[i].length(); l++) { //črke besede
              if (j >= 0 && k >= 0 && j < poljeCrk.length - l && k < poljeCrk[0].length - l) {
                if ((poljeCrk[j + l][k] == besede[i].toUpperCase().charAt(l)
                    || poljeCrk[j][k + l] == besede[i].toUpperCase().charAt(l))) {
                  stevec++;
                } else
                  break;

              }

            }
          }
          if (stevec == besede[i].length()) {
            System.out.println(besede);
          }
          stevec = 0;
        }
      }
    }
  }
}

/*
for (int i = 0; i < poljeCrk.length; i++) {
  for (int j = 0; j < poljeCrk[0].length - 1; j++) {

    if (poljeCrk[i][j] == besede[a].toUpperCase().charAt(0)) {

      if (i >= 0 && j >= 0 && i < poljeCrk.length - 1 && j < poljeCrk[0].length - 1) {
        if (poljeCrk[i + 1][j] == besede[a].toUpperCase().charAt(1)
            || poljeCrk[i][j + 1] == besede[a].toUpperCase().charAt(1)) {
          System.out.println("aaaaaaa");

          if (i >= 0 && j >= 0 && i < poljeCrk.length - 2 && j < poljeCrk[0].length - 2) {
            if (poljeCrk[i + 2][j] == besede[a].toUpperCase().charAt(2)
                || poljeCrk[i][j + 2] == besede[a].toUpperCase().charAt(2)) {
              System.out.println("bbbbbbb");
            }
          }
        }
      }

    }
  }
} 
*/
