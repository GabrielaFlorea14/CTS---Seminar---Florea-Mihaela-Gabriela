package cts.chain.clase;

public class NotificareEmail extends Notificator {

	@Override
	public void descriereNotificare(Client client, String mesaj) {
		if(client.getAdresaEmail() != null) {
			System.out.println("Clientul " + client.getNume() + " primeste email cu mesajul '" + mesaj + "'.");
		} else {
			if(super.getSuccesor() != null) {
				super.getSuccesor().descriereNotificare(client, mesaj);
			} else {
				System.out.println("Clientul " + client.getNume() + " nu poate fi notificat.");
			}
		}
	}

}
