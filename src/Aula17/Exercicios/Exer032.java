/*
32.O cardápio de uma lanchonete é o seguinte: o Especificação Código Preço o Cachorro Quente 100 R$ 1,20 o Bauru
Simples 101 R$ 1,30 o Bauru com ovo 102 R$ 1,50 o Hambúrguer 103 R$ 1,20 o Cheeseburguer 104 R$ 1,30 o
Refrigerante 105 R$ 1,00 Faça um programa que leia o código dos itens pedidos e as quantidades desejadas. Calcule e
mostre o valor a ser pago por item (preço * quantidade) e o total geral do pedido. Considere que o cliente deve
informar quando o pedido deve ser encerrado.
 */
package Aula17.Exercicios;

import java.util.Scanner;

public class Exer032 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean naoTerminar = true;
		int cod, qtd;
		double total = 0;
		String output = "";

		do {
			System.out
					.println("Digite o código e a quantidade. Digite 00 para sair");
			cod = scan.nextInt();
			qtd = scan.nextInt();

			if (cod == 0 && qtd == 0) {
				naoTerminar = false;
				output += "Total a pagar = " + total;
			} else {
				if (cod == 100) {
					output += "Cachorro quente -> " + "1.20 * " + qtd;
					output += " = " + (1.2 * qtd) + "\n";
					total += 1.2 * qtd;
				} else if (cod == 101) {
					output += "Bauru simples -> " + "1.30 * " + qtd;
					output += " = " + (1.3 * qtd) + "\n";
					total += 1.3 * qtd;
				} else if (cod == 102) {
					output += "Bauru com ovo -> " + "1.50 * " + qtd;
					output += " = " + (1.5 * qtd) + "\n";
					total += 1.5 * qtd;
				} else if (cod == 103) {
					output += "Hamburguer -> " + "1.20 * " + qtd;
					output += " = " + (1.2 * qtd) + "\n";
					total += 1.2 * qtd;
				} else if (cod == 104) {
					output += "Cheeseburguer -> " + "1.30 * " + qtd;
					output += " = " + (1.3 * qtd) + "\n";
					total += 1.3 * qtd;
				} else if (cod == 105) {
					output += "Refrigerante -> " + "1.00 * " + qtd;
					output += " = " + (1.0 * qtd) + "\n";
					total += 1.0 * qtd;
				}
			}
		} while (naoTerminar);
		System.out.println(output);
	}

}
