package cts.singleton.registry;

import java.util.HashMap;
import java.util.Map;

public class Registru {
	private static Map<String, Firma> registru = new HashMap<String, Firma>();
	// registrul trebuie sa fie singleton
	// ori punem mai sus la Map static
	// ori facem sa fie clasa singleton in sine
	
	public Firma creareFirma(String nume) {
		if(!registru.containsKey(nume)) {
			Firma firma = new Firma(nume, 0);
			registru.put(nume, firma);
		}
		return registru.get(nume);
	}
}
