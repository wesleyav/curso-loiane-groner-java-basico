package Aula24.Exercicios;

import java.util.Date;

public class Exer04 {

	public static void main(String[] args) {

		LivroDeBiblioteca livro = new LivroDeBiblioteca();
		
		livro.nome = "Mastering ExtJS";
		livro.autor = "Loiane Groner";
		livro.anoLancamento = 2015;
		livro.preco = 63.39;
		
		livro.emprestado = true;
		livro.dataEntrega = new Date();
		livro.emprestadoA = "Loiane";

		System.out.println("Nome do livro = " + livro.nome);
		System.out.println("Nome do autor= " + livro.autor);
		System.out.println("Ano de lançamento = " + livro.anoLancamento);
		System.out.println("Emprestado: " + livro.emprestadoA);
		System.out.println("Data de entrega: " + livro.dataEntrega);
		System.out.println("Emprestado a quem: " + livro.emprestadoA);
	}

}
