package Ejercicio1;
/**
 * Programa la clase Cliente para crear objetos
 * @author Daniel Felipe Velasquez Rincon
 * @since 2020-10-02
 * @version 1
 */

public class Cliente {
	private int id;
	private String nombre;
	private String apellido;
	private int telefono;
	private String correo;
	private Fecha nacimiento;
	/**
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param telefono
	 * @param correo
	 * @param nacimiento
	 */
	public Cliente(int id, String nombre, String apellido, int telefono, String correo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.correo = correo;
		//this.nacimiento = nacimiento;
	}
	/**
	 * Metodo para asignar los datos de fecha de nacimiento de la clase Fecha a la clase Cliente
	 * @param dia
	 * @param mes
	 * @param año
	 */
	public void agregarFechaNacimiento(int dia, String mes, int año) {
		this.nacimiento =new Fecha(dia, mes, año);
	}

	/**
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

	/**
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

	/**
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

	/**
	 * @return the telefono
	 */
	public int getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	/**
	 * @return the nacimiento
	 */
	public Fecha getNacimiento() {
		return nacimiento;
	}

	/**
	 * @param nacimiento the nacimiento to set
	 */
	public void setNacimiento(Fecha nacimiento) {
		this.nacimiento = nacimiento;
	}
	
	/**
	 * Metodo de la clase Object para retornar una cadena de caracteres
	 */
	@Override
	public String toString() {
		return "Cliente [id= " + id + ", nombre= " + nombre + ", apellido= " + apellido + ", telefono= "
				+ telefono + ", correo= " + correo + ", fecha nacimiento= " + nacimiento + "]"; 
	}
 		

}
