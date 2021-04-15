package proxy.ro.ase.acs.program;

import proxy.ro.ase.acs.clase.OperatorRezervare;
import proxy.ro.ase.acs.clase.ProxyOperatorRezervare;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperatorRezervare operator1 = new OperatorRezervare();
		operator1.realizareRezervare(2);
		
		ProxyOperatorRezervare proxyOperator = new ProxyOperatorRezervare(operator1, 4);
		proxyOperator.realizareRezervare(4);
	}

}
