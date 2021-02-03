package aula_17;

public class LoopFor {

	public static void main(String[] args) {

		// For tradicional
		for (int i = 0; i < 5; i++) {
			System.out.println("i tem o valor: " + i);
		}

		for (int i = 5; i > 0; i--) {
			System.out.println("i tem o valor: " + i);
		}

		// For com mais de uma variável
		for (int i = 0, j = 10; i < j; i++, j--) {
			System.out.println("i = " + i + "; j = " + j);
		}

		// For com partes ausentes
		int count = 0;
		for (; count < 10;) {
			System.out.println("valor de count: " + count);
			count += 2;
		}

		// For infinito
		// for (;;);

		// For sem corpo
		int soma = 0;
		for (int i = 0; i < 5; soma += i++) {
			System.out.println("o valor da soma é: " + soma);
		}
	}
}
