package factory_method;

public class Infirmier implements PersonalSpital {
	private String nume;
	private int aniVechime;
	
	public Infirmier(String nume, int ani) {
		this.aniVechime = ani;
		this.nume = nume;
	}
	
	public Infirmier(String nume) {
		this.nume = nume;
		this.aniVechime = 0;
	}

	public void setAniVechime(int aniVechime) {
		this.aniVechime = aniVechime;
	}

	@Override
	public void descriere() {
		System.out.println("Infirmierul " + this.nume + " are " + this.aniVechime + " ani vechime.");
	}
}
