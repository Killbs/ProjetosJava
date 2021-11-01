package exercicio1;

import java.util.Scanner;

public class ExercicioCalculadora {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("Bem vindo a calculadora, abaixo digite os números e a função desejada: ");
		
		System.out.print("Digite o Primeiro numero: ");
		Double primeiroNumero = scanner.nextDouble();
		
		System.out.print("Digite o Segundo numero: ");
		Double segundoNumero = scanner.nextDouble();		
		
		System.out.print("Digite a Opção Desejada: ");
		System.out.print("[1] Adição");		
		System.out.print("[2] Subtração");		
		System.out.print("[3] Divisão");		
		System.out.println("[4] Multiplicação");
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
