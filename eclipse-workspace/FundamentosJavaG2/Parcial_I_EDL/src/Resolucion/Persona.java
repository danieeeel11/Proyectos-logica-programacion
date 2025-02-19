package Resolucion;

public class Persona {
	private String nombre;
	private String apellido;
	private int nacimiento;
	private char genero;
	
	public Persona(String nombre, String apellido, int nacimiento, char genero) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.nacimiento = nacimiento;
		this.genero = genero;
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

	@Override
	public String toString() {
		return "Persona [nacimiento=" + nacimiento + ", genero=" + genero + "]";
	}
	
	
	
}
