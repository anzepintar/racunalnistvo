package LAV.vaje10;

import java.util.Scanner;

public class naloga9 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Vnesite število:");
    int num = input.nextInt();
    input.close();
    
    for (int i = 0; i < num; i++) {
      int number = 1;
      System.out.printf("%" + (num - i) * 2 + "s", "");
      for (int j = 0; j <= i; j++) {
        System.out.printf("%4d", number);
        number = number * (i - j) / (j + 1);

      }
      System.out.println();
    }
  }
}
