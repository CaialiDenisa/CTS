package ro.ase.cts.program;

import ro.ase.cts.clase.DepartamentFinanciarEager;
import ro.ase.cts.clase.CDCompany;
import ro.ase.cts.clase.DepartamentFinanciar;

public class Main {

	public static void main(String[] args) {
		DepartamentFinanciarEager departamentFinanciarEager1 = DepartamentFinanciarEager.getInstance();
		DepartamentFinanciarEager departamentFinanciarEager2 = DepartamentFinanciarEager.getInstance();
		
		DepartamentFinanciar departamentFinanciar1 = DepartamentFinanciar.getInstance(15, "Murgescu", 2000);
		DepartamentFinanciar departamentFinanciar2 = DepartamentFinanciar.getInstance(25, "Voiculescu", 3500);
		
		System.out.println(departamentFinanciarEager1.toString());
		System.out.println(departamentFinanciarEager2.toString());
		
		System.out.println(departamentFinanciar1.toString());
		System.out.println(departamentFinanciar2.toString());
	
		departamentFinanciarEager1.setNumeDirector("Ionescu");
		departamentFinanciarEager2.setNrAngajati(20);
		
		System.out.println(departamentFinanciarEager1.toString());
		System.out.println(departamentFinanciarEager2.toString());
	
		CDCompany cdCompany1 = CDCompany.getInstanta("Traxdata", "Hollywood", 1993);
		CDCompany cdCompany2 = CDCompany.getInstanta("Princo", "Los Angeles", 1998);
		
		System.out.println(cdCompany1.toString());
		System.out.println(cdCompany2.toString());
		
	}

}
