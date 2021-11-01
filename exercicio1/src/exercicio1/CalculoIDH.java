package exercicio1;

import java.util.Scanner;

public class CalculoIDH {
	
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Digite o peso: ");
	Double Peso = scanner.nextDouble();
	
	System.out.print("Digite a Altura: ");
	Double Altura = scanner.nextDouble();
	
	Double IDH = Peso / (Altura * Altura);
	
	System.out.println("IDH = " + IDH);
			
	scanner.close();

	}
}
