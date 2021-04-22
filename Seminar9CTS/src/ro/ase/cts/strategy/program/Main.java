package ro.ase.cts.strategy.program;

import ro.ase.cts.strategy.clase.Card;
import ro.ase.cts.strategy.clase.Cash;
import ro.ase.cts.strategy.clase.Client;

public class Main {

	public static void main(String[] args) {
		Client client1 = new Client("Anton");
		client1.setModPlata(new Card());
		client1.platesteNota(2000);
		
		client1.setModPlata(new Cash());
		client1.platesteNota(750);
	}

}
