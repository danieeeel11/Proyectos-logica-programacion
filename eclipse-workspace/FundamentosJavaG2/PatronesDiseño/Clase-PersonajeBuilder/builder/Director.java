package builder;

public class Director {

	IBuilder b;
	
	public Director(IBuilder b) {
		this.b=b;
	}
	
	public Personaje crearPersonaje() {
		b.fact.crearCarpeta();
		b.makeCabeza();
		b.makeCuerpo();
		b.makePiernas();
		
		return b.p;
	}
	
}
