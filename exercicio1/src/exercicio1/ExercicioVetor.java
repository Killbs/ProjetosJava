package exercicio1;

import java.util.Scanner;

public class ExercicioVetor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String [] tarefas = new String[5];
		imprimir(" Digite as Tarefas: ");
		
		lacos(tarefas);
		
		lacos2(tarefas);

		scanner.close();
		
	}
	
	static void imprimir(String texto) {
		System.out.println(texto);
	}
	
	static void lacos2(String [] tarefa ) {
		for (int i = 0;i<tarefa.length;i++) {
			imprimir("[" + i + "]" + " " + tarefa[i]);
		}
	}
	
	static void lacos(String [] tarefa) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0;i<tarefa.length;i++) {
			tarefa[i] = scanner.nextLine();
		}
	}
}
