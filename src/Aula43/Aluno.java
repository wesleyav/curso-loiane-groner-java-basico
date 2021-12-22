package Aula43;

import java.util.Arrays;
import java.util.Objects;

public class Aluno {

	private String curso;
	private double[] notas;

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

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
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
		String s = "Endere�o do Aluno: ";
//		s += super.getEndereco();
		return s;
	}

//	@Override
	public void imprimirEtiquetaEndereco() {
		System.out.println("Imprimindo endere�o do Aluno");
		System.out.println(this.obterEtiquetaEndereco());
	}

	@Override
	public String toString() {
		return "Aluno [curso=" + curso + ", notas=" + Arrays.toString(notas) + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Aluno other = (Aluno) obj;
		if (curso.equalsIgnoreCase(other.getCurso())) {
			return true;
		}
		return false;
	}

//	public String toString() {
//		String s = curso + "\n";
//		for (double nota : notas) {
//			s += nota + " ";
//		}
//		return s;
//	}

}
