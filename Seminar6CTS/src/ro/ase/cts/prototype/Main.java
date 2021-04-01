package ro.ase.cts.prototype;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Client client1=new Client("Ion", 19);
		Client client2=(Client)client1.copiaza();
		System.out.println(client1);
		System.out.println(client2);
		
		Bilet bilet1=new Bilet(0,"Arsenal","Barcelona", "1-03", "1A");
		Bilet bilet2=new Bilet(1,"ManchasterUnited","Barcelona", "2-03", "2A");
		Bilet bilet3=(Bilet)bilet1.copiaza();
		bilet3.setCodBilet(21);
		bilet3.setLoc("12C");
		
		Bilet bilet4=(Bilet)bilet1.copiaza();
		bilet4.setCodBilet(12);
		bilet4.setLoc("15G");
		
		System.out.println(bilet1);
		System.out.println(bilet2);
		System.out.println(bilet3);
		System.out.println(bilet4);
	
	}

	
}
