// Criado por Edilson do Nascimento

package br.edu.utfpr.pos;

public class Motor {

	private int qtdPist;
	private int potencia;

	public Motor() {
		this.qtdPist = 0;
		this.potencia = 0;
	}

	public Motor(int qtdPist, int potencia) {
		this.qtdPist = qtdPist;
		this.potencia = potencia;
	}

	public int getQtdPist() {
		return qtdPist;
	}

	public void setQtdPist(int qtdPist) {
		this.qtdPist = qtdPist;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return " \nDETALHES DO MOTOR: \n - Pistoes: " + qtdPist + "\n - Potencia: " + potencia;
	}

}
