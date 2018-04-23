package br.com.mzfinfo.interfaces;

public interface Carro {

	boolean possuiCor = true;
	
	void virarEsquerda();
	void virarDireita();
	void acelerarCarro();
	void frearCarro();
	void setLigarCarro(boolean ligarCarro);
	void setDesligarCarro(boolean desligarCarro);

}
