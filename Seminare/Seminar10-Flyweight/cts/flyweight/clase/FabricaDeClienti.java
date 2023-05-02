package cts.flyweight.clase;

import java.util.HashMap;

public class FabricaDeClienti {
	private HashMap<String, IClient> clienti;
	
	public FabricaDeClienti() { 
		clienti = new HashMap<String, IClient>();
	}
	
	public IClient getClient(String nume) {
		if(clienti.get(nume) != null) {
			return clienti.get(nume);
		} else {
			IClient client = new Client(nume, "Nespecificat", "Nespecificat");
			clienti.put(nume, client);
			return client;
		}
	}
}
