/*
Faça um Programa que peça um valor e mostre na tela se o valor é
positivo ou negativo.
 */
package Aula15.Exercicios;

import java.util.Scanner;

public class Exer_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número:");
        int n1 = scan.nextInt();

        if (n1 > 0) {
            System.out.println("O número é positivo.");
        } else {
            System.out.println("O número é negativo.");
        }

    }
}
