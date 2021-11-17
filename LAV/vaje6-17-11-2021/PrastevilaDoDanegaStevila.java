package sola;

import java.util.Scanner;

class PrastevilaDoDanegaStevila {
	public static void main(String args[]) {
		int stPrastevil;
		boolean je = true;
		int stevilo = 3;
		Scanner vnos = new Scanner(System.in);
		System.out.println("Vnesi število:");
		stPrastevil = vnos.nextInt();
		if (stPrastevil >= 1) {
			System.out.println("Prvih " + stPrastevil + " praštevil je:");
			System.out.println(2);

		} else {
			System.out.println("Vnesi naravno število (število>=1)");
		}

		for (int i = 2; i <= stPrastevil;) {
			for (int j = 2; j <= Math.sqrt(stevilo); j++) {
				if (stevilo % j == 0) {
					je = false;
					break;
				}
			}
			if (je) {
				System.out.println(stevilo);
				i++;
			}
			je = true;
			stevilo++;
		}
		vnos.close();
	}
}
