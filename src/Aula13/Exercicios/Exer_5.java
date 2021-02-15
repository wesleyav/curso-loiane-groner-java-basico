/*
Faça um Programa que converta metros para centímetros.
 */
package Aula13.Exercicios;

import java.util.Scanner;

public class Exer_5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma medida em metros: (utilize vírgula se for o caso)");
        double m = scan.nextDouble();

        double cm = m * 100;

        System.out.println(+m + " metros equivale a " + cm + " centímetros. ");
    }
}
