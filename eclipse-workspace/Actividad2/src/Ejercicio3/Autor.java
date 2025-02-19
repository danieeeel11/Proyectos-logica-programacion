package Ejercicio3;
/**
 * Programa la clase Autor para crear objetos
 * @author Daniel Felipe Velásquez Rincón
 * @since 2020-08-28
 * @version 1
 *
 */

public class Autor {
	private String nombreAutor;
	private String nacionalidad;
	/**
	 * @param nombreAutor
	 * @param nacionalidad
	 */
	public Autor(String nombreAutor, String nacionalidad) {
		super();
		this.nombreAutor = nombreAutor;
		this.nacionalidad = nacionalidad;
	}
	/**
	 * @return the nombreAutor
	 */
	public String getNombreAutor() {
		return nombreAutor;
	}
	/**
	 * @param nombreAutor the nombreAutor to set
	 */
	public void setNombreAutor(String nombreAutor) {
		this.nombreAutor = nombreAutor;
	}
	/**
	 * @return the nacionalidad
	 */
	public String getNacionalidad() {
		return nacionalidad;
	}
	/**
	 * @param nacionalidad the nacionalidad to set
	 */
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	

}
