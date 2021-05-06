package ro.ase.cts.chain.clase;

public class ContCurent extends Handler {

	public ContCurent(float sold) {
		super(sold);
	}

	@Override
	public void realizeazaPlata(float suma) {
		if(super.getSold()>=suma) {
			System.out.println("S-a realizat cu succes plata in valoare de "+suma+" din contul curent");
			float soldActual = super.getSold();
			soldActual=super.getSold()-suma;
			super.setSold(soldActual);
			//super.setSold(super.getSold() - suma);
		}
		else {
			super.getSuccesor().realizeazaPlata(suma);
		}
	}

}
