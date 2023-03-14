package cts.singleton;

public class Main {

	public static void main(String[] args) {
		Rector rector = Rector.getInstanta("Vasile", 2, 50);
		Rector rector2 = Rector.getInstanta("Ion", 1, 46);
		
		System.out.println(rector);
		System.out.println(rector2);
		
		Decan decan = Decan.getInstanta();
		Decan decan2 = Decan.getInstanta();
		
		decan2.setNume("Crsiti"); 
		// orice modificare prin oricare cele 2 referinte, modificarea se duce in acelasi obiect, 
		// adica se modifica amandoua: si decan si decan2
		
		System.out.println(decan.getNume());
		System.out.println(decan2.getNume());
		
		
		
		
		
	
		Firma firma1 = Firma.verificaDisponibilitateFirma("SC FIRMA1 SRL");
		Firma firma2 = Firma.verificaDisponibilitateFirma("SC FIRMA2 SRL");
		Firma firma3 = Firma.verificaDisponibilitateFirma("SC FIRMA2 SRL");
		
		firma1.setNumarAngajati(10);
		firma2.setNumarAngajati(15);
		firma3.setNumarAngajati(22);
		
		System.out.println(firma1.toString());
		System.out.println(firma2.toString());
		System.out.println(firma3.toString());
		
	}

}
