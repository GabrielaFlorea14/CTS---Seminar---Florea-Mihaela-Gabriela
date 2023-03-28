package cts.prototype.main;

import java.util.HashMap;
import java.util.Map;

import cts.prototype.IReteta;
import cts.prototype.Reteta;

public class Main {
	public static void main(String[] args) {
		Map<String, Float> solutii = new HashMap<>();
		solutii.put("Solutia1", (float)20);
		solutii.put("Solutia2", (float)15);
		solutii.put("Solutia3", (float)25);

		IReteta prototype = new Reteta("Reteta", 60, solutii);
	    Reteta farmacie = (Reteta)prototype.copiaza();
	    farmacie.setNume("Reteta farmaciei");
		System.out.println(farmacie.toString());
		Reteta laborator = (Reteta)prototype.copiaza();
		laborator.setNume("Reteta laboratorului");
		System.out.println(laborator.toString());
	}
}
