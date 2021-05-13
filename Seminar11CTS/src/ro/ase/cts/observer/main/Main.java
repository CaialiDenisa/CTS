package ro.ase.cts.observer.main;

import ro.ase.cts.observer.clase.ClientAbonat;
import ro.ase.cts.observer.clase.ManagerSala;

public class Main {

	public static void main(String[] args) {
		ClientAbonat c1=new ClientAbonat("Ion");
		ClientAbonat c2=new ClientAbonat("Marcu");
		ClientAbonat c3=new ClientAbonat("Dan");

		ManagerSala manager = new ManagerSala();
		
		manager.adaugaAbonati(c1);
		manager.adaugaAbonati(c2);
		manager.adaugaAbonati(c3);
		
		manager.anuntaMeci("Handbal");
		
		System.out.println("-----");
		manager.stergeAbonat(c1);
		manager.anuntaMeci("Tenis");
	}

}
