package Racunalnistvo.java.osnove;
import java.util.Scanner;

public class diagonala {
	public static void main(String[] args) {
		Scanner vnos = new Scanner(System.in);
		System.out.println("Vnesi velikost televizije v colah:"); 
		float diag = vnos.nextFloat();
		float a = diag*2.54f/100;
		int m = (int) a;
		float b = (a-m)*10;
		int dm = (int) b;
		float c = (b-dm)*10;
		int cm = (int) c;
		float d = (c-cm)*10;
		int mm = (int) d;
		System.out.println("Diagonala televizije je: " + m + " m, " + dm + " dm, " + cm +  " cm in " + mm + " mm ");
		vnos.close();
	}
}
