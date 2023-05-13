package cts.command.main;

import cts.command.clase.Autobuz;
import cts.command.clase.CommandPlecareInCursa;
import cts.command.clase.IAutomobil;
import cts.command.clase.Manager;

public class Main {

	public static void main(String[] args) {
		Manager manager = new Manager();
		IAutomobil autobuz = new Autobuz(1);
		manager.invocaComanda(new CommandPlecareInCursa(312, new Autobuz(2)));
		manager.invocaComanda(new CommandPlecareInCursa(241, autobuz));
		manager.invocaComanda(new CommandPlecareInCursa(73, new Autobuz(3)));
		manager.invocaComanda(new CommandPlecareInCursa(144, autobuz));
		
		manager.executaComanda();
		manager.executaComanda();
		manager.invocaComanda(new CommandPlecareInCursa(313, new Autobuz(4)));
		manager.executaComanda();
		manager.executaComanda();
		manager.executaComanda();
	}

}