package ro.ase.cts.flyweight.program;

import ro.ase.cts.flyweight.clase.FlyweightFactory;
import ro.ase.cts.flyweight.clase.Rezervare;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rezervare rezervare1=new Rezervare(1,4,"10:00");
		Rezervare rezervare2=new Rezervare(2,5,"12:00");
		Rezervare rezervare3=new Rezervare(3,2,"11:00");
		
		FlyweightFactory factory = new FlyweightFactory();
		factory.getClient("073453234").printeazaRezervare(rezervare1);
		factory.getClient("076543245").printeazaRezervare(rezervare2);
		factory.getClient("073453234").printeazaRezervare(rezervare3);
	}

}
