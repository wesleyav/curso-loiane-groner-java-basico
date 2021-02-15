/*
2. Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário,
mostrando uma mensagem de erro e voltando a pedir as informações.
 */
package Aula17.Exercicios;

import java.util.Scanner;

public class Exer002 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean infoValidas = false;
		String nomeUser;
		String senhaUser;
		do {

			System.out.println("Digite o nome:");
			nomeUser = scan.next();

			System.out.println("Digite a senha:");
			senhaUser = scan.next();

			if (nomeUser.equalsIgnoreCase(senhaUser)) {
				// infoValidas = false;
				System.out.println("Senha igual ao usuário, digite novamente.");
			} else {
				infoValidas = true;
				System.out.println("Senha e usuários válidos!");
			}

		} while (!infoValidas);

	}

}
