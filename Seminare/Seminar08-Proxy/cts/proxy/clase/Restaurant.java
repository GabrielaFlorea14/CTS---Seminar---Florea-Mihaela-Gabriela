package cts.proxy.clase;

public class Restaurant implements IRestaurant {
	private String nume;

	public Restaurant(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void rezervaMasa(int numarPersoane) {
		System.out.println("Masa a fost rezervata pentru " + numarPersoane + " persoane la restaurantul " + this.nume);
	}
}