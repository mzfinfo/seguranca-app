package br.com.mzfinfo.controller;

import br.com.mzfinfo.modelo.CarroHonda;

public class TesteInterface {

	public static void main(String[] args) {

		CarroHonda carroHonda = new CarroHonda();
		
		carroHonda.setLigarCarro(true);
		carroHonda.virarEsquerda();
		carroHonda.setDesligarCarro(false);
		carroHonda.virarDireita();
		carroHonda.setDesligarCarro(false);
		
		
	}

}
