/*6. Faça um programa para jogar o jogo da velha. O programa deve
permitir que dois jogadores façam uma partida do jogo da velha,
usando o computador para ver o tabuleiro. Cada jogador vai
alternadamente informando a posição onde deseja colocar a sua
peça (‘O’ ou ‘X’). O programa deve impedir jogadas inválidas e
determinar automaticamente quando o jogo terminou e quem foi o
vencedor (jogador1 ou jogador2). A cada nova jogada, o programa
deve atualizar a situação do tabuleiro na tela.
 */

package Aula20.Exercicios;

import java.util.Scanner;

public class Exer006 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		char[][] jogoVelha = new char[3][3];

		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 2 = O");

		boolean ganhou = false;
		int jogada = 1;
		char sinal;
		int linha = 0;
		int coluna = 0;

		while (!ganhou) {
			if (jogada % 2 == 1) {
				System.out
						.println("Vez do jogador 1. Escolha linha e coluna (1-3)");
				sinal = 'X';
			} else {
				System.out
						.println("Vez do jogador 2. Escolha linha e coluna (1-3)");
				sinal = 'O';
			}

			boolean linhaValida = false;
			while (!linhaValida) {
				System.out.println("Entre com a linha (1, 2 ou 3)");
				linha = scan.nextInt();
				if (linha >= 1 && linha <= 3) {
					linhaValida = true;
				} else {
					System.out.println("Entrada inválida, tente novamente");
				}
			}

			boolean colunaValida = false;
			while (!colunaValida) {
				System.out.println("Entre com a coluna (1, 2 ou 3)");
				coluna = scan.nextInt();
				if (coluna >= 1 && coluna <= 3) {
					colunaValida = true;
				} else {
					System.out.println("Entrada inválida, tente novamente");
				}
			}
			linha--;
			coluna--;
			if (jogoVelha[linha][coluna] == 'X'
					|| jogoVelha[linha][coluna] == 'O') {
				System.out.println("Posição já usada, tente novamente");
			} else {
				jogoVelha[linha][coluna] = sinal;
				jogada++;
			}

			for (int i = 0; i < jogoVelha.length; i++) {
				for (int j = 0; j < jogoVelha[i].length; j++) {
					System.out.print(jogoVelha[i][j] + " | ");
				}
				System.out.println();
			}

			if ((jogoVelha[0][0] == 'X' && jogoVelha[0][1] == 'X' && jogoVelha[0][2] == 'X')
					|| (jogoVelha[1][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[1][2] == 'X')
					|| (jogoVelha[2][0] == 'X' && jogoVelha[2][1] == 'X' && jogoVelha[2][2] == 'X')
					|| (jogoVelha[0][0] == 'X' && jogoVelha[1][0] == 'X' && jogoVelha[2][0] == 'X')
					|| (jogoVelha[0][1] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][1] == 'X')
					|| (jogoVelha[0][2] == 'X' && jogoVelha[1][2] == 'X' && jogoVelha[2][1] == 'X')
					|| (jogoVelha[0][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][2] == 'X')) {
				ganhou = true;
				System.out.println("Parabéns, jogador 1 ganhou!");
			} else if ((jogoVelha[0][0] == 'O' && jogoVelha[0][1] == 'O' && jogoVelha[0][2] == 'O')
					|| (jogoVelha[1][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[1][2] == 'O')
					|| (jogoVelha[2][0] == 'O' && jogoVelha[2][1] == 'O' && jogoVelha[2][2] == 'O')
					|| (jogoVelha[0][0] == 'O' && jogoVelha[1][0] == 'O' && jogoVelha[2][0] == 'O')
					|| (jogoVelha[0][1] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][1] == 'O')
					|| (jogoVelha[0][2] == 'O' && jogoVelha[1][2] == 'O' && jogoVelha[2][1] == 'O')
					|| (jogoVelha[0][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][2] == 'O')) {
				ganhou = true;
				System.out.println("Parabéns, jogador 2 ganhou!");
			} else if (jogada > 9) {
				System.out.println("Ninguém ganhou!");
			}
		}
	}

}
