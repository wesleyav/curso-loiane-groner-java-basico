package Aula27;

import Aula27.Carro;

public class TestaCarro {

	public static void main(String[] args) {

		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;

		System.out.println(van.marca);
		System.out.println(van.modelo);

		van.exibirAutonomia();

		double autonomia = van.obterAutonomia();
		System.out.println("A autonomia do carro é: " + autonomia);
		System.out.println("A autonomia do carro é: " + van.obterAutonomia());
		
		double qtdCombustivel0 = van.calcularCombustivel(10);
		double qtdCombustivel5 = van.calcularCombustivel(15);
		
		System.out.println("qtdCombustivel0 = " + qtdCombustivel0);
		System.out.println("qtdCombustivel5 = " + qtdCombustivel5);

	}

}
