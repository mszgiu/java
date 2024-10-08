//desenvolvido por Giulia Marques - 23/09/24
//Codigo desenvolvido para ler x numeros e informar quais numeros são maiores que 10 e menores que 20
import java.util.Scanner;

public class Exe_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = 0;
	
		System.out.println("Digite a quantidade de numeros que deseja ler:");
		num = scanner.nextInt();

		int dentro = 0;
		int fora = 0;
	
		for (int i = 1; i <= num; i++) {
			System.out.print("Digite o valor " + i + ":");
			int X = scanner.nextInt();

			if (X >= 10 && X <= 20) {
				dentro++;
			} else {
				fora++;
			}
		}

		System.out.println("Dentro: " + dentro);
		System.out.println("Fora: " + fora);
	}

	}


