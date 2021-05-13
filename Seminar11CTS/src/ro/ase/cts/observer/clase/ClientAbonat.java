package ro.ase.cts.observer.clase;

public class ClientAbonat implements Observer {
	private String nume;
	
	public ClientAbonat(String nume) {
		this.nume = nume;
	}

	@Override
	public void primesteMesaj(String mesaj) {
		System.out.print(nume +" a primit mesajul: ");
		System.out.println(mesaj);
	}

}
