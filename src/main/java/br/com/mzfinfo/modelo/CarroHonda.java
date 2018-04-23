package br.com.mzfinfo.modelo;

import br.com.mzfinfo.interfaces.Carro;

public class CarroHonda implements Carro {

	private boolean carroLigado;

	public CarroHonda() {
		setDesligarCarro(Boolean.FALSE);
	}

	public void virarEsquerda() {

		validarCarro();
		System.out.println("Carro virar esquerda ativado.");
		System.out.println("Carro possui cor? " + (Carro.possuiCor ? "Sim" : "Não"));
		System.out.println("Virar carro a esquerda.");
	}

	public void virarDireita() {
		
		validarCarro();
		System.out.println("Carro virar direita ativado.");
		System.out.println("Carro possui cor? " + (Carro.possuiCor ? "Sim" : "Não"));
		System.out.println("Virar carro a direita.");

	}

	public void acelerarCarro() {
		System.out.println("Carro acelarado !!");
	}

	public void frearCarro() {
		System.out.println("Carro freado.");
	}

	public void setLigarCarro(boolean ligarCarro) {
		this.carroLigado = ligarCarro;

	}

	public void setDesligarCarro(boolean desligarCarro) {
		this.carroLigado = desligarCarro;

	}

	private void validarCarro() {
		if (!Boolean.TRUE.equals(this.carroLigado)) {
			setLigarCarro(Boolean.TRUE);
			acelerarCarro();
		}
	}

}
