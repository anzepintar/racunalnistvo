package naloge;
public class trikotnik2 {
	public static void main(String[] args) {
		float a = 5;
		float b = 2;
		float c = 5;
		float ploscina = 0;
		
		if((a+b)>c && (a+c)>b && (b+c)>a) {
			ploscina = (float) Math.abs((a*b*Math.sin(c))/2);
			System.out.println("Trikotnik obstaja");
			System.out.println("Ploščina trikotnika je " + ploscina);
		}
		else {
			if((a+b)==c || (a+c)==b || (b+c)==a) {
				System.out.println("Trikotnik je izrojen");
			}
			else {
			System.out.println("Trikotnik ne obstaja");
			}
		}
	}

}
