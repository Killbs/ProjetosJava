package exercicio1;

import java.util.Scanner;

public class ExercicioFor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
//
//		... Itere por essa lista e imprima todos os n�meros que s�o divis�veis por 3.
//
//		Para descobrir se um n�mero � divis�vel por 3, voc� pode utilizar o operador m�dulo. Toda vez que o m�dulo de um n�mero por 3 for igual a zero, ent�o esse n�mero e divis�vel por 3.
		
		Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
//		for (int i = 0;i<numeros.length;i++) {
//			Integer numero = numeros[i];
//			Integer divisao = numero % 3;
//			
//			if (divisao.equals(0)) {
//				System.out.println("Numeros divisiveis por tr�s:  " + numero);
//				continue;
//			}
//
//		}
		
		laco(numeros);
			
		scanner.close();

	}
	
	static void laco (Integer [] vetor) {
		for (int i = 0;i<vetor.length;i++) {
			Integer numero = vetor[i];
			Integer divisao = numero % 3;
			
			if (divisao.equals(0)) {
				System.out.println("Numeros divisiveis por tr�s:  " + numero);
				continue;
			}
			
		}
			
			
	}

}
