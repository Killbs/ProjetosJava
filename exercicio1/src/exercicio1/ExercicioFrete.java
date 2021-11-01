package exercicio1;

import java.util.Scanner;

public class ExercicioFrete {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o Valor da Compra: ");
		Double valorProduto = scanner.nextDouble();
		
		Double Frete = 15.0;
		
		Boolean cobrarFrete = valorProduto < 100;
		
		if (cobrarFrete) {
			valorProduto = valorProduto +  Frete;
		}
		
		System.out.print("Valor Compra: " + valorProduto);
		
		
		
		scanner.close();
		 
	}
}
