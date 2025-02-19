package Ej1;
/**
 * Clase que contiene instancias de una persona
 * @author Laura Sofia Ojeda Leon & Daniel Felipe Velasquez Rincon
 * @version 1
 * @since 15-03-2021
 */
public class Persona {
	private char nombre;
	private char genero;
	private int nacimiento;
	private int edad;
	
	public Persona(char nombre, char genero, int nacimiento, int edad) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.nacimiento = nacimiento;
		this.edad = edad;
	}
	
	public char getNombre() {
		return nombre;
	}
	public void setNombre(char nombre) {
		this.nombre = nombre;
	}
	public int getNacimiento() {
		return nacimiento;
	}
	public void setNacimiento(int nacimiento) {
		this.nacimiento = nacimiento;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", nacimiento=" + nacimiento + ", edad=" + edad
				+ "]";
	}
	
	
}
