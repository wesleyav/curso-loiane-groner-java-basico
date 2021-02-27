package Aula19.Exercicios;
/*15. Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
que defina o percentual de elementos pares e ímpares,
respectivamente, armazenados neste vetor.
 */

import java.util.Scanner;

public class Exer015 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da posição " + i);
			vetorA[i] = scan.nextInt();
		}
		
		int impar = 0;
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 != 0) {
				impar++;
			}
		}
		
		int par = vetorA.length - impar;
		
		double porcPar = (par * 100) / vetorA.length;
		double porcImpar = 100 - porcPar;
		
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();

		System.out.println("Porcentagem pares: " + porcPar);
		System.out.println("Porcentagem ímpares: " + porcImpar);
	}

}
