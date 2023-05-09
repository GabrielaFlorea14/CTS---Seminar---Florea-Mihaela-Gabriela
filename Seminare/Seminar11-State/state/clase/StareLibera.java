package state.clase;

public class StareLibera implements Stare {

	@Override
	public void schimbaStare(MasaRestaurant masa) {
		if(!(masa.getStare() instanceof StareLibera)) {
			masa.setStare(this);
			System.out.println("Masa este eliberata.");
		}
		else {
			System.out.println("Masa este deja libera.");
		}
	}

}
