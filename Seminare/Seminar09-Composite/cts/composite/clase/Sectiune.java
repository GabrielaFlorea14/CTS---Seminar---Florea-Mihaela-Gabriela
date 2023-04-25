package cts.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements Item {
	//clasa composite
	private String nume;
	private List<Item> listaOptiuni;
	
	public Sectiune(String nume) {
		super();
		this.nume = nume;
		this.listaOptiuni = new ArrayList<>();
	}

	@Override
	public void adaugareItem(Item item) throws Exception {
		this.listaOptiuni.add(item);
	}

	@Override
	public void stergereItem(Item item) throws Exception {
		this.listaOptiuni.remove(item);
	}

	@Override
	public void descriereItem(String indentare) {
		System.out.println(indentare + this.nume);
		for(Item item : this.listaOptiuni) {
			item.descriereItem(indentare + "    ");
		}	}

	@Override
	public Item getItem(int index) throws Exception {
		return this.listaOptiuni.get(index);
	}
	
	
}
