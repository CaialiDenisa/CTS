package ro.ase.cts.simpleFactory.clase;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory factory=new Factory();
		Jucator portar=factory.getJucator(TipJucator.PORTAR, "Ionescu Adrian", 27);
		Jucator fundas=factory.getJucator(TipJucator.FUNDAS, "Davidescu Marian", 31);
		
		System.out.println(portar.toString());
		System.out.println(fundas.toString());
		

	}

}
