package cts.adapter.main;

import cts.adapter.bar.ISoftBar;
import cts.adapter.bar.SoftBar;
import cts.adapter.bucatarie.AdapterRestaurantDeClase;
import cts.adapter.bucatarie.AdapterRestaurantDeObiecte;
import cts.adapter.bucatarie.ISoftBucatarie;
import cts.adapter.bucatarie.SoftBucatarie;
import cts.adapter.main.Main;

public class Main {

	public static void imprimare(ISoftBucatarie restaurant, double plata) 
	{
		restaurant.printeazaNota(plata);
	}
	
	
	
	public static void main(String[] args) {
		ISoftBar bar = new SoftBar("Alcadibo");
		bar.printeazaNotaBauturi(240);
		
		ISoftBucatarie bucatarie = new SoftBucatarie("George");
		bucatarie.printeazaNota(300);
		
	//	Main.imprimare(bar, 500); //eroare
		Main.imprimare(bucatarie, 500); 
	
		AdapterRestaurantDeClase adapterClase = new AdapterRestaurantDeClase("La costa");
		Main.imprimare(adapterClase, 450);
		
		AdapterRestaurantDeObiecte adapterObiecte = new AdapterRestaurantDeObiecte(bar);
		Main.imprimare(adapterObiecte, 360);
	}

}
