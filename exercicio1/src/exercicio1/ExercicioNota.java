package exercicio1;

import java.util.Scanner;

public class ExercicioNota {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a Nota: ");
		
			Integer Nota = scanner.nextInt();
			
			if (Nota >= 7) {
				System.out.println("Aluno passou com a nota: " + Nota);
			}
			else{
				System.out.println("Aluno Reprovado com a diferen�a de nota: " + (7 - Nota));
			}
	
		scanner.close();	
	
	}

}
