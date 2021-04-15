package proxy.ro.ase.acs.clase;

public class ProxyOperatorRezervare implements IOperator {
	OperatorRezervare operator;
	int nrMinimPersoane;
	
	
	
	//public ProxyOperatorRezervare(OperatorRezervare operator) {
	//	super();
	//	this.operator = operator;
	//}
	
	

	@Override
	public void realizareRezervare(int nrPersoane) {
		// TODO Auto-generated method stub
		if(nrPersoane>=nrMinimPersoane) {
			operator.realizareRezervare(nrPersoane);
		} else {
			System.out.println("Puteti veni fara rezervare");
		}
	}



	public ProxyOperatorRezervare(OperatorRezervare operator, int nrMinimPersoane) {
		super();
		this.operator = operator;
		this.nrMinimPersoane = nrMinimPersoane;
	}

}
