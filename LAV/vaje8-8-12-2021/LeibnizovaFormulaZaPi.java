

public class LeibnizovaFormulaZaPi {

	public static void main(String[] args) {
		double pi = 0;
		
		for(int i = 1;i<500;i++){
			pi+= Math.pow(-2, i) / (2*i+1);
			
		}
		System.out.println("Pi =" + pi);

	}

}
