package exercicio1;

import java.util.Scanner;

public class ExercicioCalculadora {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("Bem vindo a calculadora, abaixo digite os n�meros e a fun��o desejada: ");
		
		System.out.print("Digite o Primeiro numero: ");
		Double primeiroNumero = scanner.nextDouble();
		
		System.out.print("Digite o Segundo numero: ");
		Double segundoNumero = scanner.nextDouble();		
		
		System.out.print("Digite a Op��o Desejada: ");
		System.out.print("[1] Adi��o");		
		System.out.print("[2] Subtra��o");		
		System.out.print("[3] Divis�o");		
		System.out.println("[4] Multiplica��o");
		Integer Operacao = scanner.nextInt();
		
		Double Resultado = null;
		
		if (Operacao.equals(1)) {
			Resultado = primeiroNumero + segundoNumero;
		} 
		
		if (Operacao.equals(2)) {
			Resultado = primeiroNumero - segundoNumero;
		}
		
		if (Operacao.equals(3)) {
			Resultado = primeiroNumero / segundoNumero;
		}
		
		if (Operacao.equals(4)) {
			Resultado = primeiroNumero * segundoNumero;
		}
				
		System.out.print("Resultado: " + Resultado);
		
		scanner.close();
		
	}
}
