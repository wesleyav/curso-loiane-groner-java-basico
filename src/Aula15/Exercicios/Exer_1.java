/*
Faça um Programa que peça dois números e imprima o maior deles.
 */
package Aula15.Exercicios;

import java.util.Scanner;

public class Exer_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int n1 = scan.nextInt();

        System.out.println("Digite o segundo número: ");
        int n2 = scan.nextInt();

        if (n1 > n2) {
            System.out.println("O maior número é: " + n1);
        } else if (n2 > n1) {
            System.out.println("O maior número é: " + n2);
        } else if (n1 == n2) {
            System.out.println("Os número são iguais.");
        }
    }
}
