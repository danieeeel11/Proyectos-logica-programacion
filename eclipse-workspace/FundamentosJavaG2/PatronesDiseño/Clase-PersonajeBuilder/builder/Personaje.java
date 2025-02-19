package builder;

public class Personaje {

	public String nombre;
	
	public String cabeza;
	public String cuerpo;
	public String piernas;
	
	public String toString() {
		String k= nombre+'\n';
		k+= cabeza+'\n';
		k+= cuerpo+'\n';
		k+= piernas+'\n';
		return k;
	}
}
