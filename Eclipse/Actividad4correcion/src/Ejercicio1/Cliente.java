package Ejercicio1;

public class Cliente{
	private int id;
	private String nombre;
	private String telefono;
	private String correo;
	private Fecha nacimiento;
	/**
	 * @param id
	 * @param nombre
	 * @param telefono
	 * @param correo
	 * @param fechaNacimiento
	 */
	
	public Cliente(int id, String nombre, String telefono, String correo, Fecha fecha) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
		this.correo = correo;
		this.nacimiento = fecha;
	}
	
	/**public void fechaNacimiento (int dia, int mes, int año){
		this.fechaNacimiento =new Fecha(dia, mes, año);
	}
	**/
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
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
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

	public String toString() {
		return "Cliente [id= " + id + ", nombre= " + nombre + ", telefono= " 
				+ telefono + ", correo= " + correo + ", fecha nacimiento= " 
				+ nacimiento + "]";
	}
	

}





