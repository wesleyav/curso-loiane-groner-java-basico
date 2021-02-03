/*
Faça um Programa que pergunte em que turno você estuda. Peça
para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
Inválido!", conforme o caso
 */
package Exercicios_Aula_15;

import java.util.Scanner;

public class Exer_10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Em que turno você estuda? (M- matutino; V- vespertino; N- noturno)");
        String turno = scan.next();

        if (turno.equalsIgnoreCase("m")) {
            System.out.println("Bom dia! (Usando IF ELSE)");
        } else if (turno.equalsIgnoreCase("v")) {
            System.out.println("Boa tarde!(Usando IF ELSE)");
        } else if (turno.equalsIgnoreCase("n")) {
            System.out.println("Boa noite! (Usando IF ELSE)");
        }

        //Switch Case
        switch (turno) {
            case "m":
            case "M":
                System.out.println("Bom dia!");
                break;
            case "v":
            case "V":
                System.out.println("Boa tarde!");
                break;
            case "n":
            case "N":
                System.out.println("Boa noite!");
                break;
            default:
                System.out.println("Valor inválido");
        }
    }
}
