package ro.ase.cts.simpleFactory.clase;

public class Atacant extends Jucator {

	public Atacant(String numeJucator, int varsta) {
		super(numeJucator, varsta);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Atacant [getNumeJucator()=").append(getNumeJucator()).append(", getVarsta()=")
				.append(getVarsta()).append(", toString()=").append(super.toString()).append(", getClass()=")
				.append(getClass()).append(", hashCode()=").append(hashCode()).append("]");
		return builder.toString();
	}

	
	
	
	
}
