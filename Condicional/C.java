//Codigo criado para mostrar o IMC de uma pessoa
import java.util.Scanner;
public class Calc_IMC {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("A seguir digite seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.println("Digite seu sexo: (M) masculino (F) feminino ");
		char sexo = scanner.next().charAt(0);
		
		System.out.println("Digite a sua idade: ");
		int idade = scanner.nextInt();
		
		System.out.println("Digite seu peso: ");
		double peso = scanner.nextDouble();
		
		System.out.println("Digite sua altura: ");
		double altura = scanner.nextDouble();
		
		double imc = (peso / altura);
		
		if(imc <= 18.5) {
			System.out.println("Você está abaixo do peso" + "IMC:" + imc);
	}
	
	else if(imc >= 18.6 && imc <= 24.9) {
		System.out.println("Peso ideal (Parabéns)" + "IMC:" + imc);
	}
		
	else if(imc >= 25 && imc <= 29.9) {
		System.out.println("Levemente acima do peso " + "IMC:" + imc );
	}
		
	else if(imc >= 30 && imc <= 34.9) {
		System.out.println(" Obesidade Grau I " + "IMC:" + imc );
	}
	
	else if(imc >= 35 && imc <= 39.9) {
		System.out.println(" Obesidade Grau II " + "IMC:" + imc);
	}
	
	else if (imc > 40){
		System.out.println(" Obesidade Grau III (Mórbida) " + "IMC:" + imc);
	}
		scanner.close();
		
}
	}
