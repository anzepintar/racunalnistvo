package osnove;

public class Bisekcija1 {

	public static void main(String[] args) {
		double sp_meja = 0;
		double zg_meja = Math.PI / 2;
		double x = 0, y = 1;
		while (Math.abs(y) > 0.000001) {
			x = (sp_meja + zg_meja) / 2;
			y = x - Math.cos(x);
			if (y > 0)
				zg_meja = x;
			else
				sp_meja = x;
		}
		System.out.println("Ničla funkcije je pri x = " + x);
	}

}