package cts.flyweight.clase;

public class Client implements IClient {
	private String nume;
	private String numarTelefon;
	private String adresa;
	public String getNume() {
		return nume;
	}
	
	
	public Client(String nume, String numarTelefon, String adresa) {
		super();
		this.nume = nume;
		this.numarTelefon = numarTelefon;
		this.adresa = adresa;
	}


	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getNumarTelefon() {
		return numarTelefon;
	}
	public void setNumarTelefon(String numarTelefon) {
		this.numarTelefon = numarTelefon;
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}


	@Override
	public void descrieDetaliiRezervare(Rezervare detalii) {
		System.out.println("Clientul " + this.nume + " a rezervat " + detalii.toString());
	}
	
	
}
