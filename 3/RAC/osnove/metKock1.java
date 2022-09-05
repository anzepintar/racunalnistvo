package osnove;

public class metKock1 {

	public static void main(String[] args) {
		int vre = (int) (Math.random()*12+1);
		String a0, a1, a2, a3, a4, a5, b0, b1, b2, b3, b4, b5;
		a0 = a1 = a2 = a3 = a4 = a5 = b0 = b1 = b2 = b3 = b4 = b5 = " ";
		switch (vre) {
		case 2: a0 = b0 = "*"; break;
		case 3: a0 = b0 = a1 = "*"; break;
		case 4: a0 = b0 = a1 = b1 = "*"; break;
		case 5: a0 = b0 = a1 = b1 = a2 = "*"; break;
		case 6: a0 = b0 = a1 = b1 = a2 = b2 = "*"; break;
		case 7: a0 = b0 = a1 = b1 = a2 = b2 = a3 = "*"; break;
		case 8: a0 = b0 = a1 = b1 = a2 = b2 = a3 = b3 = "*"; break;
		case 9: a0 = b0 = a1 = b1 = a2 = b2 = a3 = b3 = a4 = "*"; break;
		case 10: a0 = b0 = a1 = b1 = a2 = b2 = a3 = b3 = a4 = b4 = "*"; break;
		case 11: a0 = b0 = a1 = b1 = a2 = b2 = a3 = b3 = a4 = b4 = a5 = "*"; break;
		case 12: a0 = b0 = a1 = b1 = a2 = b2 = a3 = b3 = a4 = b4 = a5 = b5 =  "*"; break;
		default: System.out.println("Napaka pri naključnem metu.");
		}
		
		System.out.println(" ------- " + "   -------"
						+ "\n| " + a0 + "   " + a1 + " | " + " | " + b0 + "   " + b1 + " |"
						+ "\n| " + a2 + "   " + a3 + " | " + " | " + b2 + "   " + b3 + " |"
						+ "\n| " + a4 + "   " + a5 + " | " + " | " + b4 + "   " + b5 + " |"
						+ "\n ------- " + "   -------"
						);
		System.out.println(vre);

	}

}
