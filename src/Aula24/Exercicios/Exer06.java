package Aula24.Exercicios;

public class Exer06 {

	public static void main(String[] args) {

		Contato contato1 = new Contato();
		contato1.nome = "João";
		contato1.endereco = "Avenida Paulista";
		contato1.email = "joao@email.com";

		contato1.telefones = new String[2];
		contato1.telefones[0] = "99999-9999";
		contato1.telefones[1] = "98888-8888";

		System.out.println("Nome: " + contato1.nome);
		System.out.println("Endereço: " + contato1.endereco);
		System.out.println("Email: " + contato1.email);

		for (int i = 0; i < contato1.telefones[i].length(); i++) {
			System.out.println("Telefone: " + contato1.telefones[i]);
		}

	}
}
