package cts.strategy.main;

import cts.strategy.clase.Client;
import cts.strategy.clase.PlataCard;

public class Main {
	
	public static void main(String[] args) {
		Client client = new Client("Popescu");
		client.realizeazaPlata(200.0);
		client.setModPlata(new PlataCard());
		
		client.realizeazaPlata(120.0);
	}
			
}
