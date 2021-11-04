package exercicio1;

import java.util.Scanner;

public class ExercicioCalculadoracomMetodo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Essa primeira linha é onde eu recebo o valor do primeiro numero
		Double primeiroNumero = imprimirPrimeiroNumero(scanner);
		
		//Essa primeira linha é onde eu recebo o valor do primeiro numero
		Double segundoNumero = imprimirSegundoNumero(scanner);
		
		//Nesta linha eu recebo o resultado de um case, que seleciona a operação
		Integer operacao = operacaoselecionada(scanner);
		
		//O Resultado sera o retorno da operação, que ira pegar o primeiro numero o segundo numero
		//e a operação e rodar um caso, onde cada case roda um novo metodo que retorna a soma da conta para a variavel resultado
		Double resultado = operacaoSelecionada(operacao, primeiroNumero, segundoNumero);
		
		System.out.println("Resultado: " + resultado);

	}
	// para receber o primeiro numero, devemos colocar como atributo o tipo de variavel que precisaremos entregar como resposta
	static Double imprimirPrimeiroNumero(Scanner scanner) {
		System.out.println("Informe o Numero");
		return scanner.nextDouble();
	}
	// para receber o primeiro numero, devemos colocar como atributo o tipo de variavel que precisaremos entregar como resposta
	static Double imprimirSegundoNumero(Scanner scanner) {
		System.out.println("Informe o Numero");
		return scanner.nextDouble();
	}
	
	//Para descrever a operação, criamos um vetor com as operações e então coletamos os numeros de 1 a 4 sinalizando qual a operação
	//ateção para o atributo do metodo, que nos mostra que utilizei um scanner para ler o resultado
	static Integer operacaoselecionada(Scanner scanner) {
		String [] operacoes = new String [] { "Adição", "Subtração","Multiplicação","Divisão"};
		
		System.out.println("Escolha a Operação: ");
		
		for (int i =0; i<operacoes.length;i++) {
			System.out.println("[" + (i+1) + "]" + " " + operacoes[i]);
		}
		return scanner.nextInt();
	}
	//Conforme explicação acima, aqui rodamos um case que chama outros metodos com o intuito de resolver a equação
	//com isso retornamos o valor da variavel resultado
	
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
