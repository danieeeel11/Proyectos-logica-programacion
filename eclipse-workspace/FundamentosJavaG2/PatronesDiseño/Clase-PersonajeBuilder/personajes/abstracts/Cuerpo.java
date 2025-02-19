package personajes.abstracts;

public abstract class Cuerpo {

	public String nombre;
	public abstract void selectCuerpo();
	
	public Cuerpo(String nombre) {
		this.nombre=nombre;
	}
}
