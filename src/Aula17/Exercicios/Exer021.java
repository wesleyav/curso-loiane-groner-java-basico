/*
21.Faça um programa que calcule o número médio de alunos por turma. Para isto, peça a quantidade de turmas e a
quantidade de alunos para cada turma. As turmas não podem ter mais de 40 alunos.
 */
package Aula17.Exercicios;

import java.util.Scanner;

public class Exer021 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com um número de turmas: ");
		int numTurmas = scan.nextInt();

		int numAlunos;
		int soma = 0;
		boolean invalido = true;

		for (int i = 1; i <= numTurmas; i++) {

			invalido = true;
			do {
				System.out.println("Entre com o número de alunos da turma " + i);
				numAlunos = scan.nextInt();
				
				if (numAlunos <= 40) {
					invalido = false;
				} else {
					System.out.println("Número de alunos inválido, digite novamente.");
				}

			} while (invalido);
			soma += numAlunos;
		}
		double media = soma / numTurmas;

		System.out.println("A média de alunos é de: " + media);
	}
}
