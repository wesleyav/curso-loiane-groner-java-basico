/*
1. Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue
pedindo até que o usuário informe um valor válido..
 */
package Aula17.Exercicios;

import java.util.Scanner;

public class Exer001 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean notaValida = false;

		do {
			System.out.println("Digite a nota:");

			double nota = scan.nextDouble();

			if (nota >= 0 && nota <= 10) {
				notaValida = true;
				System.out.println("Você digitou a nota: " + nota);
			} else {
				System.out.println("Nota inválida, digite novamente.");
			}
		} while (!notaValida);
	}
}
