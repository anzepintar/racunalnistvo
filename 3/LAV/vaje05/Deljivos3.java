package vaje05;

public class Deljivos3 {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("---------------------");

		int k = 0;
		while (k < 100) {
			if (k % 3 == 0) {
				System.out.println(k);
			}
			k++;
		}
	}

}
