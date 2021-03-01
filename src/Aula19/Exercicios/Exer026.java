/*26. Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
um vetor C de mesmo tipo e tamanho, obedecendo as seguintes
regras de formação: a) Ci deverá receber 1 quando Ai for maior que Bi;
b) Ci deverá receber 0 quando Ai for igual a Bi; c) Ci deverá receber -1
quando Ai for menor que Bi.
 */
package Aula19.Exercicios;

import java.util.Scanner;

public class Exer026 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com um número para a posição A " + i);
			vetorA[i] = scan.nextInt();

			vetorB[i] = (vetorA[i] % 2 == 0) ? 1 : 0;
		}

		for (int i = 0; i < vetorB.length; i++) {
			System.out.println("Entre com um número para a posição B " + i);
			vetorB[i] = scan.nextInt();

			if (vetorA[i] == vetorB[i]) {
				vetorC[i] = 0;
			} else if (vetorA[i] > vetorB[i]) {
				vetorC[i] = 1;
			} else {
				vetorC[i] = -1;
			}
		}
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();

		System.out.print("Vetor B = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();
		
		System.out.print("Vetor C = ");
		for (int i = 0; i < vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
		}
		System.out.println();
	}

}
