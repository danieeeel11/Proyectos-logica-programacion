package builder;

import personajes.abstracts.AbstractFactory;

public abstract class IBuilder {
	
	public Personaje p;
	public AbstractFactory fact;
	public IBuilder(String nombre) {
		p=new Personaje();
		p.nombre=nombre;
	}
	
	
	public abstract void makeCabeza();
	public abstract void makeCuerpo();
	public abstract void makePiernas();
}
