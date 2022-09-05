package vaje08;

public class Sinus {

	public static void main(String[] args) {
		int max = 10;
		int deg = 45;
		double rad = Math.toRadians(deg);
		double sin = 0;
		for (int n = 0; n < max; n++) {
			double fac = 1;
			for (int j = 1; j <= (2 * n + 1); j++)
				fac *= j;
			sin += (Math.pow(-1.0, n) / fac) * Math.pow(rad, 2 * n + 1);
			System.out.println(sin);
		}

	}

}
