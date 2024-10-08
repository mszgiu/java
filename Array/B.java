
public class Exemplo_Array {

	public static void main(String[] args) {

		// 1. Declaração de um array de inteiros
		int[] numeros;

		// 2. inicialização de um array com tamanho fixo
		numeros = new int[5]; // array de 5 posiçoes

		// 3. Atribuiçãp de valores aos elementos do array
		numeros[0] = 10;
		numeros[1] = 20;
		numeros[2] = 30;
		numeros[3] = 40;
		numeros[4] = 50;

		// 4. Acesso e impressão dos valores do array - length é o comprimento do array numeros
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Elementos na posição " + i + ": " + numeros[i]);
		}

		// como acessar uma posição específica do array de inteiros em java?
		int primeiro_elemento = numeros[0];
		System.out.println("Primeiro elemento: " + primeiro_elemento);

		// 5. Inicialização de um array com valores diretamente
		String[] nomes = { "Ana", "Bruno", "Carlos", "Diana" };

		// como acessar uma posição específica do array de string em java
		String terceiro_elemento = nomes[3];
		System.out.println("Terceiro elemento: " + terceiro_elemento);

		// 6. Acesso e impressão dos valores do array de strings
		for (String nome : nomes) {
			System.out.println("Nome: " + nome);
			
		}
	}
}
