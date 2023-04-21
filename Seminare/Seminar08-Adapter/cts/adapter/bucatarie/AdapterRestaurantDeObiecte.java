package cts.adapter.bucatarie;

import cts.adapter.bar.ISoftBar;

public class AdapterRestaurantDeObiecte implements ISoftBucatarie {
		private ISoftBar bar;
		
	    public AdapterRestaurantDeObiecte(ISoftBar bar) {
			super();
			this.bar = bar;
		}

		@Override
		public void printeazaNota(double totalSuma) {
			this.bar.printeazaNotaBauturi(totalSuma);
		}
}
