package cts.strategy.clase;

public class PlataCash implements ModPlata {

	public void plateste(String numeClient, double sumaDePlata) {
		System.out.println("Clientul " + numeClient + " realizeaza plata cash pentru suma de " + sumaDePlata);
	}
	
}
