package cts.unit_testing.clase;

public class MyException extends IllegalArgumentException {
	private String mesaj;

	public MyException(String mesaj) {
		super();
		this.mesaj = mesaj;
	}

	public String getMesaj() {
		return mesaj;
	}
}