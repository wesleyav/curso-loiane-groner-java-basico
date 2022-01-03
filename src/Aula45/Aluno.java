package Aula45;

public class Aluno extends Pessoa {

	private String curso;
	private Double[] notas;

	public Aluno() {
		super();
	}

	public Aluno(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Double[] getNotas() {
		return notas;
	}

	public void setNotas(Double[] notas) {
		this.notas = notas;
	}

	public double calcularMedia() {
		return 0;
	}

	public boolean verificarAprovado() {
		return true;
	}

	public void metodoQualquer() {
		super.setCpf("99999999999");
	}

	public String obterEtiquetaEndereco() {
		String s = "Endere�o do Aluno: ";
		s += super.getEndereco();
		return s;
	}

}
