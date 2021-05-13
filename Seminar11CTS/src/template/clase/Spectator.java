package template.clase;

public class Spectator extends SpectatorAbstract{

	private String nume;
	
	public Spectator(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void asezareCoada() {
		System.out.println(nume+ " s-a asezat la coada");
		
	}

	@Override
	public void prezintaBilet() {
		System.out.println(nume+ " a prezentat biletul");
		
	}

	@Override
	public void realizareControl() {
		System.out.println(nume+ " a fost verificat");
		
	}

	@Override
	public void ocupaLoc() {
		System.out.println(nume+ " si-a ocupat locul");
		
	}

}
