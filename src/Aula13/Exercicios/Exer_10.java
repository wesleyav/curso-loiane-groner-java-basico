/*
Faça um Programa que peça a temperatura em graus Celsius,
transforme e mostre em graus Farenheit.
 */
package Aula13.Exercicios;

import java.util.Scanner;

public class Exer_10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a temperatura em Celsius:");
        double c = scan.nextDouble();

        double f;
        //°F = °C × 1,8 + 32
        f = (c * 1.8) + 32;

        System.out.println(+c + " graus Celsius equivalem a " + f + " graus Farenheit");
    }
}
