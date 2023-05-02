package cts.chain.clase;

public class NotificatorManager extends Notificator {

	@Override
	public void descriereNotificare(Client client, String mesaj) {
		System.out.println("Pentru clientul " + client.getNume() + " nu avem date de contact.");
	}
	
}
