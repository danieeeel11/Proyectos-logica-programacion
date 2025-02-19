package Ej2;
/**
 * Clase Conductor donde se declaran las instancias de clase: la id y nombre de un conductor
 * @author Laura Sofia Ojeda Leon & Daniel Felipe Velasquez Rincon
 * @version 1
 * @since 14-05-2021
 */
public class Conductor {
	private int id;
	private String nombre;
	/**
	 * Constructor de la clase
	 * @param id
	 * @param nombre
	 */
	public Conductor(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	/**
	 * Metodo get id
	 * @return la identificacion del conductor
	 */
	public int getId() {
		return id;
	}
	/**
	 * Metodo set id
	 * @param id la identificacion del conductor
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * Metodo get nombre
	 * @return el nombre del conductor
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Metodo set nombre
	 * @param nombre el nombre del conductor
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Metodo toString de la clase
	 */
	@Override
	public String toString() {
		return "[Identificacion: " + id + ", Nombre: " + nombre + "]";
	}
	
	
}
