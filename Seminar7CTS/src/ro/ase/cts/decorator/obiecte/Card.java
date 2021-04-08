package ro.ase.cts.decorator.obiecte;

public class Card implements CardAbstract {
	private String detinator;

	public Card(String detinator) {
		super();
		this.detinator = detinator;
	}

	public String getDetinator() {
		return detinator;
	}

	@Override
	public void realizeazaPlataOnline() {
		// TODO Auto-generated method stub
		System.out.println(detinator+ "a efectuat plata online");
	}

	@Override
	public void realizeazaPlataNormala() {
		// TODO Auto-generated method stub
		System.out.println(detinator+ "a efectuat plata normal");
	}
	
	
}
