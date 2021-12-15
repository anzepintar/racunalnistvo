package LAV.vaje09;

import java.util.Scanner;

public class preverjanje1 {

	public static void main(String[] args) {
		Scanner vnos = new Scanner(System.in);
		System.out.println("Vpiši uro odhoda:");
		int ura = vnos.nextInt();
		System.out.println("Vpiši minuto odhoda:");
		int min = vnos.nextInt();
		System.out.println("Vpiši trajanje vožnje:");
		int cas = vnos.nextInt();
		vnos.close();
		int n = ura*60+min+cas;
		int prihodH=(n/60)%24;
		int prihodM=n%60;
		System.out.println("Čas prihoda:\n" + prihodH + ":" + prihodM);
		
	}

}
