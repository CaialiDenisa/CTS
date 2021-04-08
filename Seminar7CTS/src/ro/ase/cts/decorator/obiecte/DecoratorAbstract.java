package ro.ase.cts.decorator.obiecte;

public abstract class DecoratorAbstract implements CardAbstract{
	protected CardAbstract cardAbstract;

	public DecoratorAbstract(CardAbstract cardAbstract) {
		super();
		this.cardAbstract = cardAbstract;
	}

	@Override
	public String getDetinator() {
		return cardAbstract.getDetinator();
	}
	
	@Override
	public void realizeazaPlataOnline() {
		// TODO Auto-generated method stub
		this.cardAbstract.realizeazaPlataOnline();
	}

	@Override
	public void realizeazaPlataNormala() {
		// TODO Auto-generated method stub
		this.cardAbstract.realizeazaPlataNormala();
	}
	
	public abstract void realizeazaPlataContactless();
	
	
}
