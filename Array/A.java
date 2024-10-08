import java.util.Scanner;

public class Teste_de_Ansiedade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] perguntas = { "1. Você se sente com dificuldade de concentração?",
				"2. Você se sente cansado facilmente?", "3. Tem dificuldade em adormecer ou permanecer a dormir?",
				"4. Você se preocupa muito com o futuro?", "5. Tem dificuldade em relaxar?",
				"6. Sentiu-se tão preocupado que foi difícil ficar parado?",
				"7. Sentiu-se facilmente irritável ou chateado?",
				"8. Sentiu medo como se algo muito ruim fosse acontecer",
				"9. Você se preocupa com a opinião dos outros?",
				"10. Você está com dificuldade em lembrar de detalhes?" };

		int respostas_sim = 0;

		System.out.println("Responda as perguntas com sim ou não.");
		for (String pergunta : perguntas) {
			System.out.println(pergunta + ":");
			String respostas = scanner.nextLine();

			if (respostas.equals("sim")) {
				respostas_sim++;
			}

		}

		if (respostas_sim <= 7) {
			System.out.println("Você possui fortes indícios de ansiedade, faça terapia!");
		} else if (respostas_sim == 5 || respostas_sim == 6) {
			System.out.println("Você precisa cuidar do corpo e da mente, procure orientação medica");
		} else {
			System.out.println("Você está aparentemente bem e sem riscos de ansiedade.");
		}
	}

}
