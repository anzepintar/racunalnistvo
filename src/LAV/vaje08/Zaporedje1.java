package LAV.vaje08;

import java.util.Scanner;

public class Zaporedje1 {

  public static void main(String[] args) {
    Scanner vnos = new Scanner(System.in);
    System.out.println("Vpiši število:");
    int num = vnos.nextInt();
    vnos.close();
    while (num > 1) {
      if (num % 2 == 0)
        num /= 2;
      else
        num = num * 3 + 1;
      System.out.println(num);
    }
    

  }

}
