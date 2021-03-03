/*1. Escreva uma classe para representar uma lâmpada. Desenvolva métodos
para ligar, desligar a lampada
*/

package Aula27.Exercicios;

public class Exer01 {

	public static void main(String[] args) {

		Lampada lampada = new Lampada();
		
		lampada.ligar();
		
		lampada.mostrarEstado();			
		
		lampada.desligar();
		
		lampada.mostrarEstado();
		
		lampada.mudarEstado();
		
		lampada.mostrarEstado();
		
	}
}
