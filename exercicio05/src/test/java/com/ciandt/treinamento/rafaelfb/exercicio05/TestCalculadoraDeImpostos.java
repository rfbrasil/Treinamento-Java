package com.ciandt.treinamento.rafaelfb.exercicio05;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculadoraDeImpostos {

	@Test
	public void testeIOFA() {
		
		Produto produto1 = new Produto();
		produto1.setNome("Celular");
		produto1.setValor(1000);
		
		Produto produto2 = new Produto();
		produto2.setNome("Camisa");
		produto2.setValor(100);
		produto2.setVestuario(true);
		
		CalculadoraDeImposto calculadora = new CalculadoraDeImposto();
		
		double imposto1 = calculadora.calcular(produto1, new IOFA());
		double imposto2 = calculadora.calcular(produto2, new IOFA());
		
		System.out.println(imposto1);
		assertTrue(imposto1 == 100.0);
		
		System.out.println(imposto2);
		assertTrue(imposto2 == 5.0);
		
	}

}
