package cts.adapter.bar;

import cts.adapter.bar.ISoftBar;

public class SoftBar implements ISoftBar{
private String denumire;
	
	public SoftBar(String denumire) {
		super();
		this.denumire = denumire;
	}

	@Override
	public void printeazaNotaBauturi(double totalPlata) {
		System.out.println("Barul " + this.denumire + " a inregistrat un total de plata de " + totalPlata);
	}

}
