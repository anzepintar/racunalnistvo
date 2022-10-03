package vaje03;

public class ArithmeticExceptionIzjema {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      int n = (int) Math.round(Math.random() * 1);
      try {
        int a = 1 / n;
        System.out.println(a);
      } catch (ArithmeticException a) {
        System.out.println("deljenje z 0");
      }
    }

  }
}
