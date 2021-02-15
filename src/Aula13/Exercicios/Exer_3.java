/*
Faça um Programa que peça dois números e imprima a soma.
 */
package Aula13.Exercicios;

import java.util.Scanner;

public class Exer_3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int n1 = scan.nextInt();

        System.out.println("Digite o segundo múmero:");
        int n2 = scan.nextInt();

        int resultado = n1 + n2;

        System.out.println("O resultado é: " + resultado);
    }
}
