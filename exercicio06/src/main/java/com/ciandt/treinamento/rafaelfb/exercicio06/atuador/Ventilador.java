package com.ciandt.treinamento.rafaelfb.exercicio06.atuador;

import java.util.Observable;
import java.util.Observer;

import com.ciandt.treinamento.rafaelfb.exercicio06.sensor.SensorDeTemperatura;

public class Ventilador implements Observer {

	private boolean ligado = false;

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	@Override
	public void update(Observable o, Object arg) {

		SensorDeTemperatura sensor = (SensorDeTemperatura) o;

		if (sensor.getTemperatura() > 25) {
			ligar();
		} else {
			desliga();
		}

	}

	private void desliga() {
		// TODO Auto-generated method stub
		if (ligado) {
			this.ligado = false;
			System.out.println("Desligando ventilador...");
		}
	}

	private void ligar() {
		// TODO Auto-generated method stub
		if (!ligado) {
			this.ligado = true;
			System.out.println("Ligando ventilador....");
		}
	}
}
