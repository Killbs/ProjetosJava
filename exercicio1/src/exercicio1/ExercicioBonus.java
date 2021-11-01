package exercicio1;

import java.util.Scanner;

public class ExercicioBonus {

	public static void main(String[] args) {
		
//		Pense em uma empresa fict�cia que todo o m�s de Janeiro premia seus funcion�rios com um b�nus, caso a meta seja alcan�ada.
//
//		Crie um programa que receba 3 par�metros. O primeiro ser� a meta de faturamento anual da empresa para o ano que passou.
//		Depois, receba o par�metro referente ao faturamento real da empresa no ultimo ano. 
//		Por �ltimo, receba a m�dia salarial do funcion�rio(a) para o ano anterior (n�o precisa fazer c�lculo de m�dia salarial, 
//		j� que estamos trabalhando com um algoritmo fict�cio - na hora de informar esse par�metro, invente um valor qualquer para representar essa m�dia salarial).
//
//		Nessa empresa fict�cia, se o faturamento real for igual ou maior que a meta de faturamento anual, 
//		ent�o os funcion�rios ganharam um b�nus que ser� igual a m�dia salarial deles no �ltimo ano. 
//		Caso o faturamento seja menor que a meta, mas, seja maior ou igual a 80% do valor da meta, ent�o eles receber�o tamb�m 80% de sua m�dia salarial.
//
//		No final, mostre de quanto ser� o pr�mio desse funcion�rio(a).
		
		
		Scanner scanner = new Scanner(System.in);
		
		imprimirsempularlinha("Digite a meta de faturamento: ");
		Double metaFaturamento = scanner.nextDouble();
		
		imprimirsempularlinha("Digite o faturamento ultimo ano: ");
		Double faturamentoReal = scanner.nextDouble();
		
		imprimirsempularlinha("Digite a media salarial: ");
		Double mediaSalarial = scanner.nextDouble();
		
		Boolean bonusTotal = faturamentoReal >= metaFaturamento;
		Boolean bonusParcial = faturamentoReal < metaFaturamento && faturamentoReal >= (metaFaturamento * 0.8);
				
		
		
		if (bonusTotal) {
			imprimir("A meta foi atingida, o bonus sera de: " + mediaSalarial);
		} else if (bonusParcial) {
			imprimir("A meta foi parcialmente atingida, o bonus sera de: " + mediaSalarial * 0.8);
		} else {
			imprimir("A meta n�o foi atingida");
		}
			
	
		scanner.close();

	}
	
	static void imprimir(String texto) {
		System.out.println(texto);
	}
	static void imprimirsempularlinha(String texto) {
		System.out.println(texto);
	}
	
	

}
