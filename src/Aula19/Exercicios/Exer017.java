package Aula19.Exercicios;
import java.util.Scanner;

/*17. Ler um vetor A com 10 elementos inteiros correspondentes as idades
de um grupo de pessoas. Escreva um programa que determine e
escreva a quantidade de pessoas que possuem idade superior a 35
anos.
*/

public class Exer017 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] idades = new int[10];

		for (int i = 0; i < idades.length; i++) {
			System.out.println("Entre com a idade da pessoa " + (i+1));
			idades[i] = scan.nextInt();
		}
		
		int qtde = 0;
		
		for (int i = 0; i < idades.length; i++) {
			if (idades[i] > 35) {
				qtde++;
				
			}
		}
		
		System.out.print("Vetor A = ");
		for (int i = 0; i < idades.length; i++) {
			System.out.print(idades[i] + " ");
		}
		System.out.println();

		System.out.println("Soma das idades maiores que 35: " + qtde);
	}

}
