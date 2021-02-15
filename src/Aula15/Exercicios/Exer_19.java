/*
Faça um Programa que leia 2 números e em seguida pergunte ao
usuário qual operação ele deseja realizar. O resultado da operação
deve ser acompanhado de uma frase que diga se o número é:
. par ou ímpar;
a. positivo ou negativo;
 */
package Aula15.Exercicios;

import java.util.Scanner;

public class Exer_19 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int num1 = scan.nextInt();

        System.out.println("Digite o segundo número:");
        int num2 = scan.nextInt();

        System.out.println("Qual operação você deseja realizar? 1- Soma; 2- Subtração; 3- Multiplicação; 4-Divisão");
        int operacao = scan.nextInt();

        int resultado;
        String par_impar = "";
        switch (operacao) {
            case 1:
                resultado = num1 + num2;
                if (resultado >= 0) {
                    par_impar = "positivo.";
                } else {
                    par_impar = "negativo.";
                }
                if (resultado % 2 == 0) {
                    System.out.println("A SOMA dos números é: " + resultado + "." + " Este número é par e também é " + par_impar);
                } else {
                    System.out.println("A SOMA dos números é: " + resultado + " e este número é ímpar.");
                }
                break;
            case 2:
                resultado = num1 - num2;
                if (resultado >= 0) {
                    par_impar = "positivo.";
                } else {
                    par_impar = "negativo.";
                }
                if (resultado % 2 == 0) {
                    System.out.println("A SUBTRAÇÃO dos números é: " + resultado + "." + " Este número é par e também é " + par_impar);
                } else {
                    System.out.println("A SUBTRAÇÃO dos números é: " + resultado + " e este número é ímpar.");
                }
                break;
            case 3:
                resultado = num1 * num2;
                if (resultado >= 0) {
                    par_impar = "positivo.";
                } else {
                    par_impar = "negativo.";
                }
                if (resultado % 2 == 0) {
                    System.out.println("A MULTIPLICAÇÃO dos números é: " + resultado + "." + " Este número é par e também é " + par_impar);
                } else {
                    System.out.println("A MULTIPLICAÇÃO dos números é: " + resultado + " e este número é ímpar.");
                }
                break;
            case 4:
                resultado = num1 / num2;
                if (resultado >= 0) {
                    par_impar = "positivo.";
                } else {
                    par_impar = "negativo.";
                }
                if (resultado % 2 == 0) {
                    System.out.println("A DIVISÃO dos números é: " + resultado + "." + " Este número é par e também é " + par_impar);
                } else {
                    System.out.println("A DIVISÃO dos números é: " + resultado + " e este número é ímpar.");
                }
                break;
        }

    }
}
