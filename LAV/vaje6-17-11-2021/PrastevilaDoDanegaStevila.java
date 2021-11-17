import java.util.Scanner;

class PrastevilaDoDanegaStevila {
	public static void main(String args[]) {
		int stPrastevil;
		int stevilo = 2;
		boolean je = true;
		Scanner vnos = new Scanner(System.in);
		System.out.println("Vnesi število:");
		stPrastevil = vnos.nextInt();
		if (stPrastevil >= 1) {
			System.out.println("Prvih " + stPrastevil + " praštevil je:");

		} else {
			System.out.println("Vnesi naravno število (število>=1)");
		}

		for (int i = 2; i <= stPrastevil+1;) {
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
