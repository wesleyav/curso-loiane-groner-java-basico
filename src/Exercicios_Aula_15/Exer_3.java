/*
Faça um Programa que verifique se uma letra digitada é "F" ou "M".
Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
 */
package Exercicios_Aula_15;

import java.util.Scanner;

public class Exer_3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o sexo (F ou M)");
        String letra = scan.next();

        if (letra.equalsIgnoreCase("f")) {
            System.out.println("F- feminino");
        } else if (letra.equalsIgnoreCase("m")) {
            System.out.println("M- Masculino");
        } else {
            System.out.println("Sexo inválido.");
        }

    }
}
