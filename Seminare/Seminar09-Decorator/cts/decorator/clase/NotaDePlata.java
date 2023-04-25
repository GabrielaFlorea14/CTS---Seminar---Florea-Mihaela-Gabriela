package cts.decorator.clase;

public class NotaDePlata implements INotaDePlata {
	private String dataEmitere;

	public NotaDePlata(String dataEmitere) {
		super();
		this.dataEmitere = dataEmitere;
	}

	@Override
	public void printeazaNotaDePlata(int totalPlata) {
		System.out.println("Nota dumneavoastra din " + this.dataEmitere + " este in valoare de " + totalPlata + " lei.");
	}
	
}
