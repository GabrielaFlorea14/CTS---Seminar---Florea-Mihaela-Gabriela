package state.main;

import state.clase.MasaRestaurant;

public class Main {

	public static void main(String[] args) {
		MasaRestaurant masa = new MasaRestaurant(50);
		
		masa.elibereazaMasa();
		masa.rezervaMasa();
		masa.ocupaMasa();
		masa.ocupaMasa();
		masa.rezervaMasa();
		masa.elibereazaMasa();
	}

}
