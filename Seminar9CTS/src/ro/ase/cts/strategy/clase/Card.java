package ro.ase.cts.strategy.clase;

public class Card implements ModPlata{

	@Override
	public void plateste(double sumaPlata) {
		System.out.println("A fost efectuata plata cu cardul in valoare de "+sumaPlata);
		
	}

}
