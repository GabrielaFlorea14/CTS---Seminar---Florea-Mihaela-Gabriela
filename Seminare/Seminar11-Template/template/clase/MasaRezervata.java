package template.clase;

public class MasaRezervata extends MasaRestaurant {

	private String oraRezervare;
	
	public MasaRezervata(int nrMasa, String oraRezervare) {
		super(nrMasa);
		this.oraRezervare = oraRezervare;
	}

	@Override
	protected void curataMasa() {
		System.out.println("Chelnerul curata masa " + getNrMasa() + " pentru rezervarea de la ora " + this.oraRezervare + ".");		
	}

	@Override
	protected void aseazaServetele() {
		System.out.println("Se aseaza servetele pe masa " + getNrMasa() + " pentru rezervarea de la ora " + this.oraRezervare + ".");		
	}

	@Override
	protected void aseazaTacamuri() {
		System.out.println("Se aseaza tacamuri pe masa " + getNrMasa() + " pentru rezervarea de la ora " + this.oraRezervare + ".");
	}

	@Override
	protected void invitaClienti() {
		System.out.println("Va asteptam la masa " + getNrMasa() + " la ora " + this.oraRezervare + ".");
	}

}
