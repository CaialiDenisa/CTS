package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements ComponentaAbstracta {
	List<ComponentaAbstracta> optiuni;
	String numeSectiune;
	@Override
	public void afiseazaDescriere() {
		// TODO Auto-generated method stub
		System.out.println("Sectiunea se numeste "+numeSectiune);
		for(ComponentaAbstracta componenta : optiuni) {
			componenta.afiseazaDescriere();
		}
	}
	@Override
	public void adaugaComponenta(ComponentaAbstracta componentaAbstracta) {
		// TODO Auto-generated method stub
		optiuni.add(componentaAbstracta);
	}
	@Override
	public void stergeComponenta(ComponentaAbstracta componentaAbstracta) {
		// TODO Auto-generated method stub
		optiuni.remove(componentaAbstracta);
	}
	@Override
	public ComponentaAbstracta getComponenta(int pozitie) {
		// TODO Auto-generated method stub
		if(pozitie>0 && pozitie<optiuni.size()) {
		return optiuni.get(pozitie);
		}
		return null;
	}
	public Sectiune(String numeSectiune) {
		super();
		this.numeSectiune = numeSectiune;
		optiuni=new ArrayList<>();
	}
	
	
	
}
