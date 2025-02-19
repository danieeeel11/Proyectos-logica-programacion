package personajes.abstracts;

import java.io.File;

import personajes.Utils;

public abstract class AbstractFactory {

	private String nombrePersonaje;
	
	public abstract String crearCabeza();
	public abstract void crearCuerpo();
	public abstract void crearPies();
	
	public String getNombre() {
		return nombrePersonaje;
	}
	public void setNombre(String nombre) {
		this.nombrePersonaje=nombre;
	}
	
	public void crearPersonaje(String nombre) {
		this.nombrePersonaje=nombre;
		crearCarpeta();
		crearCabeza();
		crearCuerpo();
		crearPies();
	}
	
	
	public void crearCarpeta() {
		System.out.println("Creo carpeta con nombre: "+nombrePersonaje);
		   File directorio = new File(Utils.URL_LOCAL+nombrePersonaje);
	        if (!directorio.exists()) {
	            if (directorio.mkdirs()) {
	                System.out.println("Directorio creado");
	            } else {
	                System.out.println("Error al crear directorio");
	            }
	        }
		
		
	}
}
