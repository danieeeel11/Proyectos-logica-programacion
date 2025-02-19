package modelo;

public class Cliente implements Comparable<Cliente>{
	private int id;
	private String nombre;
	private String apellido;
	private String direccion;
	private String correoOrg;
	private String correoPer;
	private int telefonico;
	
	public Cliente(int id, String nombre, String apellido, String direccion, String correoOrg, String correoPer,
			int telefonico) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.correoOrg = correoOrg;
		this.correoPer = correoPer;
		this.telefonico = telefonico;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreoOrg() {
		return correoOrg;
	}
	public void setCorreoOrg(String correoOrg) {
		this.correoOrg = correoOrg;
	}
	public String getCorreoPer() {
		return correoPer;
	}
	public void setCorreoPer(String correoPer) {
		this.correoPer = correoPer;
	}
	public int getTelefonico() {
		return telefonico;
	}
	public void setTelefonico(int telefonico) {
		this.telefonico = telefonico;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion
				+ ", correoOrg=" + correoOrg + ", correoPer=" + correoPer + ", telefonico=" + telefonico + "]";
	}

	@Override
	public int compareTo(Cliente o) {
		return id-o.id;
	}
	
	
	
	
}
