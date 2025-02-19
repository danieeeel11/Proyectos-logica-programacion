package modelo;

/**
 * 
 * @author Laura Ojeda & Daniel Velasquez
 *
 */
public class Estudiante {
	private String id;
	private String nombre;
	private String apellido;
	private String correoPer;
	private String correoIns;
	private String numTel;
	private String genero;
	private int edad;
	private String programa;
	
	public Estudiante(String nombre, String apellido, String correoPer, String correoIns, String numTel,
			String genero, int edad, String programa) {
		super();
		//this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correoPer = correoPer;
		this.correoIns = correoIns;
		this.numTel = numTel;
		this.genero = genero;
		this.edad = edad;
		this.programa = programa;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	public String getCorreoIns() {
		return correoIns;
	}
	public void setCorreoIns(String correoIns) {
		this.correoIns = correoIns;
	}
	public String getCorreoPer() {
		return correoPer;
	}
	public void setCorreoPer(String correoPer) {
		this.correoPer = correoPer;
	}
	public String getNumTel() {
		return numTel;
	}
	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getPrograma() {
		return programa;
	}
	public void setPrograma(String programa) {
		this.programa = programa;
	}

	@Override
	public String toString() {
		return " Nombre: " + nombre + " \n\t  Apellido: " + apellido + " \n\t  Correo Personal: " + correoPer
				+ " \n\t  Correo Institucional: " + correoIns + " \n\t  Numero celular: " + numTel 
				+ " \n\t  Genero: " + genero + " \n\t  Edad: " + edad + " \n\t  Programa: " + programa + "";
	}
	
	
}
