/*
7. Faça um programa que leia 5 números e informe o maior número.
 */
package Aula17.Exercicios;

import java.util.Scanner;

public class Exer007 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

//		int num;
//		int maior = Integer.MIN_VALUE;
//
//		for (int i = 0; i < 5; i++) {
//			System.out.println("Digite um número: ");
//			num = scan.nextInt();
//
//			if (num > maior) {
//				maior = num;
//			}
//		}
//
//		System.out.println("O maior número é: " + maior);
		
		int numero;
		int numeroMaior = Integer.MIN_VALUE;
		int cont;
		
		System.out.println("Digite um número: ");
		numero = scan.nextInt();
		while (numero > numeroMaior){
			numeroMaior = numero;
			//cont++;
		}
		
		System.out.println("O maior número é: " + numeroMaior);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
