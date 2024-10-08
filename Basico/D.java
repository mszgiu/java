//Codigo desenvolvido por Giulia Marques - 18/09/24
import java.util.Scanner;

public class Codigo_Peça {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int quantidade1;
		int codigo1;
		double valoru1;
		int quantidade2;
		int codigo2;
		double valoru2;
		double precot;

		System.out.println("Digite o codigo da 1º peça: ");
		codigo1 = scanner.nextInt();
		System.out.println("Digite a quantidade que está levando da 1º peça: ");
		quantidade1 = scanner.nextInt();
		System.out.println("Digite o valor unitario da 1º peça: ");
		valoru1 = scanner.nextDouble();

		System.out.println("Digite o codigo da 2º peça: ");
		codigo2 = scanner.nextInt();
		System.out.println("Digite a quantidade que está levando da 2º peça: ");
		quantidade2 = scanner.nextInt();
		System.out.println("Digite o valor unitario da 2º peça: ");
		valoru2 = scanner.nextDouble();

		precot = quantidade1 * valoru1 + quantidade2 * valoru2;

		scanner.close();

		System.out.println("Valor a ser pago: R$" + precot);

	}

}
