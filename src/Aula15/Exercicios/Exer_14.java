/*
Faça um programa que lê as duas notas parciais obtidas por um aluno
numa disciplina ao longo de um semestre, e calcule a sua média. A
atribuição de conceitos obedece à tabela abaixo:
o Média de Aproveitamento Conceito
o Entre 9.0 e 10.0 A
o Entre 7.5 e 9.0 B
o Entre 6.0 e 7.5 C
o Entre 4.0 e 6.0 D
o Entre 4.0 e zero E

O algoritmo deve mostrar na tela as notas, a média, o conceito
correspondente e a mensagem “APROVADO” se o conceito for
A, B ou C ou “REPROVADO” se o conceito for D ou E.
 */
package Aula15.Exercicios;

import java.util.Scanner;

public class Exer_14 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        int nota1 = scan.nextInt();

        System.out.println("Digite a primeira nota:");
        int nota2 = scan.nextInt();

        int media = (nota1 + nota2) / 2;

        if (media >= 9 && media <= 10) {
            System.out.println("Suas notas foram: " + nota1 + " e " + nota2 + " . A média obtida foi: " + media + " com coneito A, portanto você está APROVADO.");
        } else if (media >= 7.5 && media <= 9) {
            System.out.println("Suas notas foram: " + nota1 + " e " + nota2 + " . A média obtida foi: " + media + " com coneito B, portanto você está APROVADO.");
        } else if (media >= 6 && media < 7.5) {
            System.out.println("Suas notas foram: " + nota1 + " e " + nota2 + " . A média obtida foi: " + media + " com coneito C, portanto você está APROVADO.");
        } else if (media > 4 && media < 6) {
            System.out.println("Suas notas foram: " + nota1 + " e " + nota2 + " . A média obtida foi: " + media + " com coneito D, portanto você está REPROVADO.");
        } else if (media <= 4 && media >= 0) {
            System.out.println("Suas notas foram: " + nota1 + " e " + nota2 + " . A média obtida foi: " + media + " com coneito E, portanto você está REPROVADO.");
        }
    }
}
