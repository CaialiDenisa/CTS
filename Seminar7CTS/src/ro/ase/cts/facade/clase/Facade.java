package ro.ase.cts.facade.clase;

public class Facade {
	public static boolean verificaPersoana(Persoana persoana) {
		if(persoana.getVarsta()>=18) {
			if(!Politie.esteUrmaritDePolitie(persoana)) {
				if(!BirouCredite.areCredite(persoana)) {
					return true;
				}
			}
		}
	return false;
}
}
