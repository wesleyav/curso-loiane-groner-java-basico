package Aula18;

import java.util.Scanner;

public class BreakEContinue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com um número");
		int num = scan.nextInt();

		System.out.println("Entre com um limite");
		int max = scan.nextInt();

		for (int i = num; i <= max; i++) {
			System.out.println(i);
			if (i % 7 == 0) {
				System.out.println("O valor de i é: " + i);
				break;
			}
		}

		// Continue
		System.out.println("Entre com um número");
		int num1 = scan.nextInt();

		System.out.println("Entre com um limite");
		int max1 = scan.nextInt();

		for (int i = num1; i <= max1; i++) {
			if (i % 7 == 0) {
				continue;
			}
			System.out.println("O valor de i é: " + i);
		}
	}
}
