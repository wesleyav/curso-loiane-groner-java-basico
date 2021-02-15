/*
26.Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120. A saída
deve ser conforme o exemplo abaixo: o Fatorial de: 5 o 5! = 5 . 4 . 3 . 2 . 1 = 120
 */
package Aula17.Exercicios;

import java.util.Scanner;

public class Exer026 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com um número:");
		int num = scan.nextInt();

		System.out.println("Fatorial de " + num);

		System.out.print(num + "! = ");

		int fatorial = 1;

		for (int i = num; i > 1; i--) {
			fatorial *= i;
			System.out.print(i + " . ");
		}
		System.out.println(" . 1 = " + fatorial);

	}

}
