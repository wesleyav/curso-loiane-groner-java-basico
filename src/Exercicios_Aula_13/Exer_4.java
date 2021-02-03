/*
Faça um Programa que peça as 4 notas bimestrais e mostre a média.
 */
package Exercicios_Aula_13;

import java.util.Scanner;

public class Exer_4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a nota 1:");
        int n1 = scan.nextInt();

        System.out.println("Digite a nota 2:");
        int n2 = scan.nextInt();

        System.out.println("Digite a nota 3:");
        int n3 = scan.nextInt();

        System.out.println("Digite a nota 4:");
        int n4 = scan.nextInt();

        int media = (n1 + n2 + n3 + n4) / 4;

        System.out.println("A média é: " + media);
    }
}
