/*
.Faça um programa para o cálculo de uma folha de pagamento,
sabendo que os descontos são do Imposto de Renda, que depende do 
salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o
FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é
a empresa que deposita). O Salário Líquido corresponde ao Salário
Bruto menos os descontos. O programa deverá pedir ao usuário o
valor da sua hora e a quantidade de horas trabalhadas no mês.
+ Desconto do IR:
o Salário Bruto até 900 (inclusive) - isento
o Salário Bruto até 1500 (inclusive) - desconto de 5%
o Salário Bruto até 2500 (inclusive) - desconto de 10%
o Salário Bruto acima de 2500 - desconto de 20%. Imprima na tela
as informações, dispostas conforme o exemplo abaixo. No
exemplo o valor da hora é 5 e a quantidade de hora é 220.

Salário Bruto (5 * 220)	:R$ 1100,00
(-) IR (5%)		:R$ 55,00
(-) INSS (10%)		:R$ 110,00
FGTS (11%)		:R$ 121,00
Total de descontos	:R$ 165,00
Salário Líquido		:R$ 935,00
 */
package Aula15.Exercicios;

import java.util.Scanner;

public class Exer_12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor da hora trabalhada:");
        double valorHora = scan.nextDouble();

        System.out.println("Informe o total de horas trabalhadas no mês:");
        double horasMes = scan.nextDouble();

        //Salário Bruto (5 * 220)	:R$ 1100,00
        double salarioBruto = valorHora * horasMes;
        System.out.println("Salário bruto: ----------------------- R$ " + salarioBruto);

        //(-) IR (5%)		:R$ 55,00
        double ir = (salarioBruto * 5) / 100;
        System.out.println("IR: ---------------------------------- R$ " + ir);
        //(-) INSS (10%)	:R$ 110,00
        double inss = (salarioBruto * 10) / 100;
        System.out.println("INSS: -------------------------------- R$ " + inss);
        //FGTS (11%)		:R$ 121,00
        double fgts = (salarioBruto * 11) / 100;
        System.out.println("Salário bruto: ----------------------- R$ " + fgts);
        //Total de descontos	:R$ 165,00
        double totalDescontos = ir + inss + fgts;
        System.out.println("Total de Descontos: ------------------ R$ " + totalDescontos);
        //Salário Líquido	:R$ 935,00
        double salarioLiquido = salarioBruto - totalDescontos;
        System.out.println("Salário Líquido: --------------------- R$ " + salarioLiquido);
    }
}
;
