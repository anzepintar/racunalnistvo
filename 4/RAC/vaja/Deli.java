package vaja;

public class Deli {
  public static void main(String[] args) {
    deli(0,3);
  }
  public static void deli(int a, int b) {
    try {
      int c = a/b;
      System.out.println(c);
    }
    catch (Exception e)
    {
      System.out.println("Izjema");
    }
    
  }
}
