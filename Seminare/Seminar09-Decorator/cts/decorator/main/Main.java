package cts.decorator.main;

import cts.decorator.clase.Decorator;
import cts.decorator.clase.DecoratorNotaDePlataLaMultiAni;
import cts.decorator.clase.DecoratorNotaDePlataPasteFericit;
import cts.decorator.clase.INotaDePlata;
import cts.decorator.clase.NotaDePlata;

public class Main {

	public static void main(String[] args) {
		INotaDePlata notaDePlata1 = new NotaDePlata("20-03-2023");
		INotaDePlata notaDePlata2 = new NotaDePlata("06-12-2022");
		INotaDePlata notaDePlata3 = new NotaDePlata("20-04-2023");
		
		notaDePlata1.printeazaNotaDePlata(250);
		notaDePlata2.printeazaNotaDePlata(200);
		notaDePlata3.printeazaNotaDePlata(300);
		System.out.println();

		Decorator notaDePlataPasteFericit = new DecoratorNotaDePlataPasteFericit(notaDePlata2);
		notaDePlataPasteFericit.printeazaNotaDePlata(200);
		//notaDePlataPasteFericit.printeazaFelicitare();
		System.out.println();

		//decorare multipla
		Decorator notaDePlataLaMultiAni = new DecoratorNotaDePlataLaMultiAni(notaDePlataPasteFericit);
		notaDePlataLaMultiAni.printeazaNotaDePlata(250);
		//notaDePlataLaMultiAni.printeazaFelicitare();


	}
}
