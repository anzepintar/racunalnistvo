package vaje09;

public class preverjanje3 {

	public static void main(String[] args) {
		int stev = 0;
		int max = 0;
		int num = 0;

		for (int i = 100; i < 1000; i++) {
			int tmp = i;
			while (tmp > 1) {
				if (tmp % 2 == 0)
					tmp = tmp / 2;
				else
					tmp = 3 * tmp + 1;
				stev++;
			}
			if (stev > max) {
				max = stev;
				num = i;
			}
			stev = 0;
		}
		System.out.println(num);

	}

}
