package Aula41;

public class Professor extends Pessoa {

	private Double salario;
	private String nomeCurso;

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

	public String obterEtiquetaEndereco() {
		String s = "Endere�o do Professor: ";
		s += super.getEndereco();
		return s;
	}

//	@Override
	public void imprimirEtiquetaEndereco() {
		System.out.println("Imprimindo endere�o do Professor");
		System.out.println(this.obterEtiquetaEndereco());
	}

}
