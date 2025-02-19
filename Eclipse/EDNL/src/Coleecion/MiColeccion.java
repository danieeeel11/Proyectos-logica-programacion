package Coleecion;

import java.util.Enumeration;
import java.util.Hashtable;

public class MiColeccion {
	private Hashtable<String, Estudiante> coleccionEstudiante;
	public MiColeccion() {
		coleccionEstudiante = new Hashtable<String, Estudiante>();
	}
	
	public void anexarRegistro(String codigo, Estudiante est) {
		coleccionEstudiante.put(codigo, est);
	}
	
	public void mostrarColeccion() {
		System.out.println("Mostrar la coleccion");
		System.out.println(coleccionEstudiante);
	}
	
	public void borrarRegistro(String codigo) {
		coleccionEstudiante.remove(codigo);
	}
	
	public void actualizarRegistro(String codigo, Estudiante est) {
		coleccionEstudiante.put(codigo, est);
	}
	
	public void imprimirColeccion() {
		System.out.println("\nVisualizar la coleccion");
		System.out.println(coleccionEstudiante);
	}
	
	public void imprimirColeccionEstudiante1() {
		System.out.println("\nDatos coleccion de datos");
		Enumeration<String> claves = coleccionEstudiante.keys();
		while(claves.hasMoreElements()) {
			String clave = claves.nextElement();
			System.out.println(coleccionEstudiante.get(clave).getApellido() + " " + coleccionEstudiante.get(clave).getNombre());
		}
	}
	
	public void imprimirColeccionEstudiante2() {
		System.out.println("\nEnumeration...");
		Enumeration<Estudiante> elementos = coleccionEstudiante.elements();
		while(elementos.hasMoreElements()) {
			System.out.println(elementos.nextElement().toString());
		}
	}
}
