package cts.facade;

public class RestaurantFacade {
	
	private MeseRestaurant meseRestaurant;
	private Ospatar ospatar;
		
	public RestaurantFacade() {
		super();
		meseRestaurant = new MeseRestaurant();
		meseRestaurant.adaugareMasa(new Masa(true,  1, true));
		meseRestaurant.adaugareMasa(new Masa(false,  2, true));
		meseRestaurant.adaugareMasa(new Masa(true,  3, false));
		meseRestaurant.adaugareMasa(new Masa(false,  4, true));
		meseRestaurant.adaugareMasa(new Masa(false,  5, false));
		meseRestaurant.adaugareMasa(new Masa(false,  6, true));
		meseRestaurant.adaugareMasa(new Masa(true,  7, true));
		meseRestaurant.adaugareMasa(new Masa(true,  8, true));

		ospatar = new Ospatar();
		ospatar.esteMasaDebarasata(5);
		ospatar.esteMasaDebarasata(6);
	}

	
public String verificareDisponibilitateMasa(int nrMasa) {
	if(meseRestaurant.esteLibera(nrMasa)) {
		if(ospatar.esteMasaDebarasata(nrMasa) && meseRestaurant.suntServeteleNoi(nrMasa)) {
			return "Masa este libera si puteti lua loc.";	
		} else {
			return "Masa este libera. Asteptati sa fie debarasata.";
		} 
	} else {
		return "Masa nu este libera.";		
		}
	}
}
