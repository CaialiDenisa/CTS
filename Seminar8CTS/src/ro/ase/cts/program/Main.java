package ro.ase.cts.program;

import ro.ase.cts.clase.Item;
import ro.ase.cts.clase.Sectiune;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sectiune sectiuneBauturi= new Sectiune("Bauturi");
		Sectiune sectiuneDesert = new Sectiune("Desert");
		
		Item itemFrappe=new Item("Frappe");
		Item itemCafea = new Item("Americano");
		Item itemEcler=new Item("Ecler");
		
		sectiuneBauturi.adaugaComponenta(itemCafea);
		sectiuneBauturi.adaugaComponenta(itemFrappe);
		
		sectiuneDesert.adaugaComponenta(itemEcler);
		
		Sectiune meniu=new Sectiune("Meniu");
		meniu.adaugaComponenta(sectiuneBauturi);
		meniu.adaugaComponenta(sectiuneDesert);
		
		meniu.afiseazaDescriere();
		
		sectiuneBauturi.stergeComponenta(itemFrappe);
		sectiuneDesert.adaugaComponenta(itemFrappe);
		
		meniu.afiseazaDescriere();
	}

}
