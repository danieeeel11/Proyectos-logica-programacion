package Ejercicio1;
/**
 * Clase Pasajero que contiene datos del pasajero, el ide, nombre genero, edad, tiene la herencia de los datos de id y nombre 
 * de la superclase persona
 * @author Daniel Velasquez y julian Cardenas
 * @since 24-10-2020
 * @version 1
 * 
 */

public class Pasajero extends Persona{
	private int edad;
	private String genero;
	/**
	 * @param id
	 * @param nombre
	 * @param edad
	 * @param genero
	 */
	public Pasajero(int id, String nombre, int edad, String genero) {
		super(id, nombre);
		this.edad = edad;
		this.genero = genero;
	}
	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}
	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}
	@Override
	public String toString() {
		return super.toString() + "Pasajero [edad=" + edad + ", genero=" + genero + "]";
	}
	
	

}
