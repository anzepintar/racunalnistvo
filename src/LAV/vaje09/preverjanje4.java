package LAV.vaje09;

import java.util.Scanner;

public class preverjanje4 {

	public static void main(String[] args) {
		Scanner vnos = new Scanner(System.in);
		System.out.println("Vnesite poljubno naravno število");
		int num = vnos.nextInt();
		vnos.close();

		for (int i = 0; i < num; i++) {
			if (i == 0 || i == num - 1) {
				for (int j = 0; j < num; j++)
					System.out.print("*");
			} else {
				for (int j = 0; j < num; j++) {
					if (j == 0 || j == num - 1)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
