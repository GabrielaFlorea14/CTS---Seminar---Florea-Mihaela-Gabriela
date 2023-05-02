package cts.chain.clase;

public class NotificareTelefon extends Notificator {

	@Override
	public void descriereNotificare(Client client, String mesaj) {
		if(client.getNumarTelefon() != null) {
			System.out.println("Clientul " + client.getNume() + " primeste SMS cu mesajul '" + mesaj + "'.");
		} else {
			if(super.getSuccesor() != null) {
				super.getSuccesor().descriereNotificare(client, mesaj);
			} else {
				System.out.println("Clientul " + client.getNume() + " nu poate fi notificat.");
			}
		}
	}

}
