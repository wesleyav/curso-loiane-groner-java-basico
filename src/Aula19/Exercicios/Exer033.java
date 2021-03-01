/* 33. Criar um vetor A com 10 elementos inteiros. Escreva um programa que
imprima cada elemento do vetor A e uma mensagem indicando se o
respectivo elemento é um número primo ou não.
 */

package Aula19.Exercicios;

import java.util.Scanner;

public class Exer033 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com um número para a posição A " + i);
			vetorA[i] = scan.nextInt();
		}
		boolean primo;
		String msg;

		for (int i = 0; i < vetorA.length; i++) {
			primo = true;
			for (int j = 2; j < vetorA[i]; j++) {
				if (vetorA[i] % j == 0) {
					primo = false;
					break;
				}
			}
			msg = "";
			if (primo) {
				msg = " primo";
			} else {
				msg = " não é primo";
			}
			System.out.println(vetorA[i] + msg);
		}
	}

}
