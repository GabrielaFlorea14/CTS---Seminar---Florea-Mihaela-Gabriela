package factory_method;

public class FactoryInfirmier implements Factory {

	@Override
	public PersonalSpital createPersonal(String nume) {
		return new Infirmier(nume); //sau return new Infirmier(nume, 0); pentru constructorul cu 2 parametrii
	}

}
