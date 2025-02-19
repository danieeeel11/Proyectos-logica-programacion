package Ejercicio1;
/**
 * Programa la clase empleado para crear objetos, heredar instancias
 * @author Daniel Felipe Velasquez Rincon
 * @since 2020-10-13
 * @version 2
 */

public class Empleado {
	protected int id;
	protected String nombre;
	protected String apellido;
	protected Fecha fechaIngreso;
	/**
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param fechaIngreso
	 */
	public Empleado(int id, String nombre, String apellido, Fecha fechaIngreso) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaIngreso = fechaIngreso;
	}
	
	/** Metodo para obtener una instancia de identificacion de la clase Empleado
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/** Metodo para obtener una instancia de nombre de la clase Empleado
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/** 
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/** Metodo para obtener una instancia de apellido de la clase Empleado
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/** Metodo para obtener una instancia de fecha de ingreso de la clase Empleado
	 * @return the fechaIngreso
	 */
	public Fecha getFechaIngreso() {
		return fechaIngreso;
	}
	/**
	 * @param fechaIngreso the fechaIngreso to set
	 */
	public void setFechaIngreso(Fecha fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	/*
	 * Metodo para convertir los datos de las instancias de Empleado a cadena de caracteres tipo String
	 */
	public String toString() {
		return "Empleado [id= " + id + ", nombre= " + nombre + ", apellido= " + apellido
				+ ", fecha de ingreso= " + fechaIngreso + " ]";
	}

}
