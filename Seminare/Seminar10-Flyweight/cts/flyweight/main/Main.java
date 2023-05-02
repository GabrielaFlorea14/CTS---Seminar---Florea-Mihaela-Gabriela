package cts.flyweight.main;

import cts.flyweight.clase.FabricaDeClienti;
import cts.flyweight.clase.IClient;
import cts.flyweight.clase.Rezervare;

public class Main {
	public static void main(String[] args) {
		FabricaDeClienti fabricaDeClienti = new FabricaDeClienti();
		
		Rezervare rezervare1 = new Rezervare(1, 33, 6, 15);
		Rezervare rezervare2 = new Rezervare(2, 8, 2, 19);
		Rezervare rezervare3 = new Rezervare(3, 12, 3, 18);
		Rezervare rezervare4 = new Rezervare(4, 8, 2, 20);

		IClient client1 =  fabricaDeClienti.getClient("Popescu");
		client1.descrieDetaliiRezervare(rezervare1);
		IClient client2 =  fabricaDeClienti.getClient("Ion");
		client2.descrieDetaliiRezervare(rezervare2);
		
		fabricaDeClienti.getClient("Popescu").descrieDetaliiRezervare(rezervare3);
		fabricaDeClienti.getClient("Ion").descrieDetaliiRezervare(rezervare4);

	}
}
