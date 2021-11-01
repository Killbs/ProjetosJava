package exercicio1;

import java.util.Scanner;

public class ExercicioCalculadoracomMetodo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Double primeiroNumero = imprimirPrimeiroNumero(scanner);
		Double segundoNumero = imprimirSegundoNumero(scanner);
		Integer operacao = operacaoselecionada(scanner);
		Double resultado = operacaoSelecionada(operacao, primeiroNumero, segundoNumero);
		
		System.out.println("Resultado: " + resultado);

	}

	static Double imprimirPrimeiroNumero(Scanner scanner) {
		System.out.println("Informe o Numero");
		return scanner.nextDouble();
	}
	
	static Double imprimirSegundoNumero(Scanner scanner) {
		System.out.println("Informe o Numero");
		return scanner.nextDouble();
	}
	
	static Integer operacaoselecionada(Scanner scanner) {
		String [] operacoes = new String [] { "Adi��o", "Subtra��o","Multiplica��o","Divis�o"};
		
		System.out.println("Escolha a Opera��o: ");
		
		for (int i =0; i<operacoes.length;i++) {
			System.out.println("[" + (i+1) + "]" + " " + operacoes[i]);
		}
		return scanner.nextInt();
	}
	
	static Double operacaoSelecionada (Integer selecao, Double primeiroNumero, Double segundoNumero) {
		Double resultado = null;
		
		switch (selecao) {
		case 1:
			resultado = adicao(primeiroNumero,segundoNumero);
			break;
		case 2:
			resultado = subtracao(primeiroNumero,segundoNumero);
			break;
		case 3:
			resultado = multiplicacao(primeiroNumero,segundoNumero);
			break;
		case 4:
			resultado = divisao(primeiroNumero,segundoNumero);
			break;
		default:
			System.err.println("Digite um numero valido");
			System.exit(1);
		}
		return resultado;
	}
	
	static Double adicao (Double primeiroNumero, Double segundoNumero) {
		return primeiroNumero + segundoNumero;
	}
	
	static Double subtracao (Double primeiroNumero, Double segundoNumero) {
		return primeiroNumero - segundoNumero;
	}
	
	static Double multiplicacao (Double primeiroNumero, Double segundoNumero) {
		return primeiroNumero * segundoNumero;
	}
	
	static Double divisao (Double primeiroNumero, Double segundoNumero) {
		return (primeiroNumero / segundoNumero);
	}
}
