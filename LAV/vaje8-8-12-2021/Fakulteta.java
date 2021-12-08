package sola;

public class Fakulteta {

	public static void main(String[] args) {
		int max = 10;
		int deg = 45;
		double rad = Math.toRadians(deg);
		double sin = 0;
		for (int n = 0; n < max; n++) {
			sin += (Math.pow(-1.0, n) / fac(2 * n + 1)) * Math.pow(rad, 2 * n + 1);
		}
		System.out.println(sin);
	}
	
	//funkicja fac
	public static int fac(int n) {
		int fakt = 1;
		for (int i = 1; i <= n; i++)
			fakt *= i;
		return fakt;
	}

}
