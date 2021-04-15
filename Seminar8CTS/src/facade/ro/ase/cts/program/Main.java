package facade.ro.ase.cts.program;

import facade.ro.ase.cts.clase.Facade;
import facade.ro.ase.cts.clase.Masa;

public class Main {
	public static void Main(String[] args) {
		//GestionarMese gestionarMese=new GestionarMese();
		//Piccolo piccolo = new Piccolo();
		Masa masa1=new Masa(10,5);
		
		/*if(gestionarMese.esteMasaLibera(masa1.getCod())) {
			if(piccolo.esteMasaDebarasata(masa1.getCod())) {
				if(piccolo.areMasaServetele(masa1.getCod())) {
					System.out.println("Poftiti la masa numarul "+masa1.getCod());
				}
				else
					System.out.println("Mai asteptati un moment!");
			}
			else
				System.out.println("Mai asteptati un moment!");
		}
		else
			System.out.println("Mai asteptati un moment!");
	}*/
		if(Facade.potAsezaLaMasa(masa1)) {
			System.out.println("Poftiti la masa");
		} else {
			System.out.println("Mai asteptati");
		}
	}
}
