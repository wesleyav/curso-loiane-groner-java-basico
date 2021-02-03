/*
Faça um Programa que pergunte quanto você ganha por hora e o
número de horas trabalhadas no mês. Calcule e mostre o total do seu
salário no referido mês.
 */
package Exercicios_Aula_13;

import java.util.Scanner;

public class Exer_8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe quanto você ganha por hora:");
        int hora = scan.nextInt();

        System.out.println("Informe quantas horas você trabalha por mês:");
        int mes = scan.nextInt();

        double salario = hora * mes;
        System.out.println("O seu salário mensal é de R$: " + salario);
    }
}
