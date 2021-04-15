package facade.ro.ase.cts.clase;

public class Facade {
	public static boolean potAsezaLaMasa(Masa masa) {
		
		GestionarMese gestionarMese= new GestionarMese();
		Piccolo piccolo=new Piccolo();
		if(gestionarMese.esteMasaLibera(masa.getCod())) {
			if(piccolo.esteMasaDebarasata(masa.getCod())) {
				if(piccolo.areMasaServetele(masa.getCod())) {
					return true;
				}
				return false;
			}
			return false;
		}
		return false;
	}
}
