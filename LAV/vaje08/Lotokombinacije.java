package vaje08;

public class Lotokombinacije {

	public static void main(String[] args) {
		for (int i = 1; i <= 33; i++)
			for (int j = i + 1; j <= 34; j++)
				for (int k = j + 1; k <= 35; k++)
					for (int l = k + 1; l <= 36; l++)
						for (int m = k + 1; m <= 37; m++)
							for (int n = m + 1; n <= 38; n++)
								for (int o = n + 1; o <= 39; o++) {
									System.out.println(i + ", " + j + ", " + k + ", " + l + ", "
											+ m + ", " + n + ", " + o + ", ");
								}

	}

}
