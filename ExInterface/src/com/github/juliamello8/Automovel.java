package com.github.juliamello8;

public class Automovel {
	private String modelo;
	private int ano;
	private double valor;
	
	public String getModelo(){
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public void status() {
		System.out.print("Automóvel do tipo:" + getModelo() + "\n");
		System.out.print("Ano do automóvel:" + getAno()  + "\n");
		System.out.print("Valor:" + getValor() + "\n");
	}
}
