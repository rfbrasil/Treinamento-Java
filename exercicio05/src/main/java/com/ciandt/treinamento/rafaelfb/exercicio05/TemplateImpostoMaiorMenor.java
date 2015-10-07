package com.ciandt.treinamento.rafaelfb.exercicio05;

public abstract class TemplateImpostoMaiorMenor implements Imposto {

	public double calculo(Produto produto) {
		
		if (isAliquotaMenor(produto)) {
			return calculoAliquotaMenor(produto);
		} else {
			return calculoAliquotaMaior(produto);
		}
		
	}
	
	public abstract boolean isAliquotaMenor(Produto produto);
	public abstract double calculoAliquotaMenor(Produto produto);
	public abstract double calculoAliquotaMaior(Produto produto);
	
	
}
