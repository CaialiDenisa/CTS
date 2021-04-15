package facade.ro.ase.cts.clase;

class Piccolo {
	public boolean esteMasaDebarasata(int cod) {
		if(cod%2==1) {
			return true;
		}
		return false;
	}
	
	public boolean areMasaServetele(int cod) {
		if(cod%3==0) {
			return true;
		}
		return false;
	}
}
