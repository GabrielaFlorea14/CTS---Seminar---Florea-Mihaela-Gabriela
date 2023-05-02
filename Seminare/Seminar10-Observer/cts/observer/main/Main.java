package cts.observer.main;

import cts.observer.clase.ClientRestaurant;
import cts.observer.clase.Observer;
import cts.observer.clase.Restaurant;
import cts.observer.clase.Subject;

public class Main {
	public static void main(String[] args) {
		Restaurant restaurant = new Restaurant("Vista");
		
		Observer client1 = new ClientRestaurant("Popescu");
		Observer client2 = new ClientRestaurant("Ion");
		Observer client3 = new ClientRestaurant("Dan");

		restaurant.adaugaObserer(client1);	
		restaurant.adaugaObserer(client2);
		
		restaurant.notificaOfertaPret();
		
		restaurant.stergereObserver(client1);
		restaurant.adaugaObserer(client3);
		
		restaurant.notificaSchimbareMeniu();
		

	}
}
