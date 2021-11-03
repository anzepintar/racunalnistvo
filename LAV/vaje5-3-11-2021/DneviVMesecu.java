package sola;

public class DneviVMesecu {

	public static void main(String[] args) {
		String mesec = "februar";
		mesec = mesec.toLowerCase();
		int leto = 2000;
		int stDni = 0;
		switch (mesec) {
			case ("januar") :
				stDni = 31;
				break;
			case ("februar") :
				stDni = 28;
				break;
			case ("marec") :
				stDni = 31;
				break;
			case ("april") :
				stDni = 30;
				break;
			case ("maj") :
				stDni = 31;
				break;
			case ("junij") :
				stDni = 30;
				break;
			case ("julij") :
				stDni = 31;
				break;
			case ("avgust") :
				stDni = 31;
				break;
			case ("september") :
				stDni = 30;
				break;
			case ("oktober") :
				stDni = 31;
				break;
			case ("november") :
				stDni = 30;
				break;
			case ("december") :
				stDni = 31;
				break;
			default :
				System.out.println("ta beseda ni mesec");
		}
		if (mesec.equals("februar") && (leto % 4 == 0) && (leto % 100 != 0))
			stDni = 29;
		if (mesec.equals("februar") && leto % 400 == 0)
			stDni = 29;
		System.out.println(stDni);
	}
}
