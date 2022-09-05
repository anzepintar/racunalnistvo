package vaje07;

public class PrfektnaStevila {

	public static void main(String[] args) {
		// vsota deljiteljev(razen samegasebe) je enaka številu( 28 = 1+2+4+7+14)
		int zgmeja = 10000;
		int spmeja = 1000;
		int vsota = 0;
		for (int i = spmeja; i <= zgmeja; i++) {
			vsota = 0;
			for (int j = 1; j <= Math.sqrt(i); j++) {
				if (i % j == 0)
					vsota += j;
				System.out.println(j);

				if (vsota == i)
					System.out.println(vsota);
			}

		}
	}

}
