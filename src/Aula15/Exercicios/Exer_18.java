/*
Faça um Programa que peça um número inteiro e determine se ele é
par ou impar. Dica: utilize o operador módulo (resto da divisão).
 */
package Aula15.Exercicios;

import java.util.Scanner;

public class Exer_18 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número do tipo inteiro:");
        int numero = scan.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }

    }
}
