package ejemplo;

public abstract class IFelino {
	
	public Ojo ojos;
	
	public IFelino(Ojo eyes) {
		ojos=eyes;
		
	}
	
	public void ver() {
		ojos.ver();
	}

	
	
	public abstract void hacerRuido();
	

}
