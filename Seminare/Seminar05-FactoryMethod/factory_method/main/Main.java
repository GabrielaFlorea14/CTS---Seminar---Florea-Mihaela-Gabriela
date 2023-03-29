package factory_method.main;

import java.util.ArrayList;
import java.util.List;

import factory_method.Factory;
import factory_method.FactoryAsistent;
import factory_method.FactoryInfirmier;
import factory_method.FactoryMedic;
import factory_method.Infirmier;
import factory_method.PersonalSpital;

public class Main {
	public static void main(String[] args) {
		Factory fabricaAsistenti = new FactoryAsistent();
		Factory fabricaMedici = new FactoryMedic();
		Factory fabricaInfirmieri = new FactoryInfirmier();
		
		Infirmier infirmier = (Infirmier)fabricaInfirmieri.createPersonal("Marinescu Andreea");
		infirmier.setAniVechime(15);
		
		List<PersonalSpital> listaPersonal = new ArrayList<>();
		listaPersonal.add(fabricaAsistenti.createPersonal("Popescu Ion"));
		listaPersonal.add(fabricaMedici.createPersonal("Ionescu Dan"));
		listaPersonal.add(infirmier);
		

		for(PersonalSpital personal: listaPersonal) {
			personal.descriere();
		}
	}
}
