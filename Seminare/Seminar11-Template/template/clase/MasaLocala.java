package template.clase;

public class MasaLocala extends MasaRestaurant {

	public MasaLocala(int nrMasa) {
		super(nrMasa);
	}

	@Override
	protected void curataMasa() {
		System.out.println("Chelnerul curata masa " + getNrMasa() + " deoarece clientii asteapta la usa.");
	}

	@Override
	protected void aseazaServetele() {
		System.out.println("Se aseaza servetele pe masa " + getNrMasa() + " pentru clientii care asteapta la usa.");
	}

	@Override
	protected void aseazaTacamuri() {
		System.out.println("Se aseaza tacamuri pe masa " + getNrMasa() + " pentru clientii care asteapta la usa.");
	}

	@Override
	protected void invitaClienti() {
		System.out.println("Se invita clientii la masa " + getNrMasa() + ".");	
	}

}
