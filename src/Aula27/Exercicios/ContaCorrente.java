package Aula27.Exercicios;

public class ContaCorrente {

	String numero;
	String agencia;
	boolean especial;
	double valorEspecialUsado;
	double limiteEspecial;
	double saldo;
	
	boolean realizarSaque(double valorASacar){

		if (saldo >= valorASacar) {
			saldo -= valorASacar;
			return true;
		}else{
			if (especial) {
				double limite = limiteEspecial + saldo;
				if (limite >= valorASacar) {
					saldo -= valorASacar;
					return true;
				}else{
					return false;
				}
			}else{
				return false;
			}
		}		
	}
	
	void depositar(double valorDepositado){
		
		saldo += valorDepositado;
	}

	void consultarSaldo(){
		System.out.println("Saldo atual da conta = " + saldo);
	}
	
	boolean verificarUsoChequeEspecial(){
		return saldo < 0;
	}
}
