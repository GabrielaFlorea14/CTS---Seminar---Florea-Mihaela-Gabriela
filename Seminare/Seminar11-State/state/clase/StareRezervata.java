package state.clase;

public class StareRezervata implements Stare {

	@Override
	public void schimbaStare(MasaRestaurant masa) {
		if(masa.getStare() instanceof StareLibera) {
			masa.setStare(this);
			System.out.println("Masa este rezervata in acest moment.");
		}
		else {
			System.out.println("Masa nu mai poate fi rezervata.");
		}
	}

}
