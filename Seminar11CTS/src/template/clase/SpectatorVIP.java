package template.clase;

public class SpectatorVIP extends SpectatorAbstract{

	private String nume;
	
	public SpectatorVIP(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void asezareCoada() {
		System.out.println(nume+ " s-a prezentat direct la poarta");
		
	}

	@Override
	public void prezintaBilet() {
		System.out.println(nume+ " a prezentat biletul");
		
	}

	@Override
	public void realizareControl() {
		System.out.println(nume+ " realizeaza controlul");
		
	}

	@Override
	public void ocupaLoc() {
		System.out.println(nume+ " isi ocupa locul");
		
	}

}
