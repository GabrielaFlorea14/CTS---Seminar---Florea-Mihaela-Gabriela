package cts.prototype;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements IReteta {
	private String nume;
	private float gramaj;
	private Map<String, Float> solutii = new HashMap<>();
	
	public Reteta(String nume, float gramaj, Map<String, Float> solutii) {
		super();
		this.nume = nume;
		this.gramaj = gramaj;
		this.solutii = solutii;
		
		float sumaGramajeSolutii = 0;
		for (float gramajSolutie : solutii.values()) {
			sumaGramajeSolutii += gramajSolutie;
		}
		
		if(sumaGramajeSolutii == gramaj) {
			this.gramaj = gramaj;
		} else {
			throw new IllegalArgumentException();
		}
	}

	
	private Reteta() {
		super();
		this.nume = "NotApplicable";
		this.gramaj = 0;
		this.solutii = null;
	}


	public void setNume(String nume) {
		this.nume = nume;
	}


	public void setGramaj(float gramaj) {
		this.gramaj = gramaj;
	}


	public void setSolutii(Map<String, Float> solutii) {
		this.solutii = new HashMap<>();
		for (String key : solutii.keySet()) {
			this.solutii.put(key, solutii.get(key));
		}
	}

	@Override
	public IReteta copiaza() {
		Reteta retetaNoua = new Reteta();
		retetaNoua.setGramaj(gramaj);
		retetaNoua.setNume(nume);
		retetaNoua.setSolutii(solutii);
		return retetaNoua;
	}


	@Override
	public String toString() {
		return "Reteta [nume=" + nume + ", gramaj=" + gramaj + ", solutii=" + solutii + "]";
	}
	
	
}
