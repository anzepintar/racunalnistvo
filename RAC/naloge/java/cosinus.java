package naloge;
public class cosinus {

	public static void main(String[] args) {
		double m, f, cos,
		x = Math.PI / 3,
		fakulteta = 1;
		cos = 0;
		for (int n = 0; n<6; n++) {
			m = 2 * n;
			for (int k = 1; k <= m; k++) {
				fakulteta *= k;
			}
			cos += (Math.pow(-1, n) / fakulteta) * Math.pow(x, m);
		}
		System.out.println(cos);


	}

}
