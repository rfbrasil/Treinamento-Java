package com.ciandt.treinamento.rafaelfb.exercicio03;

public class SanduicheBuilder {

	protected String pao;
	protected String salada;
	protected String recheio;
	protected String tempero;
	
	public SanduicheBuilder escolherPao(String pao) {
		this.pao = pao;
		return this;
	}
	
	public SanduicheBuilder escolherSalada(String salada) {
		this.salada = salada;
		return this;
	}
	
	public SanduicheBuilder colocarTempero(String tempero) {
		this.tempero = tempero;
		return this;
	}
	
	public SanduicheBuilder escolherRecheio(String recheio) {
		this.recheio = recheio;
		return this;
	}
	
	public Sanduiche build() {
		return new Sanduiche(this);
			
		return sanduiche;
	}
}
