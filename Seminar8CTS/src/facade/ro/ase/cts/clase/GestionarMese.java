package facade.ro.ase.cts.clase;

class GestionarMese {
	public boolean esteMasaLibera(int cod) {
		if(cod%2==1) {
			return true;
		}
		else {
			return false;
		}
	}
}
