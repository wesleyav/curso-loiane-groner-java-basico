/*2. Escreva uma classe Calculadora que tenha os seguintes métodos: somar,
subtrair, multiplicar, dividir (dois números), elevar à potência n.
Desenvolva um programa para testar essa classe.
 */

package Aula34.Exercicios;

public class TestaCalculadora {

	public static void main(String[] args) {

		imprimirTela(Calculadora.somar(1, 2));
		imprimirTela(Calculadora.subtrair(2, 1));
		imprimirTela(Calculadora.multiplicar(2, 2));
		imprimirTela(Calculadora.dividir(4, 2));
		imprimirTela(Calculadora.exponenciar(2, 4));

	}

	static void imprimirTela(int num) {
		System.out.println(num);
	}

}
