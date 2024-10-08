//Codigo desenvolvido por Giulia Marques - 18/09/24
//Codigo criado para somar dois numeros inteiros
import java.util.Scanner;

public class Soma_Numeros_Inteiro {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num1;
		int num2;
		int soma;

		System.out.println("Digite um número: ");
		num1 = scanner.nextInt();
		System.out.println("Digite outro número: ");
		num2 = scanner.nextInt();
        
		soma = num1 + num2;
		
		scanner.close();
		
		System.out.println("A soma dos números è: " + num1 + " + " + num2 + " = " + soma);
	}

}
