package exercicio1;

import java.util.Scanner;

public class ExercicioVariaveis {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite Seu Nome: ");
			String Nome = scanner.nextLine();
		
		System.out.print("Digite Seu Sobrenome: ");
			String Sobrenome = scanner.nextLine();
		
		System.out.println("Ola " + Nome + " " + Sobrenome);
		
		scanner.close();
		
	}

}
