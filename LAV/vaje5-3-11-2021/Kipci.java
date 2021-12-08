

public class Kipci {

	public static void main(String[] args) {
		int kipec1, kipec2, kipec3, s12, s13, s23;
		kipec1 = 5;
		kipec2 = 3;
		kipec3 = 3;
		s12 = kipec1 + kipec2;
		s13 = kipec1 + kipec3;
		s23 = kipec2 + kipec3;
		if (s12 > s13 && s12 > s23) {
			System.out.println("Vzamemo kipec1 in kipec2");
		} else if (s13 > s12 && s13 > s23) {
			System.out.println("Vzamemo kipec1 in kipec3");
		} else if (s23 > s12 && s23 > s13){
			System.out.println("Vzamemo kipec2 in kipec3");
		} else {
			System.out.println("Dva manjvredna kipca imata enako vrednost.");
		}
		
	}

}
