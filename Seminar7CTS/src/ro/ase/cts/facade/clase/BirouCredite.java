package ro.ase.cts.facade.clase;

public class BirouCredite {
	public static boolean areCredite(Persoana p) {
		int cifra= Integer.parseInt(""+p.getCnp().charAt(9));
		return cifra%2==0;
	}
}
