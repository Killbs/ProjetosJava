package exercicio1;

import java.util.Scanner;

public class ExercicioNotaV2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
////		Crie um programa que vai receber as notas que uma pessoa tirou nas duas materias de sua prova. 
//		Ser�o dois par�metros para receber um para receber a nota de portugu�s e outro para receber as de matem�tica.
////
////		A prova, no total, vale 200 pontos - 100 para cada mat�ria. A nota m�nima total para passar � igual ou maior que 150. 
//		Entretanto, o candidato n�o pode tirar menos do que 60 pontos em qualquer uma das duas mat�rias, ou seja, se tirar 59 em portugu�s e 100 em matem�tica 
//		(totalizando uma nota maior do que o total necess�rio que � 150) ele n�o conseguir� a vaga.
////
////		No final mostre para o candidato se ele conseguiu ou n�o.
		
		
		System.out.print("Digite a nota de portugues: ");
		Integer notaPortugues = scanner.nextInt();
		
		System.out.print("Digite a nota de Matematica: ");
		Integer notaMatematica = scanner.nextInt();
		
		Boolean notaAcima = notaPortugues > 100 || notaMatematica >100;
		Boolean notaPassar = (notaPortugues + notaMatematica >= 150) && notaPortugues >= 60 && notaMatematica >= 60;
		Integer reprovado = 150 - (notaPortugues + notaMatematica);
		
		if (notaAcima) {
			System.out.print("Digite valores entre 0 e 100");
		} else if (notaPortugues < 60) {
			System.out.print("Nota Portugues abaixo do minimo, reprovado por " + (60 - notaPortugues) + " pontos");
		} else if (notaMatematica < 60) {
			System.out.print("Nota Matematica abaixo do minimo, reprovado por " + (60 - notaMatematica) + " pontos");
		} else if (notaPassar) {
			System.out.print("Parabens passou");
		} else {
			System.out.print("Reprovado por " + reprovado + " pontos");
		}	
		
		
		
		scanner.close();
	}

}
