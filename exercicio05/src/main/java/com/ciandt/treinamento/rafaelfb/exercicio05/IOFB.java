package com.ciandt.treinamento.rafaelfb.exercicio05;

public class IOFB extends TemplateImpostoMaiorMenor {

	@Override
	public boolean isAliquotaMenor(Produto produto) {
		// TODO Auto-generated method stub
		return produto.getValor() < 500 && produto.isVestuario();
	}

	@Override
	public double calculoAliquotaMenor(Produto produto) {
		// TODO Auto-generated method stub
		return produto.getValor() * 0.05;
	}

	@Override
	public double calculoAliquotaMaior(Produto produto) {
		// TODO Auto-generated method stub
		return produto.getValor() * 0.09;
	}

}
