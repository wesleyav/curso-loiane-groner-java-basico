/*
Faça um Programa que peça o raio de um círculo, calcule e mostre
sua área.
 */
package Aula13.Exercicios;

import java.util.Scanner;

public class Exer_6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor em centímetros para o raio de um círculo:");
        int r = scan.nextInt();

        double pi = 3.14159;
        double area = pi * (r * r);

        System.out.println("A área do círculo é de: " + area + " centímetros quadrados.");
    }
}
