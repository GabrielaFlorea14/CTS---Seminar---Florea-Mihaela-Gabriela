package state.clase;

public class StareOcupata implements Stare {

	@Override
	public void schimbaStare(MasaRestaurant masa) {
		if(!(masa.getStare() instanceof StareOcupata)) {
			masa.setStare(this);
			System.out.println("Masa este ocupata in acest moment.");
		}
		else {
			System.out.println("Masa nu mai poate fi ocupata.");
		}
	}

}
