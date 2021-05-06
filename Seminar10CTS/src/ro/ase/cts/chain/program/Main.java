package ro.ase.cts.chain.program;

import ro.ase.cts.chain.clase.ContCredit;
import ro.ase.cts.chain.clase.ContCurent;
import ro.ase.cts.chain.clase.ContEconomii;
import ro.ase.cts.chain.clase.Handler;
import ro.ase.cts.chain.clase.RefuzaTranzactia;

public class Main {

	public static void main(String[] args) {
		Handler contCredit = new ContCredit(5000);
		Handler contCurent = new ContCurent(2000);
		Handler contEconomii = new ContEconomii(2100);
		Handler refuzaTranzactia = new RefuzaTranzactia();
		
		
		contCurent.setSuccesor(contEconomii);
		contEconomii.setSuccesor(contCredit);
		contCredit.setSuccesor(refuzaTranzactia);
		
		contCurent.realizeazaPlata(500);
		//contCurent.realizeazaPlata(5200);
	}

}
