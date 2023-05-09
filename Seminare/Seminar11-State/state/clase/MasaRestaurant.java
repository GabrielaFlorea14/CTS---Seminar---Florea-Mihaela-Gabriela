package state.clase;

public class MasaRestaurant {
	private int nrMasa;
	private Stare stare;
	
	public MasaRestaurant(int nrMasa) {
		super();
		this.nrMasa = nrMasa;
		stare = new StareLibera();
	}
		
	public Stare getStare() {
		return stare;
	}

	protected void setStare(Stare stare) {
		this.stare = stare;
	}

	public void rezervaMasa() {
		Stare rezervata = new StareRezervata();
		rezervata.schimbaStare(this);
	}
	
	public void ocupaMasa() {
		Stare ocupata = new StareOcupata();
		ocupata.schimbaStare(this);
	}
	
	public void elibereazaMasa() {
		Stare libera = new StareLibera();
		libera.schimbaStare(this);
	}
}

