package cts.clase.main;

import java.util.ArrayList;
import java.util.List;

import cts.clase.Factory;
import cts.clase.PersonalSpital;
import cts.clase.TipPersonalSpital;
import cts.clase.Asistent;
import cts.clase.Medic;

public class MainSpital {
	public static void main(String[] args) {
		Factory factory = new Factory();
		PersonalSpital asistent = factory.createInstance(TipPersonalSpital.Asistent, "Popescu");
		PersonalSpital medic = factory.createInstance(TipPersonalSpital.Medic, "Ionescu");
		PersonalSpital brancardier = factory.createInstance(TipPersonalSpital.Brancardier, "Vasilescu");
	
		asistent.descriere();
		medic.descriere();
		brancardier.descriere();
	
		
		List<PersonalSpital> listaPersonal = new ArrayList<>();
		listaPersonal.add(brancardier);
		listaPersonal.add(medic);
		listaPersonal.add(asistent);
		listaPersonal.add(factory.createInstance(TipPersonalSpital.Brancardier, "Marinescu"));
		listaPersonal.add(factory.createInstance(TipPersonalSpital.Anestezist, "Gavrilescu"));
		listaPersonal.add(factory.createInstance(TipPersonalSpital.Medic, "Andreescu"));
		listaPersonal.add(factory.createInstance(TipPersonalSpital.Anestezist, "Cristescu"));
		listaPersonal.add(factory.createInstance(TipPersonalSpital.Anestezist, "Marinescu"));
		
		for(PersonalSpital personal : listaPersonal)
		{
			personal.descriere();
		} 
	}
}



