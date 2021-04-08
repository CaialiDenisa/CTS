package ro.ase.cts.adapter.obiecte;

public class Program {
	public static void afiseazaInformatiiCredit(Creditable credit) {
		credit.oferaCredit();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leasing leasing = new Leasing ("Popescu Dorian");
		LeasingAdapter leasingAdapter=new LeasingAdapter(leasing);
		afiseazaInformatiiCredit(leasingAdapter);
	
		LeasingAdapterClase adapterClase = new LeasingAdapterClase("Ionescu");
		afiseazaInformatiiCredit(adapterClase);
		
		
	}

}
