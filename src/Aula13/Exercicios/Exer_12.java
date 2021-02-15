/*
Tendo como dados de entrada a altura de uma pessoa, construa um
algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
(72.7*altura) - 58.
 */
package Aula13.Exercicios;

import java.util.Scanner;

public class Exer_12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe sua altura:");
        double altura = scan.nextDouble();

        double peso_Ideal;

        peso_Ideal = (72.7 * altura) - 58;

        System.out.println("O peso ideal é: " + peso_Ideal);
    }
}
