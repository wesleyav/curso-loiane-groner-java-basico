/*1. Escreva uma classe para representar uma lâmpada. Desenvolva métodos
para ligar, desligar a lampada.
*/

package Aula33.Exercicios;

public class Lampada {

	private String modelo;
	private String tensao;
	private int potencia;
	private String cor;
	private String tipoLuz;
	private int garantiaMeses;
	private String[] tipos;
	private boolean tipoAbajur;
	private boolean ligada;

	public Lampada(String modelo, String tensao, int potencia, String cor,
			String tipoLuz, int garantiaMeses, String[] tipos,
			boolean tipoAbajur, boolean ligada) {
		this.modelo = modelo;
		this.tensao = tensao;
		this.potencia = potencia;
		this.cor = cor;
		this.tipoLuz = tipoLuz;
		this.garantiaMeses = garantiaMeses;
		this.tipos = tipos;
		this.tipoAbajur = tipoAbajur;
		this.ligada = ligada;
	}
	
	public Lampada() {
		// TODO Auto-generated constructor stub
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTensao() {
		return tensao;
	}

	public void setTensao(String tensao) {
		this.tensao = tensao;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTipoLuz() {
		return tipoLuz;
	}

	public void setTipoLuz(String tipoLuz) {
		this.tipoLuz = tipoLuz;
	}

	public int getGarantiaMeses() {
		return garantiaMeses;
	}

	public void setGarantiaMeses(int garantiaMeses) {
		this.garantiaMeses = garantiaMeses;
	}

	public String[] getTipos() {
		return tipos;
	}

	public void setTipos(String[] tipos) {
		this.tipos = tipos;
	}

	public boolean isTipoAbajur() {
		return tipoAbajur;
	}

	public void setTipoAbajur(boolean tipoAbajur) {
		this.tipoAbajur = tipoAbajur;
	}

	public boolean isLigada() {
		return ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}

	public void ligar() {
		setLigada(true);
	}

	public void desligar() {
		setLigada(false);
	}

	public void mostrarEstado() {
		if (isLigada()) {
			System.out.println("Lâmpada está ligada");
		} else {
			System.out.println("Lâmpada está desligada");
		}
	}

	public void mudarEstado() {
		if (isLigada()) {
			desligar();
		} else {
			ligar();
		}
	}

}
