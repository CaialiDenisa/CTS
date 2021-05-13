package template.clase.main;

import template.clase.Spectator;
import template.clase.SpectatorAbstract;
import template.clase.SpectatorVIP;

public class Main {

	public static void main(String[] args) {
		Spectator spectator1= new Spectator("Ion");
		SpectatorAbstract spectator2= new Spectator("Dan");
		SpectatorAbstract spectatorVip = new SpectatorVIP("Titi");
		
		spectator1.intraPeStadion();
		spectator2.intraPeStadion();
		spectatorVip.intraPeStadion();
	}

}
