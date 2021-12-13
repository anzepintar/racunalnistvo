package LAV.vaje07;



public class ProduktNenicelnihStevk {

	public static void main(String[] args) {
		int n = 100203;
		int produkt = 1;
		while(n>0)
		{
			int zadnja = n % 10;
			zadnja = zadnja + produkt;
		}
	}

}
