package naloge;

public class sinus {
	public static void main(String[] args) {
		double kot, m, f, sin;
		kot = Math.PI / 3;
		f = 1;
		sin = 0;
		for (int n = 0; n < 4; n++) {
			m = 2 * n + 1;
			for (int k = 1; k <= m; k++) {
				f *= k;
			}
			sin += (Math.pow(-1, n) / f) * Math.pow(kot, m);
			
		}
		System.out.println(sin);
		System.out.println(Math.sin(kot));

	}

}
