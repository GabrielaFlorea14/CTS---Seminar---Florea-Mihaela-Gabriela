package cts.composite.main;

import cts.composite.clase.Item;
import cts.composite.clase.Produs;
import cts.composite.clase.Sectiune;

public class Main {
	public static void main(String[] args) {
		
		Item meniu = new Sectiune("Meniu restaurant");

		//sectiuni
		Item sectiuneBauturi = new Sectiune("Bauturi");
		Item sectiuneDeserturi= new Sectiune("Deserturi");
		
		//subectiuni
		Item subsectiuneCafele = new Sectiune("Cafele");
		Item subsectiuneSucuri = new Sectiune("Sucuri");
		Item subsectiuneApe = new Sectiune("Ape");

		//produse
		Item produsFrappe = new Produs("Frappe");
		Item produsCafeaNeagra = new Produs("Cafea Neagra");
		Item produsCafeaCuLapte = new Produs("Cafea Cu Lapte");
		
		Item produsPepsi = new Produs("Pepsi");
		Item produsFanta = new Produs("Fanta");		
		Item produsSprite = new Produs("Sprite");
		
		Item produsApaPlata = new Produs("ApaPlata");
		Item produsApaMinerala = new Produs("ApaMinerala");
		
		Item produsTiramisu = new Produs("Tiramisu");
		Item produsPapanasi = new Produs("Papanasi");
		
		//legaturi
				try {
					subsectiuneCafele.adaugareItem(produsFrappe);
					subsectiuneCafele.adaugareItem(produsCafeaNeagra);
					subsectiuneCafele.adaugareItem(produsCafeaCuLapte);
		
					subsectiuneSucuri.adaugareItem(produsFanta);
					subsectiuneSucuri.adaugareItem(produsPepsi);
					subsectiuneSucuri.adaugareItem(produsSprite);

					subsectiuneApe.adaugareItem(produsApaPlata);
					subsectiuneApe.adaugareItem(produsApaMinerala);

					sectiuneBauturi.adaugareItem(subsectiuneCafele);
					sectiuneBauturi.adaugareItem(subsectiuneSucuri);
					sectiuneBauturi.adaugareItem(subsectiuneApe);

					sectiuneDeserturi.adaugareItem(produsTiramisu);
					sectiuneDeserturi.adaugareItem(produsPapanasi);

					meniu.adaugareItem(sectiuneDeserturi);
					meniu.adaugareItem(sectiuneBauturi);

				} catch(Exception e) {
					e.printStackTrace();
				}
				
				meniu.descriereItem("     ");
	}
}
