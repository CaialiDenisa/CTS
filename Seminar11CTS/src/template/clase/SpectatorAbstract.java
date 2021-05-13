package template.clase;

public abstract class SpectatorAbstract {
	public abstract void asezareCoada();
	public abstract void prezintaBilet();
	public abstract void realizareControl();
	public abstract void ocupaLoc();
	
	public final void intraPeStadion() {
		asezareCoada();
		prezintaBilet();
		realizareControl();
		ocupaLoc();
	}
}
