/*
Faça um Programa que peça a temperatura em graus Farenheit,
transforme e mostre a temperatura em graus Celsius.
C = (5 * (F-32) / 9)
 */
package Exercicios_Aula_13;

import java.util.Scanner;

public class Exer_9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a temperatura em Farenheit:");
        double f = scan.nextDouble();

        double c;
        c = (5 * (f - 32) / 9);

        System.out.println(+f + " graus Farenheit equivalem a " + c + " graus Celsius");
    }
}
