package Aula33.Exercicios;

public class Exer02 {

	public static void main(String[] args) {

		ContaCorrente conta = new ContaCorrente();
		conta.setNumero("123456");
		conta.setAgencia("1234");
		conta.setEspecial(true);
		conta.setLimiteEspecial(500);
		conta.setValorEspecialUsado(0);
		conta.setSaldo(-10);

		System.out.println("Saldo da conta " + conta.getNumero() + " = "
				+ conta.getSaldo());

		boolean saqueEfetuado = conta.realizarSaque(10);

		if (saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso!");
			conta.consultarSaldo();
		} else {
			System.out.println("Saldo insuficiente");
		}

		saqueEfetuado = conta.realizarSaque(500);
		System.out.println("Tentativa de saque de 500");
		if (saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso!");
			conta.consultarSaldo();
		} else {
			System.out.println("Saldo insuficiente");
		}

		System.out.println("Depósito de 500");
		conta.depositar(500);
		conta.consultarSaldo();

		if (conta.verificarUsoChequeEspecial()) {
			System.out.println("Está usando cheque especial.");
		} else {
			System.out.println("Não está usando cheque especial.");
		}

		conta.realizarSaque(600);
		conta.consultarSaldo();
		if (conta.verificarUsoChequeEspecial()) {
			System.out.println("Está usando cheque especial.");
		} else {
			System.out.println("Não está usando cheque especial.");
		}
	}

}
