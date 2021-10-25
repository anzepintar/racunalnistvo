import java.util.Scanner;

class palindrom {
	public static void main(String args[]) {
		String num, obr;
		num = obr = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Vnesi številko");
		num = in.nextLine();
		
		int length = num.length();
		for (int dol = length - 1; dol >= 0; dol--) //obrne string
			obr = obr + num.charAt(dol);
		
		if (num.equals(obr)) //primerja osnoven in obrnjen string, uporabi .equals da primerja stringe
			System.out.println("Je palindrom");
		else
			System.out.println("Ni palindrom");
		in.close();
	}
}
