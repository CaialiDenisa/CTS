package ro.ase.cts.facade.main;

import ro.ase.cts.facade.clase.BirouCredite;
import ro.ase.cts.facade.clase.Facade;
import ro.ase.cts.facade.clase.Persoana;
import ro.ase.cts.facade.clase.Politie;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persoana persoana=new Persoana("Ion Ana", "2990303235237");
		if(persoana.getVarsta()>=18) {
			if(!Politie.esteUrmaritDePolitie(persoana)) {
				if(!BirouCredite.areCredite(persoana)) {
					System.out.println("I se ofera creditul lui "+persoana.getNume());
				}
			}
		}
		
		Persoana persoana2=new Persoana("Ionescu Dorian", "1990303235237");
		if(Facade.verificaPersoana(persoana2)) {
			System.out.println("I se ofera creditul lui "+persoana2.getNume());
		} else {
			System.out.println("Nu i se ofera creditul lui "+persoana2.getNume());
		}
		
	}

}
