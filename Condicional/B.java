// Desenvolvido por Bruna Felix e Giulia Marques - 09/09/2024
//Criando uma calculadora simples
import java.util.Scanner;

public class Calculadora_Simples {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double n1;
		double n2;
		double result;
		char operador;

		System.out.println("===Calculadora Simples===");
		System.out.println("Escolha uma operaçao basica");
		System.out.println("Escolha um operador aritimetico(+,-,*,/).");
		 operador = scanner.next().charAt(0);

		System.out.println("Digite o primeiro numero: ");
		n1 = scanner.nextDouble();
		System.out.println("Digite o segundo numero: ");
		n2 = scanner.nextDouble();

		switch(operador) {
		
		case '+':
			result = n1 + n2;
			System.out.println("Resultado da soma é: "+ result);
			break;
		case '-':
			result = n1 - n2;
			System.out.println("Resultado da subtração é: " + result);
			break;
		case '*':
			result = n1 * n2;
			System.out.println("Resultado da Multiplicação é: " + result);
			break;
		case '/':
		 if(n2 != 0) {
				result = n1 - n2;
				System.out.println("Resultado da Divisão é: "+ result);
				break;
		 }
		 else {
			 System.out.println("Divião por 0 não é permitida");
		 }
		 break;
		 default:
			 System.out.println("operação invalida!");
		}
		scanner.close();

	}

}
