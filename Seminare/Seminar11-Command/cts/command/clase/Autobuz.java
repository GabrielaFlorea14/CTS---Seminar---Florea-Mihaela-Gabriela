package cts.command.clase;

public class Autobuz implements IAutomobil {
	private int numar;

	public Autobuz(int numar) {
		super();
		this.numar = numar;
	}

	@Override
	public void plecareInCurs(int numarLinie) {
		System.out.println("Autobuzul "+ this.numar + " a plecat in curs pe linia " + numarLinie);
	}	
}
