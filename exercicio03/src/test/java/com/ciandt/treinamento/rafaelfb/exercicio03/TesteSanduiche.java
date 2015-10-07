package com.ciandt.treinamento.rafaelfb.exercicio03;

import static org.junit.Assert.*;
import org.junit.Test;

public class TesteSanduiche {

	@Test
	public void test() {
		Sanduiche sanduiche = new Sanduiche();
		
		sanduiche.setPao("Integral");
		sanduiche.setSalada("Alface");
		sanduiche.setTempero("Azeite");
		sanduiche.setRecheio("Presunto");
		
		Sanduiche sanduiche2 = new Sanduiche("Aveia", null, null, "Queijo");
		
		assertNotNull(sanduiche);
	}
	
	@Test
	public void testMonta() {
		Sanduiche monta = new MontaSanduiche();
		
		.escolherPao("Integral");
		.escolherSalada("Alface");
		.colocarTempero("Azeite");
		.escolherRecheio("Presunto");
		
		Sanduiche sanduiche = monta.build();
		
		assertNotNull(sanduiche);
	}
}
