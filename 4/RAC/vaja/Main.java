package vaja;

public class Main {
  public static void main(String[] args) {
    System.out.println(f(1));
    int z=3/0;
    System.out.println(z);
  }

  static int f(int n) {
    int i = 1;
    if (n >= 5)
      return n;
    n = n + i;
    i++;
    return f(n);
  }
}
