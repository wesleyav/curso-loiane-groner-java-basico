/*6. Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
um vetor C, onde cada elemento de C é a soma dos respectivos
elementos em A e B, ou seja:
C[i] = A[i] + B[i].
 */

package Aula19.Exercicios;

import java.util.Scanner;

public class Exer006 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorB.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor do vetorA na posição: " + i);
			vetorA[i] = scan.nextInt();
		}
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println("Entre com o valor do vetorB na posição: " + i);
			vetorB[i] = scan.nextInt();
		}

		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
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

	}

}
