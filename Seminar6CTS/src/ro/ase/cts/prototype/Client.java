package ro.ase.cts.prototype;

public class Client implements AbstractPrototype {
	private String nume;
	private int varsta;
	
	public Client(String nume, int varsta) {
		super();
		this.nume = nume;
		this.varsta = varsta;
		// se realizeaza validari costisitoare
	}

	public Client() {
		super();
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	@Override
	public String toString() {
		return "Client [nume=" + nume + ", varsta=" + varsta + "]";
	}

	public AbstractPrototype copiaza() {
		// TODO Auto-generated method stub
	
		Client client = new Client();
		client.nume=this.nume;
		client.varsta=this.varsta;
		return client;
	};
	
	
	
}
