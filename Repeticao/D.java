//desenvolvido por Giulia Marques - 23/09/24
//Codigo criado para fazer uma divisão e infromar que a divisão é impossivel caso o segundo numero for igual a 0
import java.util.Scanner;

public class Exe_03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = 2 ;
		int num1;
		int num2;
	
		System.out.println("Digite um numero: ");
		num1 = scanner.nextInt();
		System.out.println("Digite outro numero: ");
		num2 = scanner.nextInt();

		for (int i = 1; i < num; i++) {
			if (num2 == 0) {
				System.out.println("Divisão impossivel");
			}

			else {
				System.out.println("Resultado: " + (num1/num2) );
			}
		}
         
		scanner.close();
		
	}

}
