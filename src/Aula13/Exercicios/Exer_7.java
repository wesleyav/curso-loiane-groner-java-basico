/*
Faça um Programa que calcule a área de um quadrado, em seguida
mostre o dobro desta área para o usuário.
 */
package Aula13.Exercicios;

import java.util.Scanner;

public class Exer_7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor para um dos lados de um quadrado:");
        int lado = scan.nextInt();

        int area = lado * lado;

        System.out.println("O dobro da área do quadrado é de: " + area * 2);

    }
}
