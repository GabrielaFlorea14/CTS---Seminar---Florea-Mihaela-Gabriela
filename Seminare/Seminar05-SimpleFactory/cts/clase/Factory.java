package cts.clase;

public class Factory {
	public Factory() {
		
	}
	
	public PersonalSpital createInstance(TipPersonalSpital tipPersonalSpital, String numePersonal)
	{
		switch(tipPersonalSpital) {
		case Medic: 
			return new Medic(numePersonal);
		case Asistent: 
			return new Asistent(numePersonal);
		case Brancardier: 
			return new Brancardier(numePersonal);
		case Anestezist:
			return new Anestezist(numePersonal);
		default:
			return null;
		}
		
	}
}
