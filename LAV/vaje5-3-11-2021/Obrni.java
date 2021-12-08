
/*Sestavi program Obrni, ki bo obrnil dano štirimestno naravno število. Iz števila 1234 mora sestaviti
število 4321. Obrnjeno število tudi izpiši.*/
import java.util.Scanner;

public class Obrni {
	public static void main(String[] args) {
		Scanner vnos = new Scanner(System.in);
		System.out.println("Vpiši celo število");
		int num1 = vnos.nextInt();
		int obr = 0;
		obr += (num1 % 10) * 1000;
		num1 = num1 / 10;

		obr += (num1 % 10) * 100;
		num1 = num1 / 10;

		obr += (num1 % 10) * 10;
		num1 = num1 / 10;

		obr += (num1 % 10) * 1;
		num1 = num1 / 10;

		System.out.println(obr);
    vnos.close();
	}
}
