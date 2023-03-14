package cts.main;

import cts.singleton.registry.Firma;
import cts.singleton.registry.Registru;

//main pentru singleton.registry
public class Main {

	public static void main(String[] args) {
		Registru registru = new Registru();
		Registru registru2 = new Registru();
		
		Firma firma1 = registru.creareFirma("SC FIRMA 1 SRL");
		Firma firma2 = registru.creareFirma("SC FIRMA 2 SRL");
		Firma firma3 = registru2.creareFirma("SC FIRMA 3 SRL");
		Firma firma4 = registru.creareFirma("SC FIRMA 2 SRL");
		
		firma1.angajeaza();
		firma2.angajeaza();
		firma3.angajeaza();
		firma4.angajeaza();
	
		System.out.println(firma1.toString());
		System.out.println(firma2.toString());
		System.out.println(firma3.toString());
		System.out.println(firma4.toString());
		
	}

}
