package Aula42;

public class Aluno {

	private String curso;
	private Double[] notas;

	public Aluno() {
		super();
	}

	public Aluno(String nome, String endereco, String telefone) {
//		super(nome, endereco, telefone);
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
//		super.setCpf("99999999999");
	}

	public String obterEtiquetaEndereco() {
		String s = "Endereço do Aluno: ";
//		s += super.getEndereco();
		return s;
	}

//	@Override
	public void imprimirEtiquetaEndereco() {
		System.out.println("Imprimindo endereço do Aluno");
		System.out.println(this.obterEtiquetaEndereco());
	}

}
