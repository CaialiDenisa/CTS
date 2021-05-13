package ro.ase.cts.observer.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class ManagerSalaAbstract {
	
	public List<Observer> listaClientiFideli;
	
	public ManagerSalaAbstract() {
		super();
		this.listaClientiFideli = new ArrayList<>();
	}

	public void adaugaAbonati(Observer abonat) {
		listaClientiFideli.add(abonat);
}
	
	public void stergeAbonat(Observer abonat) {
		listaClientiFideli.remove(abonat);
	}
	
	public void trimiteNotificare(String mesaj) {
		for(Observer client: listaClientiFideli) {
			client.primesteMesaj(mesaj);
		}
	}
}