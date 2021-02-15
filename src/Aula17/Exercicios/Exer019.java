/*
19.Faça um programa que calcule o mostre a média aritmética de N notas.
 */
package Aula17.Exercicios;

import java.util.Scanner;

public class Exer019 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o número de notas:");
		int numNotas = scan.nextInt();

		double soma = 0;
		double media;
		double nota;

		for (int i = 0; i < numNotas; i++) {
			System.out.println("Entre com a nota: " + (i + 1));
			nota = scan.nextDouble();

			soma += nota;

		}
		media = soma / numNotas;

		System.out.println("A média aritmética é: " + media);

	}
}
