package naloge;

public class sinus {
	public static void main(String[] args) {
		double kot, m, f, sin1;
		kot = Math.PI / 3;
		f = 1;
		sin1 = 0;
		for (int n = 0; n <= 5; n++) {
			m = 2 * n + 1;
			for (int k = 1; k <= m; k++) {
				f *= k;
			}
			double tmp = (Math.pow(-1, n) / f) * Math.pow(kot, m);
			sin1 += tmp;
		}
		System.out.println(sin1);
		System.out.println(Math.sin(kot));

	}

}
