package cts.observer.clase;

public interface Subject {
	void adaugaObserer(Observer observer);
	void stergereObserver(Observer observer);
	void notificaAbonati(String mesaj);
}
