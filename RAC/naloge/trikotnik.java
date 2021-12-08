package naloge;
import java.util.Scanner;

class trikotnik {
  public static void main(String[] args) {
    Scanner vnos = new Scanner(System.in);
    System.out.println("Vnesi a"); 
    Float a = vnos.nextFloat();
    System.out.println("Vnesi b"); 
    Float b = vnos.nextFloat();
    Double c = Math.sqrt(a*a+b*b);
    Double alfa = Math.acos((c*c + a*a - b*b)/(2*c*a));
    alfa = alfa*57.2957795;
    Double beta = Math.acos((c*c + b*b - a*a)/(2*c*b));
    beta = beta*57.2957795;
    Double square = a*b/2.0;
    System.out.println(
    "a =" + a +
    " \nb =" + b +
    " \nc =" + c +
    " \nalfa =" + alfa +
    " \nbeta =" + beta +
    " \nploščina =" + square 
    );
		vnos.close();
  }
}
