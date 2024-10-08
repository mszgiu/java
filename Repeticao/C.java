//desenvolvido por Giulia Marques - 23/09/24
//Codigo criado para mostrar o numero, o quadrado do numero e o cubo do numero
import java.util.Scanner;

public class Exe_05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num;
		int quadrado;
		int cubo;

		System.out.println("Digite um numero: ");
		num = scanner.nextInt();

		for (int i = 1; i <= num; i++) {
			quadrado = i * i;
			cubo = i * i * i;
			System.out.printf("%d %d %d%n", i, quadrado, cubo);
		}

	}

}
