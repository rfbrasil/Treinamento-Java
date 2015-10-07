package com.ciandt.treinamento.rafaelfb.exercicio06.sensor;

import java.util.Observable;

public class SensorDeTemperatura extends Observable {

	private double temperatura;

	public double getTemperatura() {
		return temperatura;
	}

	public void mudaTemperatura(double temperatura) {
		this.temperatura = temperatura;
		setChanged();
		notifyObservers();
	}
	
	
}
