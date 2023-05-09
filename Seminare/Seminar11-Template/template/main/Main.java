package template.main;

import template.clase.MasaLocala;
import template.clase.MasaRestaurant;
import template.clase.MasaRezervata;

public class Main {

	public static void main(String[] args) {
		MasaRestaurant masaLocala = new MasaLocala(25);
		masaLocala.ocupaMasa();
		
		MasaRestaurant masaRezervata = new MasaRezervata(30, "19:00");
		masaRezervata.ocupaMasa();
	}

}
