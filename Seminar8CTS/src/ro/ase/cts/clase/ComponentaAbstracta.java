package ro.ase.cts.clase;

public interface ComponentaAbstracta {
	public void afiseazaDescriere();
	public void adaugaComponenta(ComponentaAbstracta componentaAbstracta) throws Exception;
	public void stergeComponenta(ComponentaAbstracta componentaAbstracta);
	ComponentaAbstracta getComponenta(int pozitie);
}
