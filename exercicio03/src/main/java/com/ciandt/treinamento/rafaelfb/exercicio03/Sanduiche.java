package com.ciandt.treinamento.rafaelfb.exercicio03;

public class Sanduiche {

	String pao;
	String salada;
	String recheio;
	String tempero;
	
	public Sanduiche() {
		super();
	}
	
	
	public Sanduiche(String pao, String salada, String recheio, String tempero) {
		super();
		this.pao = pao;
		this.salada = salada;
		this.recheio = recheio;
		this.tempero = tempero;
	}



	public String getPao() {
		return pao;
	}
	public void setPao(String pao) {
		this.pao = pao;
	}
	public String getSalada() {
		return salada;
	}
	public void setSalada(String salada) {
		this.salada = salada;
	}
	public String getRecheio() {
		return recheio;
	}
	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}
	public String getTempero() {
		return tempero;
	}
	public void setTempero(String tempero) {
		this.tempero = tempero;
	}
	
	
}
