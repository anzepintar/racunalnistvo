package LAV.vaje11;

import java.util.Random;

public class tabela2d {
  public static void main(String[] args) {

    int[][] tab = new int[30][10];
    Random r = new Random();

    //zapolnjanje tabele z random št
    for(int i=0; i<tab.length; i++) 
        for(int j = 0; j<tab[i].length; j++) 

        tab[i][j] = r.nextInt(100)+1;


        //za sodi in lihi del izpisa
        for(int i=0; i<tab.length; i++) 
        for(int j = 0; j<tab[i].length; j++)
           if(i < tab.length/2) {
                if(tab[i][j] % 2 == 1)
                   tab[i][j]++;
            } 
                else {
                    if(tab[i][j] % 2 == 0)
                      tab[i][j]++;
                }


    izpisTabele(tab);
}

public static void izpisTabele(int[][] tab) {

   //izpis tabele
   for(int i=0; i<tab.length; i++) {

       for(int j = 0; j<tab[i].length; j++) {
          if(j > tab[i].length-5)
          System.out.print(tab[i][j] + " ");
       }
       System.out.println();
    }
}
  
}
