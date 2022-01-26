import java.util.Random;

class minolovec {
	public static void main(String[] args) {
		int colNum = 20, rowNum = 20;
		int[][] tab = new int[colNum][rowNum];

		Random r = new Random();
		int stBomb = 20;
		for (int i = 0; i < stBomb; i++) {
			int row = r.nextInt(colNum);
			int col = r.nextInt(rowNum);
			if (tab[row][col] == 9)
				i--;
			tab[row][col] = 9;
		}
		// klic metode printTab
		printTab(tab);
	}
	// void => ne vrne ničesar
	public static void printTab(int tab[][]) {
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++)
				System.out.print(tab[i][j]);
			System.out.println();
		}
		System.out.println();
	}
}