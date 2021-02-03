/*
Faça um Programa que peça um número e então mostre a
mensagem O número informado foi [número].
 */
package Exercicios_Aula_13;

import java.util.Scanner;

public class Exer_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número:");
        int n1 = scan.nextInt();
        System.out.println("O número digitado foi: " + n1);
    }
}
