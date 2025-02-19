package Ej1;
/**
 * Clase persona que contiene las instancias nombre, edad e id 
 * @author Laura Sofia Ojeda Leon & Daniel Felipe Velasquez Rincon
 * @version 1
 * @since 25-03-2021
 */
public class Persona {
	private String nombre;
	private int edad;
	private int id;
	
	public Persona(String nombre, int edad, int id) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.id = id;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", id=" + id + "]";
	}
}
