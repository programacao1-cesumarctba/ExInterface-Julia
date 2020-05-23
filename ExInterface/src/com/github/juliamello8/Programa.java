package com.github.juliamello8;

public class Programa {
	public static void main(String[] args) {
		Automovel carro = new Automovel ();
		carro.setModelo("Carro Sedan");
		carro.setAno(2010);
		carro.setValor(1689.90);
		carro.status();
	}
}
