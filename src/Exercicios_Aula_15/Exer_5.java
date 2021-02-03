/*
Faça um programa para a leitura de duas notas parciais de um aluno.
O programa deve calcular a média alcançada por aluno e apresentar:
+ A mensagem "Aprovado", se a média alcançada for maior ou
igual a sete;
o A mensagem "Reprovado", se a média for menor do que sete;
o A mensagem "Aprovado com Distinção", se a média for igual a
dez
 */
package Exercicios_Aula_15;

import java.util.Scanner;

public class Exer_5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        int nota1 = scan.nextInt();

        System.out.println("Digite a segunda nota:");
        int nota2 = scan.nextInt();

        int media = (nota1 + nota2) / 2;
        System.out.println("A média final é: " + media);

        if (media >= 7 && media < 10) {
            System.out.println("Aprovado");
        } else if (media < 7) {
            System.out.println("Reprovado");
        } else if (media == 10) {
            System.out.println("Aprovado com Distinção");
        }

    }
}
