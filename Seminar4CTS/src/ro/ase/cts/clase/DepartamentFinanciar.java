package ro.ase.cts.clase;

public class DepartamentFinanciar {
	
	private int nrAngajati;
	private String numeDirector;
	private double salariuBaza;
	
	private static DepartamentFinanciar departamentFinanciar=null;
	
	
	private DepartamentFinanciar(int nrAngajati, String numeDirector, double salariuBaza) {
		this.nrAngajati=nrAngajati;
		this.numeDirector=numeDirector;
		this.salariuBaza=salariuBaza;
	}
	
	public static synchronized DepartamentFinanciar getInstance(int nrAngajati, String numeDirector, double salariuBaza)
	{  
		//folosim synchronized ca metoda sa fie Thread safe
		
		if(departamentFinanciar==null)
		{
			departamentFinanciar=new DepartamentFinanciar(nrAngajati, numeDirector, salariuBaza);
		}
		return departamentFinanciar;
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

	@Override
	public String toString() {
		return "DepartamentFinanciar [nrAngajati=" + nrAngajati + ", numeDirector=" + numeDirector + ", salariuBaza="
				+ salariuBaza + "]";
	}
	
	
	
}
