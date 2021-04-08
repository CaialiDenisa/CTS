package ro.ase.cts.decorator.main;

import ro.ase.cts.decorator.obiecte.Card;
import ro.ase.cts.decorator.obiecte.CardAbstract;
import ro.ase.cts.decorator.obiecte.DecoratorAbstract;
import ro.ase.cts.decorator.obiecte.DecoratorContactless;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CardAbstract cardAbstract = new Card("Ionescu");
		cardAbstract.realizeazaPlataNormala();
		cardAbstract.realizeazaPlataOnline();
		
		DecoratorAbstract decoratorAbstract = new DecoratorContactless(cardAbstract);
		decoratorAbstract.realizeazaPlataNormala();
		decoratorAbstract.realizeazaPlataOnline();
		decoratorAbstract.realizeazaPlataContactless();
	}

}
