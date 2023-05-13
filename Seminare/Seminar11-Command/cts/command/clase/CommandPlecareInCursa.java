package cts.command.clase;

public class CommandPlecareInCursa implements ICommand {
	private int numarLinie;
	private IAutomobil automobil;

	public CommandPlecareInCursa(int numarLinie, IAutomobil automobil) {
		super();
		this.numarLinie = numarLinie;
		this.automobil = automobil;
	}

	@Override
	public void executa() {
		automobil.plecareInCurs(this.numarLinie);
	}
}
