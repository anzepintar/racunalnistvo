package LAV.vaje10;

public class naloga6 {
  public static void main(String[] args) {
    int tab[] = { 2, 21, 3, 4, -5, 6, 7, 0, };
    int m = tab[0];
    for (int i = 0; i < tab.length; i++) {
      if(tab[i]<m)
        m=tab[i];
    }
    System.out.println(m);
  }
}
