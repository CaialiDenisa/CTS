package ro.ase.cts.builder;

public class RezervareBuilder implements AbstractBuilder{
	
	private Rezervare rezervare;
	
	public RezervareBuilder() {
		rezervare= new Rezervare(0,false,false,false,false,"pop");
	}

	@Override
	public Rezervare build() {
		// TODO Auto-generated method stub
		return rezervare;
	}
	
	public RezervareBuilder setAreMancareInclusa(boolean areMancareInclusa) {
		rezervare.setAreMancareInclusa(areMancareInclusa);
		return this;
	}
	
	public RezervareBuilder setAreScaunErgonomic(boolean areScaunErgonomic) {
		rezervare.setAreScaunErgonomic(areScaunErgonomic);
		return this;
	}
	
	public RezervareBuilder setAreBauturaRacoritoare(boolean areBauturaRacoritoare) {
		rezervare.setAreBauturaRacoritoare(areBauturaRacoritoare);
		return this;
	}
	
	public RezervareBuilder setAreMuzicaAmbientalaPersonalizata (boolean areMuzicaAmbientalaPersonalizata) {
		rezervare.setAreMuzicaAmbientalaPersonalizata(areMuzicaAmbientalaPersonalizata);
		return this;
	}
	
	public RezervareBuilder setCodRezervare(int codRezervare) {
		rezervare.setCodRezervare(codRezervare);
		return this;
	}
	
	
}

