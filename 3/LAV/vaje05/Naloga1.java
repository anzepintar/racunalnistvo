package vaje05;

import java.util.Scanner;

public class Naloga1 {

	public static void main(String[] args) {
		Scanner vnos = new Scanner(System.in);

		System.out.println("Vnesi spol (M|Z):");
		char c1 = vnos.nextLine().charAt(0);

		System.out.println("Vnesi majhno število:");
		byte b1 = vnos.nextByte();

		System.out.println("Vnesi celo število:");
		int i1 = vnos.nextInt();

		System.out.println("Vnesi dolgo celo število:");
		long l1 = vnos.nextLong();

		System.out.println("Vnesi decimalno število:");
		float f1 = vnos.nextFloat();

		System.out.println("Vnesi dolgo decimalno število:");
		double d1 = vnos.nextDouble();

		System.out.println("Vnesi (true|false) število:");
		boolean bo1 = vnos.nextBoolean();

		System.out.println("Podpiši se:");
		String s1 = vnos.nextLine();
		vnos.next();
		System.out.println(c1 + " " + b1 + " " + i1 + " " + l1 + " " + f1 + " " + d1 + " " + bo1 + " " + s1);
		vnos.close();

	}

}
