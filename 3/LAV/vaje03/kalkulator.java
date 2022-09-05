package vaje03;

import java.util.Scanner;

public class kalkulator {

	public static void main(String[] args) {

		char operator;
		Double num1, num2, rez;

		Scanner vnos = new Scanner(System.in);

		System.out.println("Izberi operator: +, -, *, or /");
		operator = vnos.next().charAt(0);

		System.out.println("Vnesi prvo številko");
		num1 = vnos.nextDouble();

		System.out.println("Vnesi drugo številko");
		num2 = vnos.nextDouble();

		switch (operator) {

			case '+' :
				rez = num1 + num2;
				System.out.println(num1 + " + " + num2 + " = " + rez);
				break;

			case '-' :
				rez = num1 - num2;
				System.out.println(num1 + " - " + num2 + " = " + rez);
				break;

			case '*' :
				rez = num1 * num2;
				System.out.println(num1 + " * " + num2 + " = " + rez);
				break;

			case '/' :
				rez = num1 / num2;
				System.out.println(num1 + " / " + num2 + " = " + rez);
				break;

			default :
				System.out.println("Kalkulator podpira samo operatorje +, -, *, /");
				break;
		}
    vnos.close();

	}

}
