package naloge;

public class cosinus {

	public static void main(String[] args) {
		double kot, m, f, cos1;
		kot = Math.PI / 3;
		f = 1;
		cos1 = 0;
		for (int n = 0; n <= 5; n++) {
			m = 2 * n;
			for (int k = 1; k <= m; k++) {
				f *= k;
			}
			double tmp = (Math.pow(-1, n) / f) * Math.pow(kot, m);
			cos1 += tmp;
		}
		System.out.println(cos1);
		System.out.println(Math.cos(kot));

	}

}
