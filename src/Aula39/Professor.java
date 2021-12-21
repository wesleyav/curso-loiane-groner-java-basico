package Aula39;

public class Professor extends Pessoa {

	private Double salario;
	private String nomeCurso;

	public void verificarAcesso() {
		this.nomeVisibilidade = "Maria";
		super.nomeVisibilidade = "Maria";

		super.setNomeVisibilidade("Maria");
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public double calcularSalarioLiquido() {
		return 0;
	}

}
