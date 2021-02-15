/*
Faça um Programa que peça um número correspondente a um
determinado ano e em seguida informe se este ano é ou não bissexto.
 */
package Aula15.Exercicios;

import java.util.Scanner;

public class Exer_17 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um ano qualquer:");
        int ano = scan.nextInt();

        if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))) {
            System.out.println(ano + " É um ano bissexto!");
        } else {
            System.out.println(ano + " Não é um ano bissexto.");
        }

    }
}
