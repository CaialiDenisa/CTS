package ro.ase.cts.builderv2;

import ro.ase.cts.builder.RezervareBuilder;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RezervareBuilderConcret builder=new RezervareBuilderConcret().setCodRezervare(1).setAreBauturaRacoritoare(true);
		Rezervare rezervare=builder.build();
		builder.setCodRezervare(2).setAreMancareInclusa(true);
		Rezervare rezervare2=builder.build();
		System.out.println(rezervare.toString());
		System.out.println(rezervare2.toString());
		RezervareBuilderConcret builder2 = new RezervareBuilderConcret().setAreScaunErgonomic(true).setCodRezervare(3);
		Rezervare rezervare3 = builder2.build();
		System.out.println(rezervare.toString());
	}

}
