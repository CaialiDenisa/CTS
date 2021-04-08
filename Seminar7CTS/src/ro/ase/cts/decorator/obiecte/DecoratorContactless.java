package ro.ase.cts.decorator.obiecte;

public class DecoratorContactless extends DecoratorAbstract{

	public DecoratorContactless(CardAbstract cardAbstract) {
		super(cardAbstract);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void realizeazaPlataContactless() {
		System.out.println(super.getDetinator()+" realizeaza plata contactless");
	}
}
