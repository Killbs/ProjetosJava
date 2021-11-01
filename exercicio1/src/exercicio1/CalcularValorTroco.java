package exercicio1;

import java.util.Scanner;

public class CalcularValorTroco {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double ValorProduto = scanner.nextDouble();
		
		System.out.print("Digite o valor recebido: ");
		Double ValorRecebido = scanner.nextDouble();
		
		Double resultado = ValorRecebido - ValorProduto;
		
		System.out.println("Troco = " + resultado);
				
		scanner.close();
	}
}
