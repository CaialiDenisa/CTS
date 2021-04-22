package ro.ase.cts.strategy.clase;

public class Cash implements ModPlata{

	@Override
	public void plateste(double sumaPlata) {
		System.out.println("A fost efectuata plata cu bani gheata in valoare de "+sumaPlata);
		
	}
}
