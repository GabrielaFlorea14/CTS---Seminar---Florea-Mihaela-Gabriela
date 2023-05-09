package memento.clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
	private List<AutobuzMemento> listaMemento = new ArrayList<>();
	
	public void adaugaMemento(AutobuzMemento memento) {
		this.listaMemento.add(memento);
	}
	
	public AutobuzMemento returneazaMemento(int pozitie) {
		return this.listaMemento.get(pozitie);
	}
 }
