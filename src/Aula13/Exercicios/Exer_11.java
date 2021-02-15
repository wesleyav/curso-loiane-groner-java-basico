/*
Faça um Programa que peça 2 números inteiros e um número real.
Calcule e mostre:
a. o produto do dobro do primeiro com metade do segundo .
b. a soma do triplo do primeiro com o terceiro.
c. o terceiro elevado ao cubo.
 */
package Aula13.Exercicios;

import java.util.Scanner;

public class Exer_11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro número do tipo inteiro:");
        int n1 = scan.nextInt();

        System.out.println("Informe o segundo número do tipo inteiro:");
        int n2 = scan.nextInt();

        System.out.println("Informe um número do tipo real:");
        double n3 = scan.nextDouble();

        double resultado_a, resultado_b, resultado_c;
        
        //o produto do dobro do primeiro com metade do segundo .
        resultado_a = (n1 * 2) + (n2 / 2);
        System.out.println("O produto do dobro do primeiro com metade do segundo é: " + resultado_a);

        //a soma do triplo do primeiro com o terceiro.
        resultado_b = (n1 * 3) + n3;
        System.out.println("A soma do triplo do primeiro com o terceiro é: " + resultado_b);

        //o terceiro elevado ao cubo.
        resultado_c = (n3 * n3 * n3);
        System.out.println("O terceiro elevado ao cubo é: " + resultado_c);
    }
}
