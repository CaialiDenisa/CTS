package ro.ase.cts.prototype.clase;

public class ClientStadion implements AbstractPrototype {
	private String numeClient;
	private int varsta;
	public String getNumeClient() {
		return numeClient;
	}
	public void setNumeClient(String numeClient) {
		//validare
		this.numeClient = numeClient;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		//validare
		this.varsta = varsta;
	}
	
	public ClientStadion(String numeClient, int varsta) {
		super();
		this.numeClient = numeClient;
		this.varsta = varsta;
	}
	
	private ClientStadion() {
		super();
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ClientStadion [numeClient=");
		builder.append(numeClient);
		builder.append(", varsta=");
		builder.append(varsta);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	@Override
	public AbstractPrototype copiaza() {
		// TODO Auto-generated method stub
		ClientStadion clona= new ClientStadion();
		clona.numeClient=this.numeClient;
		clona.varsta=this.varsta;
		return clona;
	
	}
	
	
	

}
