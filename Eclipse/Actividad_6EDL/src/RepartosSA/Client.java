package RepartosSA;
/**
 * Clase Cliente que contiene los atributos del cliente
 * @author Laura Ojeda & Daniel Velasquez
 * @date 30-05-2021
 */
public class Client {
	private int id;
	private String nombre;
	/**
	 * Constructor de la clase cliente
	 * @param id
	 * @param nombre
	 */
	public Client(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	
	/**
	 * Método get del Id
	 * @return Id del cliente
	 */
	public int getId() {
		return id;
	}
	/**
	 * Método set del Id
	 * @param id del cliente
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * Método get del Nombre
	 * @return Nombre del cliente
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Método set del Nombre 
	 * @param nombre del cliente
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Método toString de la clase
	 */
	@Override
	public String toString() {
		return "[id:" + id + ", nombre:" + nombre + "";
	}
}
