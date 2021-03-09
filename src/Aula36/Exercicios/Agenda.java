package Aula36.Exercicios;

public class Agenda {

	private String nome;
	private Contato[] contatos;

	public Agenda() {

	}

	public Agenda(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Contato[] getContatos() {
		return contatos;
	}

	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}

	public String obterInfo() {
		String info = "Nome = " + nome + "\n";

		if (contatos != null) {
			for (Contato c : contatos) {
				info += c.obterInfo() + "\n";
			}
		}

		return info;
	}

}
