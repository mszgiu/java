//desenvolvido por Giulia Marques - 23/09/24
import java.util.Scanner;

public class Exe_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = 0 ;

		if (num <= 1 || num >= 1000) {

			System.out.println("Digite um numero de 1 a 1000: ");
			num = scanner.nextInt();

			for (int i = 1; i <= num; i++) {

				if (i % 2 != 0) {
					System.out.println(i);
				}
			}
			scanner.close();
		}
	}
}
