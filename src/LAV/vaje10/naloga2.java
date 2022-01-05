package LAV.vaje10;

class naloga2{

  public static void main(String[] args){
    int tab[] = new int[15];
    for(int i = 0; i<tab.length; i++){
      if(i%2==1)
        tab[i]++;
    }
    for(int j = 0; j<tab.length; j++)
      System.out.print(tab[j]);

  }
}