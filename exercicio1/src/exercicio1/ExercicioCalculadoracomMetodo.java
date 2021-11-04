package exercicio1;

import java.util.Scanner;

public class ExercicioCalculadoracomMetodo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Essa primeira linha � onde eu recebo o valor do primeiro numero
		Double primeiroNumero = imprimirPrimeiroNumero(scanner);
		
		//Essa primeira linha � onde eu recebo o valor do primeiro numero
		Double segundoNumero = imprimirSegundoNumero(scanner);
		
		//Nesta linha eu recebo o resultado de um case, que seleciona a opera��o
		Integer operacao = operacaoselecionada(scanner);
		
		//O Resultado sera o retorno da opera��o, que ira pegar o primeiro numero o segundo numero
		//e a opera��o e rodar um caso, onde cada case roda um novo metodo que retorna a soma da conta para a variavel resultado
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
	
	//Para descrever a opera��o, criamos um vetor com as opera��es e ent�o coletamos os numeros de 1 a 4 sinalizando qual a opera��o
	//ate��o para o atributo do metodo, que nos mostra que utilizei um scanner para ler o resultado
	static Integer operacaoselecionada(Scanner scanner) {
		String [] operacoes = new String [] { "Adi��o", "Subtra��o","Multiplica��o","Divis�o"};
		
		System.out.println("Escolha a Opera��o: ");
		
		for (int i =0; i<operacoes.length;i++) {
			System.out.println("[" + (i+1) + "]" + " " + operacoes[i]);
		}
		return scanner.nextInt();
	}
	//Conforme explica��o acima, aqui rodamos um case que chama outros metodos com o intuito de resolver a equa��o
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
