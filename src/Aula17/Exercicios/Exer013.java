/*
13.Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro número elevado ao
segundo número. Não utilize a função de potência da linguagem.
 */
package Aula17.Exercicios;

import java.util.Scanner;

public class Exer013 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com a base: ");
		int base = scan.nextInt();

		System.out.println("Entre com a potência:");
		int potencia = scan.nextInt();

		int resultado = base;

		for (int i = 1; i < potencia; i++) {
			resultado *= base;
		}

		System.out.println("O número " + base + " elevado a potência de "
				+ potencia + " resulta em: " + resultado);
	}

}
