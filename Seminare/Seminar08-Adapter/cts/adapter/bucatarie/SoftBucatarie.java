package cts.adapter.bucatarie;

import cts.adapter.bucatarie.ISoftBucatarie;

public class SoftBucatarie implements ISoftBucatarie {
	private String numeBucatar;

	public SoftBucatarie(String numeBucatar) {
		super();
		this.numeBucatar = numeBucatar;
	}

	@Override
	public void printeazaNota(double totalSuma) {
		System.out.println("Bucatarul " + this.numeBucatar);
		System.out.println("Nota dumneavoastra este in valoare de " + totalSuma);
	}
		
		
}
