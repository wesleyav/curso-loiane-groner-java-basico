/*1. Escreva um método recursivo e estático que calcule e retorne o N-­‐ésimo
termo da sequência Fibonacci. Alguns números desta sequência são: 0, 1,
1, 2, 3, 5, 8, 13, 21, 34, 55, 89...
 */

package Aula35.Exercicios;

public class Exer01 {

	public static void main(String[] args) {

		for (int i = 1; i < 20; i++) {
			System.out.print(Calculadora.fibonacci(i) + " ");

		}

	}

}
