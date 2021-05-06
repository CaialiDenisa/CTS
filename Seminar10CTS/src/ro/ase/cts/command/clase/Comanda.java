package ro.ase.cts.command.clase;

public abstract class Comanda {
	
	protected ContBancar contBancar;
	protected float suma;
	
	public Comanda(ContBancar cont, float suma) {
		this.contBancar = cont;
		this.suma = suma;
	}
	
	public abstract void executa();
	
}
