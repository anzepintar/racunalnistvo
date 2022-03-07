package vaje08;

public class Misi {
	public static void main(String[] args) {
		int misi = 1111111;
		int stmack;
		for (stmack = 2; stmack < misi; stmack++) {
			if (misi % stmack == 0) {
				System.out.println(
						"Število miši: " + (misi / stmack) + " Število mačk: " + stmack);
				break;
			}

		}

	}

}
