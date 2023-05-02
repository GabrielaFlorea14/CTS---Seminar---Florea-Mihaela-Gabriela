package cts.strategy.clase;

public class PlataCard implements ModPlata {

	public void plateste(String numeClient, double sumaDePlata) {
		System.out.println("Clientul " + numeClient + " realizeaza plata cu cardul pentru suma de " + sumaDePlata);
	}
}
