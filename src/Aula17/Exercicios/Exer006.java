/*
6. Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro. Depois modifique o programa
para que ele mostre os números um ao lado do outro.
 */
package Aula17.Exercicios;

public class Exer006 {

	public static void main(String[] args) {

		System.out.println("Usando while");
		int cont = 0;
		while (cont <= 20) {
			System.out.print(cont + " ");
			cont++;
		}
		
		System.out.println("Usando for");
		for (int i = 1; i <= 20; i++) {
			// System.out.println(i);
			System.out.print(i + " ");
		}
	}
}
