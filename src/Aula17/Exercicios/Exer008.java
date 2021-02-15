/*
8. Faça um programa que leia 5 números e informe a soma e a média dos números.
 */
package Aula17.Exercicios;

import java.util.Scanner;

public class Exer008 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num;
		double media;
		int soma = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite um número: ");
			num = scan.nextInt();

			soma += num;
		}

		media = soma / 5;

		System.out.println("A soma é: " + soma);
		System.out.println("A média é: " + media);

	}

}
