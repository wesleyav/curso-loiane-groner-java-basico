package Aula24.Exercicios;

public class Exer05 {

	public static void main(String[] args) {

		ContaCorrente conta = new ContaCorrente();
		conta.numero = "123456";
		conta.agencia = "1234";
		conta.statusEspecial = true;
		conta.limite = 500;
		conta.saldo = -10;

		System.out.println("Saldo da conta " + conta.numero + " = "	+ conta.saldo);

	}

}
