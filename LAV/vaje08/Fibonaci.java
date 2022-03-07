package vaje08;

import java.util.Scanner;

public class Fibonaci {

	public static void main(String[] args) {
		Scanner vnos = new Scanner(System.in);
		System.out.println("Vnesi število:");

		int num = vnos.nextInt(), a = 0, b = 1, temp;
		System.out.println("0\n1");
		for (int i = 0; i < num - 2; ++i) {
			temp = a + b;
			System.out.println(temp);
			a = b;
			b = temp;
		}
		vnos.close();

	}
}
