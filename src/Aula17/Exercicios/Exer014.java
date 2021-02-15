/*
14.Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de números pares e a quantidade
de números impares
 */
package Aula17.Exercicios;

import java.util.Scanner;

public class Exer014 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num;
		int numPar = 0;
		int numInpar = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Informe um número: ");
			num = scan.nextInt();

			if (num % 2 == 0) {
				numPar++;
			} else {
				numInpar++;
			}
		}

		System.out.println("Total de números pares: " + numPar);
		System.out.println("Total de números inpares: " + numInpar);

	}

}
