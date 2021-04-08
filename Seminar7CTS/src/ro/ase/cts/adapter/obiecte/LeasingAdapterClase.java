package ro.ase.cts.adapter.obiecte;

public class LeasingAdapterClase extends Leasing implements Creditable {

	public LeasingAdapterClase(String nume) {
		super(nume);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void oferaCredit() {
		// TODO Auto-generated method stub
		super.oferaLeasing();
	}
	
	

}
