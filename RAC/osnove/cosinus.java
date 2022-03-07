package osnove;

public class cosinus {

	public static void main(String[] args) {
		double m, cos,
				kot = Math.PI / 3,
				fakulteta = 1;
		cos = 0;
		for (int n = 0; n < 5; n++) {
			m = 2 * n;
			for (int k = 1; k <= m; k++) {
				fakulteta *= k;
			}
			cos += (Math.pow(-1, n) / fakulteta) * Math.pow(kot, m);
		}
		System.out.println(cos);
		System.out.println(Math.cos(kot));
	}
}
