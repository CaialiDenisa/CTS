package ro.ase.cts.clase;

public class CDCompany {
	private String numeStudio;
	private String locatie;
	private int anInfiintare;
	
	private static CDCompany cdCompany = null;

	private CDCompany(String numeStudio, String locatie, int anInfiintare) {
		this.numeStudio = numeStudio;
		this.locatie = locatie;
		this.anInfiintare = anInfiintare;
	}

	public String getNumeStudio() {
		return numeStudio;
	}

	public void setNumeStudio(String numeStudio) {
		this.numeStudio = numeStudio;
	}

	public String getLocatie() {
		return locatie;
	}

	public void setLocatie(String locatie) {
		this.locatie = locatie;
	}

	public int getAnInfiintare() {
		return anInfiintare;
	}

	public void setAnInfiintare(int anInfiintare) {
		this.anInfiintare = anInfiintare;
	}
	
	public static synchronized CDCompany getInstanta(String numeStudio, String locatie, int anInffintare) {
		if(cdCompany==null)
		{
			cdCompany=new CDCompany(numeStudio, locatie, anInffintare); 
		}
		
		return cdCompany;
	}

	@Override
	public String toString() {
		return "CDCompany [numeStudio=" + numeStudio + ", locatie=" + locatie + ", anInfiintare=" + anInfiintare + "]";
	}
	
	
	

}
