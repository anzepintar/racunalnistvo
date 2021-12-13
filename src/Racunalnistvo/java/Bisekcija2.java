package Racunalnistvo.java;

public class Bisekcija2 {

	public static void main(String[] args) {
		double sp_meja = 0;
		double zg_meja = 1;
		double x = 0, y = 1;
		while (Math.abs(y) > 0.000001) {
			x = (sp_meja + zg_meja)/2;
			y = 2*x - Math.cos(x) + Math.sin(2*x);
			if(y>0)
				zg_meja = x;
			else
				sp_meja = x;
		}
		System.out.println("Ničla funkcije je pri x = " + x);
	}

}
