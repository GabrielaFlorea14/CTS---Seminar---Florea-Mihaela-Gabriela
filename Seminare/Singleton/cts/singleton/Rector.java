package cts.singleton;

public class Rector {
	private String nume;
	private int numarMandate;
	private int varsta;
	
	private static Rector instanta = null;

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getNumarMandate() {
		return numarMandate;
	}

	public void setNumarMandate(int numarMandate) {
		this.numarMandate = numarMandate;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public static Rector getInstanta() {
		return instanta;
	}

	public static void setInstanta(Rector instanta) {
		Rector.instanta = instanta;
	}

	private Rector(String nume, int numarMandate, int varsta) {
		super();
		this.nume = nume;
		this.numarMandate = numarMandate;
		this.varsta = varsta;
	}
	
	public static synchronized Rector getInstanta(String nume, int nrMandate, int varsta) {
		if(instanta == null) {
			instanta = new Rector(nume, nrMandate, varsta);
		}
		return instanta;
	}

	@Override
	public String toString() {
		return "Rector [nume=" + nume + ", numarMandate=" + numarMandate + ", varsta=" + varsta + "]";
	}
	
}
