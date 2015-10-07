package com.ciandt.treinamento.rafaelfb.exercicio06;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ciandt.treinamento.rafaelfb.exercicio06.atuador.Ventilador;
import com.ciandt.treinamento.rafaelfb.exercicio06.sensor.SensorDeTemperatura;

public class TesteSensor {

	@Test
	public void test() {

		SensorDeTemperatura sensor = new SensorDeTemperatura();
		Ventilador ventilador = new Ventilador();
		sensor.addObserver(ventilador);
		
		sensor.mudaTemperatura(10);
		assertTrue(!ventilador.isLigado());
		
		sensor.mudaTemperatura(25);
		assertTrue(!ventilador.isLigado());
		
		sensor.mudaTemperatura(26);
		assertTrue(ventilador.isLigado());
		
		sensor.mudaTemperatura(27);
		assertTrue(ventilador.isLigado());
		
		sensor.mudaTemperatura(10);
		assertTrue(!ventilador.isLigado());
		
	}

}
