package LAV.vaje14;

public class naloga2 {
  public static void main(String[] args) {
    
    
    int[] a = new int[100];
    for (int i = 0; i < a.length; i++)
      a[i] =(int) Math.random() * 10;

    for(int i=0; i<a.length; i++)
    if (a[i] % 2 != 0)
        System.out.println(i);
  }
}
