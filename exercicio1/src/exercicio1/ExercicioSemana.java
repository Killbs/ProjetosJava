package exercicio1;

import java.util.Scanner;

public class ExercicioSemana {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o dia da semana: ");
		Integer diaDasemana = scanner.nextInt();
		
		switch (diaDasemana) {
		case 1:System.out.print("Domingo");			
			break;
		case 2:System.out.print("Segunda");			
		break;
		case 3:System.out.print("Terça");			
		break;
		case 4:System.out.print("Quarta");			
		break;
		case 5:System.out.print("Quinta");			
		break;
		case 6:System.out.print("Sexta");			
		break;
		case 7:System.out.print("Sábado");			
		break;
		default: System.err.println("Digite um numero valido");
					System.exit(1);
			break;
		}
		
		
		
		
		
		
		
		
		
		scanner.close();


	}

}
