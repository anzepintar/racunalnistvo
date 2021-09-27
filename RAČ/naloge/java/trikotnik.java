import java.util.Scanner;

class trikotnik {
  public static void main(String[] args) {
    float a = 10.0f;
    float b = 10.0f;
    Scanner vnos = new Scanner(System.in);
    System.out.println("Vnesi A"); 
    Float A = vnos.nextFloat();
    System.out.println("Vnesi B"); 
    Float B = vnos.nextFloat();
    Double C = Math.sqrt(A*A+B*B);
    Double alfa = Math.acos((C*C + A*A - B*B)/(2*C*A));
    alfa = alfa*57.2957795;
    Double beta = Math.acos((C*C + B*B - A*A)/(2*C*B));
    beta = beta*57.2957795;
	Double square = A*B/2.0;
    System.out.println(
    "A =" + A +
    " \nB =" + B +
    " \nC =" + C +
    " \nalfa =" + alfa +
    " \nbeta =" + beta +
    " \nploščina =" + square 
    );
  }
}
