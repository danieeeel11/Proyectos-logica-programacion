package Ej1;
/**
 * Clase EstudianteI donde se declaran las instancias de clase: el id, el nombre y las notas de cada estudiante 
 * @author Laura Sofia Ojeda Leon & Daniel Felipe Velasquez Rincon
 * @version 1
 * @since 14-05-2021
 */
public class EstudianteI implements Comparable<EstudianteI>{
	private int id;
	private String nombre;
	private Notas notas;
	/**
	 * Costructor de la clase
	 * @param id
	 * @param nombre
	 * @param notas
	 */
	public EstudianteI(int id, String nombre, Notas notas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.notas = notas;
	}
	/**
	 * Metodo get id
	 * @return la identificacion del estudiante
	 */
	public int getId() {
		return id;
	}
	/**
	 * Metodo set id
	 * @param id la identificacion del estudiante
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * Metodo get nombre
	 * @return el nombre del estudiante
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Metodo set nombre
	 * @param nombre el nombre del estudiante
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Metodo get notas
	 * @return las notas del estudiante
	 */
	public Notas getNotas() {
		return notas;
	}
	/**
	 * Metodo set notas
	 * @param notas las notas del estudiante
	 */
	public void setNotas(Notas notas) {
		this.notas = notas;
	}
	
	/**
	 * Metodo toString de la clase
	 */
	@Override
	public String toString() {
		return "Estudiante --> Identificacion:" + id + ", Nombre:" + nombre + ", Notas:" + notas + " ";
	}
	/**
	 * Metodo de la  interfaz comparable con el fin de ordenar una serie de estudiantes por el nombre
	 */
	@Override
	public int compareTo(EstudianteI o) {
		return this.nombre.compareToIgnoreCase(o.nombre);
		
		/*if(this.notas.getNotaFinal()<o.notas.getNotaFinal()) {
			return 1;
		}else if(this.notas.getNotaFinal()>o.notas.getNotaFinal()) {
			return -1;
		}else {
			return 0;
		}*/
	}
}
