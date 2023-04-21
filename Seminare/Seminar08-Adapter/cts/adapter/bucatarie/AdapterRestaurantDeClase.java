package cts.adapter.bucatarie;

import cts.adapter.bar.SoftBar;
import cts.adapter.bucatarie.ISoftBucatarie;

public class AdapterRestaurantDeClase extends SoftBar implements ISoftBucatarie{

	public AdapterRestaurantDeClase(String denumire) {
		super(denumire);
	}

	@Override
	public void printeazaNota(double totalSuma) {
		super.printeazaNotaBauturi(totalSuma);
	}

}
