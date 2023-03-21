package cts.clase;

public class Medic implements PersonalSpital {
	private String nume;
	
	public Medic(String nume) {
		this.nume = nume;
	}
	
	@Override
	public void descriere() {
		System.out.println("Medic " + this.nume);
		
	}
}
