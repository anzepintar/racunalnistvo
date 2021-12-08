package sola;

import java.util.Scanner;

public class Zaporedje1 {

	public static void main(String[] args) {
		Scanner vnos = new Scanner(System.in);
		System.out.println("Vpiši število:");
		int num = vnos.nextInt();
		while (num>1){
			if(num%2==0)
				num/=2;
			else
				num=num*3+1;
			System.out.println(num);
		}
		System.out.println(num);
		vnos.close();
		
		

	}

}
