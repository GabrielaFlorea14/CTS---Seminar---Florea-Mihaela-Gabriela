package cts.singleton;

public class Decan {
	private String nume;
	private static final Decan instanta = new Decan("Dan");

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	private Decan(String nume) {
		super();
		this.nume = nume;
	}
	
	public static Decan getInstanta() {
		return instanta;
	}

	
}
