package vaje07;

public class SahovskoPolje {

	public static void main(String[] args) {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if ((i + j) % 2 == 0)
					System.out.print('B');
				else
					System.out.print('C');
			}
			System.out.println();
		}

	}

}
