/*
28.Os números primos possuem várias aplicações dentro da Computação, por exemplo na Criptografia. Um número
primo é aquele que é divisível apenas por um e por ele mesmo. Faça um programa que peça um número inteiro e
determine se ele é ou não um número primo.
 */
package Aula17.Exercicios;

import java.util.Scanner;

public class Exer029 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com um número");
		int num = scan.nextInt();

		boolean primo;

		for (int i = 1; i <= num; i++) {
			primo = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					// System.out.println("Não é primo. É divisível por " + i);
					primo = false;
				}
			}
			if (primo) {
				System.out.println(i);
			}
		}
	}

}
