package facade.ro.ase.cts.clase;

public class Masa {
	private int cod;
	private int numarMaxim;
	public Masa(int cod, int numarMaxim) {
		super();
		this.cod = cod;
		this.numarMaxim = numarMaxim;
	}
	public int getCod() {
		return cod;
	}
	public int getNumarMaxim() {
		return numarMaxim;
	}
	@Override
	public String toString() {
		return "Masa [cod=" + cod + ", numarMaxim=" + numarMaxim + "]";
	}
	
	
}
