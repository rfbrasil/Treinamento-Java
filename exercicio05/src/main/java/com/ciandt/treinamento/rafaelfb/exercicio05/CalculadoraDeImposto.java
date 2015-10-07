package com.ciandt.treinamento.rafaelfb.exercicio05;

public class CalculadoraDeImposto {

	public double calcular(Produto produto, Imposto imposto) {
		return imposto.calculo(produto);
	}
}
