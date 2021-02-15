/*
11.Altere o programa anterior para mostrar no final a soma dos números.
 */
package Aula17.Exercicios;

import java.util.Scanner;

public class Exer011 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o primeiro número: ");
		int num1 = scan.nextInt();

		System.out.println("Entre com o segundo número: ");
		int num2 = scan.nextInt();

		int soma = 0;

		for (int i = num1; i <= num2; i++) {
			soma += i;
		}

		System.out.println("A soma é: " + soma);

	}

}
