package LAV.vaje05;


/*Sestavi program Stirimestno, ki bo prebral štirimestno naravno število. Nato naj zamenja prvo in
zadnjo števko, drugo in tretjo pa kvadrira in ohrani samo enice kvadrata. Na koncu naj izpiše dobljeno
število.*/
import java.util.Scanner;

public class Stirimestno {

	public static void main(String[] args) {
		Scanner vnos = new Scanner(System.in);
		System.out.println("Vpiši celo število");
		int num1 = vnos.nextInt();
		
		int enica = num1 % 10;
		int desetica = (num1-enica) % 100;
		int stotica = (num1-desetica) % 1000;
		int tisocica = (num1-stotica) % 10000;
		
		int kvadratStotice = ((stotica/100)*(stotica/100)) % 10;
		int kvadratDesetice = ((desetica/10)*(desetica/10)) % 10;
		
		System.out.println(enica*1000+kvadratStotice*100+kvadratDesetice*10+tisocica/1000);
    vnos.close();
  }

}
