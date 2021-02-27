/* 20. Implementar um programa que obtenha a cotação do dólar (U$) em
relação ao real (R$) e a seguir armazene em vetor A com 20
elementos as seguintes conversões:
A[i] = cotação do dolar * i, para todo i variando de 1 até 20.
 */

package Aula19.Exercicios;

import java.util.Scanner;

public class Exer020 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double[] vetorA = new double[20];
		double cotacao;

		System.out.println("Entre com a cotação do Dólar: ");
		cotacao = scan.nextDouble();

		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = cotacao * (i + 1);
		}

		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
	}
}
