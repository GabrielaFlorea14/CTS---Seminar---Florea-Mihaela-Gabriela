package cts.facade;

import java.util.ArrayList;
import java.util.List;

public class Ospatar {
	
	private List<Integer> meseDebarasate;
	
	public Ospatar() {
		meseDebarasate = new ArrayList<Integer>();
	}
	
	public void debaraseazaMasa(int nrMasa)
	{
		meseDebarasate.add(nrMasa);
	}
	
	public boolean esteMasaDebarasata(int nrMasa) {
		return meseDebarasate.contains(nrMasa);
	}
	
}
