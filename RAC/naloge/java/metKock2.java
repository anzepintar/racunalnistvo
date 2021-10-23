package naloge;

public class metKock2 {

	public static void main(String[] args) {
		int t1 = (int) (Math.random() * 6 + 1);
		int t2 = (int) (Math.random() * 6 + 1);

		String p0n, pnn, p1l, p1c, p1r, p2n, a1, a2, a3, b1, b2, b3;
		pnn = "  -------  ";
		p0n = " |       | ";
		p1l = " | *     | "; // left
		p1c = " |   *   | "; // center
		p1r = " |     * | "; // right
		p2n = " | *   * | ";

		switch (t1) {
		case 1:
			a1 = p0n;
			a2 = p1c;
			a3 = p0n;
			break;
		case 2:
			a1 = p1l;
			a2 = p0n;
			a3 = p1r;
			break;
		case 3:
			a1 = p1l;
			a2 = p1c;
			a3 = p1r;
			break;
		case 4:
			a1 = p2n;
			a2 = p0n;
			a3 = p2n;
			break;
		case 5:
			a1 = p2n;
			a2 = p1c;
			a3 = p2n;
			break;
		default:
			a1 = p2n;
			a2 = p2n;
			a3 = p2n;
		}

		switch (t2) {
		case 1:
			b1 = p0n;
			b2 = p1c;
			b3 = p0n;
			break;
		case 2:
			b1 = p1l;
			b2 = p0n;
			b3 = p1r;
			break;
		case 3:
			b1 = p1l;
			b2 = p1c;
			b3 = p1r;
			break;
		case 4:
			b1 = p2n;
			b2 = p0n;
			b3 = p2n;
			break;
		case 5:
			b1 = p2n;
			b2 = p1c;
			b3 = p2n;
			break;
		default:
			b1 = p2n;
			b2 = p2n;
			b3 = p2n;
		}

		System.out.println(pnn + pnn + "\n" + a1 + b1 + "\n" + a2 + b2 + "\n" + a3 + b3 + "\n" + pnn + pnn);

	}

}
