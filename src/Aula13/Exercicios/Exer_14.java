/*
Faça um programa que peça o tamanho de um arquivo para download
(em MB) e a velocidade de um link de Internet (em Mbps), calcule e
informe o tempo aproximado de download do arquivo usando este link
(em minutos).
 */
package Aula13.Exercicios;

import java.util.Scanner;


public class Exer_14 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho do arquivo para download (em Mb):");
        double arquivo = scan.nextDouble();

        System.out.println("Digite a velocidade do seu link (em Mbps)");
        double link = scan.nextDouble();

        double tempo = arquivo / link;

        System.out.println("O tempo de download é de: " + tempo);

    }
}
