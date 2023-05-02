package cts.observer.clase;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements Subject {
	private String nume;
	private List<Observer> clientiAbonati;
	
	public Restaurant(String nume) {
		super();
		this.nume = nume;
		this.clientiAbonati = new ArrayList<>();
	}

	@Override
	public void adaugaObserer(Observer observer) {
		this.clientiAbonati.add(observer);
	}

	@Override
	public void stergereObserver(Observer observer) {
		this.clientiAbonati.remove(observer);
	}

	@Override
	public void notificaAbonati(String mesaj) {
		for(Observer clientAbonat:  this.clientiAbonati) {
			clientAbonat.receptioneazaNotificare(mesaj);
		}
	}
	
	public void notificaOfertaPret() {
		this.notificaAbonati(this.nume +": Sunt reduceri de pret la ingheata.");
	}
	
	public void notificaSchimbareMeniu() {
		this.notificaAbonati(this.nume +": Avem noi tipuri de paste.");
	}
}
