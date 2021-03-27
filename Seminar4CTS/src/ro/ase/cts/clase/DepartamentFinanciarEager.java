package ro.ase.cts.clase;

public class DepartamentFinanciarEager {

	private int nrAngajati;
	private String numeDirector;
	private double salariuBaza;
	
	private static DepartamentFinanciarEager departamentFinanciarEager=new DepartamentFinanciarEager(10, "Popescu",3000);
	
	
	private DepartamentFinanciarEager(int nrAngajati, String numeDirector, double salariuBaza) {
		this.nrAngajati=nrAngajati;
		this.numeDirector=numeDirector;
		this.salariuBaza=salariuBaza;
	}
	
	public static DepartamentFinanciarEager getInstance()
	{
		return departamentFinanciarEager;
	}

	@Override
	public String toString() {
		return "DepartamentFinanciarEager [nrAngajati=" + nrAngajati + ", numeDirector=" + numeDirector
				+ ", salariuBaza=" + salariuBaza + "]";
	}

	public void setNrAngajati(int nrAngajati) {
		this.nrAngajati = nrAngajati;
	}

	public void setNumeDirector(String numeDirector) {
		this.numeDirector = numeDirector;
	}

	public void setSalariuBaza(double salariuBaza) {
		this.salariuBaza = salariuBaza;
	}

	public static void setDepartamentFinanciarEager(DepartamentFinanciarEager departamentFinanciarEager) {
		DepartamentFinanciarEager.departamentFinanciarEager = departamentFinanciarEager;
	}
	
	
	
	
}
