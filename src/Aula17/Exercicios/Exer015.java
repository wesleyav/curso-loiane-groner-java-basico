/*
15.A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,... Faça um programa capaz de gerar a série
até o n−ésimo termo.
 */
package Aula17.Exercicios;

import java.util.Scanner;

public class Exer015 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o n-ésimo termo da série de Fibonnacci:");
		int num = scan.nextInt();

		int primeiro = 1;
		int segundo = 1;
		int proximo;

		System.out.println(primeiro);
		System.out.println(segundo);

		for (int i = 3; i <= num; i++) {
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;

			System.out.println(proximo);
		}

	}

}
