//Codigo desenvolvido por Giulia Marques - 18/09/24
//Codigo criado para mostrar a diferença do produto
import java.util.Scanner;

public class Diferença_Produto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int valora;
		int valorb;
		int valorc;
		int valord;
		int diferenca;

		System.out.println("Digite o primeiro número:");
		valora = scanner.nextInt();
		System.out.println("Digite o segundo número:");
		valorb = scanner.nextInt();
		System.out.println("Digite o terceiro número:");
		valorc = scanner.nextInt();
		System.out.println("Digite o quarto número:");
		valord = scanner.nextInt();

		diferenca = (valora * valorb - valorc * valord);

		scanner.close();

		System.out.println("A diferença dos produtos é: " + diferenca);
	}

}
