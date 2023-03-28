package cts.builder.main;

import cts.builder.Pacient;
import cts.builder.PacientBuilder;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PacientBuilder pacientBuilder = new PacientBuilder("Popescu");
		Pacient pacient1 = pacientBuilder.setMicDejunInclus(true).setPapuciDeCamera(true).build();
		Pacient pacient2 = new PacientBuilder("Ion").setPapuciDeCamera(true).setPatRabatabil(true).build();
		Pacient pacient3 = new PacientBuilder("Ioana").setMicDejunInclus(true).setPatRabatabil(true).build();
		Pacient pacient4 = new PacientBuilder("Maria").build();
		//fiecare instanta va fi creata cu un nou builder, altfel va returna aceeasi instanta mereu (ultima declarata)
	    Pacient pacient5 = pacientBuilder.setPatRabatabil(true).build();
		//daca vrem sa modificam ceva la un pacient, trebuie sa modificam in builder
		System.out.println(pacient1.toString());
		System.out.println(pacient2.toString());
		System.out.println(pacient3.toString());
		System.out.println(pacient4.toString());
		System.out.println(pacient5.toString());


	}

}
