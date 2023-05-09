package memento.main;

import memento.clase.Autobuz;
import memento.clase.Operator;

public class Main {

	public static void main(String[] args) {
		Autobuz autobuz = new Autobuz("Popescu", 5, "Mercedes", "2010", 50);
		Operator operator = new Operator();

		System.out.println(autobuz.toString());
		
		operator.adaugaMemento(autobuz.creareMemento());
		autobuz.setNumeSofer("Ion");
		autobuz.setConsumMediu(17);
		
		System.out.println(autobuz.toString());

		autobuz.restaurareAutobuz(operator.returneazaMemento(0));
		
		System.out.println(autobuz.toString());

	}

}
