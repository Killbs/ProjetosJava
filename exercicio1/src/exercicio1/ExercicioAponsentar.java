package exercicio1;

import java.util.Scanner;

public class ExercicioAponsentar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a Idade: ");
		Integer Idade = scanner.nextInt();
		
		System.out.print("Digite o tempo de Contribui��o: ");
		Integer tempoContribuicao = scanner.nextInt();
		
		Boolean Aposentar = Idade >= 55 && tempoContribuicao >=25;
		Integer tempoAposentar = 25 - tempoContribuicao;
		
		if (Aposentar) {
			System.out.print("Pode apnsentar");
		} else {
			System.out.print("N�o pode aposentar, falta: " + tempoAposentar + " Anos");
		}
		
		scanner.close();

	}

}
