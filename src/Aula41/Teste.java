package Aula41;

public class Teste {

	public static void main(String[] args) {

//		Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();

//		pessoa.setEndereco("Rua 1, numero 1");
		aluno.setEndereco("Rua 2, numero 2");
		professor.setEndereco("Rua 3, numero 3");

//		System.out.println(aluno.obterEtiquetaEndereco());
//		System.out.println(professor.obterEtiquetaEndereco());

		aluno.imprimirEtiquetaEndereco();
		professor.imprimirEtiquetaEndereco();
	}

}
