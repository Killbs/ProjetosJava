package exercicio1;

import java.util.Scanner;

public class ExercicioQuadrado {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o Numero: ");
	
		Integer Numero = scanner.nextInt();	
		Integer Resultado = Numero*Numero;
			
		System.out.println("O quadrado do Numero é: " + Resultado);
	
		scanner.close();
			
	}
	
}
