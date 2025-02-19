package ArrayObjetos;
/**
 * Clase que contiene los atributos de una persona
 * nombre y edad
 * @author Daniel Felipe Velásquez Rincón
 * @version 1
 * @date 16-02-2021
 */
public class Persona {
	private String nombre;
	private int edad;
	
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
