import java.util.Scanner;

public class Teste_Equals {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String valor;

		System.out.println("Digite bom dia, boa tarde ou boa noite: ");
		valor = scanner.nextLine();

		scanner.close();

		if (valor.equalsIgnoreCase("Boa Tarde")) {
			System.out.println("Boa tarde");
		}

		else if (valor.equalsIgnoreCase("Bom dia")) {
			System.out.println("Bom dia");
		}

		else {
			System.out.println("Boa Noite");
		}
	}

}
