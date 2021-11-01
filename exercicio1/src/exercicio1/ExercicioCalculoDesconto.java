package exercicio1;

import java.util.Scanner;

public class ExercicioCalculoDesconto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Crie um programa que vai receber do usu�rio o valor do produto e a quantidade do produto que se deseja. 
		//Com essas informa��es encontre o subtotal que ser� o valor do produto multiplicado pela quantidade.
		//Depois voc� vai precisar usar uma estrutura de decis�o. Se a quantidade desejada do produto for maior que 10 unidades, 
		//vai ser preciso dar um desconto de 10% em cima do subtotal, mas se for menor que 10, voc� N�O aplica desconto algum.
		
		System.out.print("Digite o Valor do Produto: ");
		Double ValorProduto = scanner.nextDouble();
		
		System.out.print("Digite a quantidade do Produto: ");
		Integer QuantidadeProduto = scanner.nextInt();
		
		Double subTotal = ValorProduto * QuantidadeProduto;
		Double Desconto = 10.0;
	
		Boolean QuantidadeDesconto = QuantidadeProduto > 10;
		
		if (QuantidadeDesconto) {
			subTotal = subTotal - ((subTotal*Desconto)/100);
		} 
		
		System.out.println("SubTotal: " + subTotal);
		
		scanner.close();
	}
	
	
}
