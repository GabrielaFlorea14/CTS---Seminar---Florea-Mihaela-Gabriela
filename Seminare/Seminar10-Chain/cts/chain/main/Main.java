package cts.chain.main;

import cts.chain.clase.Client;
import cts.chain.clase.NotificareEmail;
import cts.chain.clase.NotificareTelefon;
import cts.chain.clase.Notificator;
import cts.chain.clase.NotificatorManager;

public class Main {
	public static void main(String[] args) {
		
		Notificator notificatorTelefon = new NotificareTelefon();
		Notificator notificatorEmail = new NotificareEmail();
		Notificator notificatorManager = new NotificatorManager();
		
		notificatorEmail.setSuccesor(notificatorTelefon);
		notificatorTelefon.setSuccesor(notificatorManager);
		
		Client client1 = new Client("Popescu", "0763223472", "popescu@gmail.com");
		Client client2 = new Client("Ion", "0763223472", null);
		Client client3 = new Client("Dan", null, "dan@gmail.com");
		Client client4 = new Client("Marinescu", null, null);
		
		notificatorEmail.descriereNotificare(client1, "Masa a fost rezervata.");
		notificatorEmail.descriereNotificare(client2, "Rezervarea a fost anulata.");
		notificatorEmail.descriereNotificare(client3, "Aveti un cupon de reducere de 10%.");
		notificatorEmail.descriereNotificare(client4, "Masa a fost rezervata.");

	}
}
