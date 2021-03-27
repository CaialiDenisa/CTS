package ro.ase.cts.prototype.clase;

public class Bilet implements AbstractPrototype {
	private int cod;
	private String numeEchipa1;
	private String numeEchipa2;
	private String oraData;
	public Bilet(int cod, String numeEchipa1, String numeEchipa2, String oraData) {
		super();
		this.cod = cod;
		this.numeEchipa1 = numeEchipa1;
		this.numeEchipa2 = numeEchipa2;
		this.oraData = oraData;
	}
	private Bilet() {
		super();
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	@Override
	public AbstractPrototype copiaza() {
		// TODO Auto-generated method stub
		Bilet biletCopiat=new Bilet();
		biletCopiat.numeEchipa1=this.numeEchipa1;
		biletCopiat.numeEchipa2=this.numeEchipa2;
		biletCopiat.oraData=this.oraData;
		return biletCopiat;
	}
	
	

}
