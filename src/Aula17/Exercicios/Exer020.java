/*
20.Faça um programa que peça para n pessoas a sua idade, ao final o programa devera verificar se a média de idade da
turma varia entre 0 e 25,26 e 60 e maior que 60; e então, dizer se a turma é jovem, adulta ou idosa, conforme a média
calculada.
 */
package Aula17.Exercicios;

import java.util.Scanner;

public class Exer020 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com a quantidade de idades:");
		int qtdIdades = scan.nextInt();

		int idade;
		int soma = 0;
		for (int i = 0; i < qtdIdades; i++) {
			System.out.println("Entre com a idade da pessoa " + (i + 1));
			idade = scan.nextInt();

			soma += idade;

		}

		double media = soma / qtdIdades;

		System.out.println("Média de idade: " + media);

		if (media >= 0 && media <= 25) {
			System.out.println("jovem");
		} else if (media > 25 && media <= 60) {
			System.out.println("adulta");
		} else if (media > 60) {
			System.out.println("idosa");
		}

	}

}
