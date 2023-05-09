package template.clase;

public abstract class MasaRestaurant {
	protected int nrMasa;

	public MasaRestaurant(int nrMasa) {
		super();
		this.nrMasa = nrMasa;
	}
	
	public int getNrMasa() {
		return nrMasa;
	}

	public void setNrMasa(int nrMasa) {
		this.nrMasa = nrMasa;
	}



	protected abstract void curataMasa();
	protected abstract void aseazaServetele();
	protected abstract void aseazaTacamuri();
	protected abstract void invitaClienti();

	public final void ocupaMasa() {
		curataMasa();
		aseazaServetele();
		aseazaTacamuri();
		invitaClienti();
	}
}
