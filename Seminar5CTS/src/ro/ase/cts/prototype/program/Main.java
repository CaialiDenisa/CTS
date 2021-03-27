package ro.ase.cts.prototype.program;

import ro.ase.cts.prototype.clase.AbstractPrototype;
import ro.ase.cts.prototype.clase.Bilet;
import ro.ase.cts.prototype.clase.ClientStadion;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractPrototype abstractPrototype=new ClientStadion("Ionescu Ion", 27);
		AbstractPrototype abstractPrototype2=abstractPrototype.copiaza();
		ClientStadion clientStadion=(ClientStadion)abstractPrototype.copiaza();
		clientStadion.setNumeClient("Nume schimbat");
		System.out.println(clientStadion.toString());
		
		Bilet bilet1=new Bilet(1, "Arsenal", "Manchaster United", "21/12/2020");
		Bilet bilet2=(Bilet)bilet1.copiaza();
		System.out.println(bilet1.toString());
		System.out.println(bilet2.toString());
	}

}
