package ro.ase.cts.builderv2;

public class RezervareBuilderConcret implements AbstractBuilder {
	private int codRezervare;
	private boolean areMancareInclusa;
	private boolean areScaunErgonomic;
	private boolean areBauturaRacoritoare;
	private boolean areMuzicaAmbientalaPersonalizata;
	private String genMuzica;
	public RezervareBuilderConcret setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
		return this;
	}
	public RezervareBuilderConcret setAreMancareInclusa(boolean areMancareInclusa) {
		this.areMancareInclusa = areMancareInclusa;
		return this;
	}
	public RezervareBuilderConcret setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.areScaunErgonomic = areScaunErgonomic;
		return this;
	}
	public RezervareBuilderConcret setAreBauturaRacoritoare(boolean areBauturaRacoritoare) {
		this.areBauturaRacoritoare = areBauturaRacoritoare;
		return this;
	}
	public RezervareBuilderConcret setAreMuzicaAmbientalaPersonalizata(boolean areMuzicaAmbientalaPersonalizata) {
		this.areMuzicaAmbientalaPersonalizata = areMuzicaAmbientalaPersonalizata;
		return this;
	}
	public RezervareBuilderConcret setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
		return this;
	}
	@Override
	public Rezervare build() {
		// TODO Auto-generated method stub
		Rezervare rezervare=new Rezervare(codRezervare, areMancareInclusa, areScaunErgonomic, areBauturaRacoritoare, areMuzicaAmbientalaPersonalizata, genMuzica);
		return rezervare;
	}
	
	
}
