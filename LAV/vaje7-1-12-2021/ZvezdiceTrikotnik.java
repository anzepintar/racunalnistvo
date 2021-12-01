package sola;

import java.util.Scanner;

public class ZvezdiceTrikotnik {
	public static void main(String[] args) {
		
		Scanner vnos = new Scanner(System.in);
		System.out.println("Vnesi število zvezdic:");
		
		int n = vnos.nextInt();
		for (int i = 0; i < n; i++) {
			// presledki
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			// zvezdice
			for (int j = 0; j < 2 * i + 1; j++) {
				if (j % 2 == 0)
					System.out.print("*");
				else
					System.out.print("o");
			}
			System.out.println();

		}
		vnos.close();
	}
}
