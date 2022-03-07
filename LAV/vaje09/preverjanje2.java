package vaje09;

public class preverjanje2 {

	public static void main(String[] args) {
		int m1, m2, m3, m4, m5, m6;
		m1 = m2 = m3 = m4 = m5 = m6 = 0;
		for (int i = 0; i < 1000; i++) {
			int st = (int) Math.ceil(Math.random() * 6);
switch(st){
	case 1: m1++; break;
	case 2: m2++; break;
	case 3: m3++; break;
	case 4: m4++; break;
	case 5: m5++; break;
	case 6: m6++; break;
}

		}
		System.out.println("1 = " + m1 + "\n2 = " + m2 + "\n3 = " + m3 + "\n4 = " + m4 + "\n5 = " + m5 + "\n6 = " + m6);
	}

}
