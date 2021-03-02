/*4. Usando o resultado do modelo “Livro” como base, crie uma classe
“LivroDeBiblioteca” que represente os dados básicos de um livro de uma
biblioteca, que pode ser emprestado a leitores.
*/

package Aula24.Exercicios;

import java.util.Date;

public class LivroDeBiblioteca {
	
	String nome;
	String autor;
	int qtdPaginas;
	int anoLancamento;
	String isbn;
	
	boolean emprestado;
	Date dataEntrega;
	String emprestadoA;
	double preco;
}
