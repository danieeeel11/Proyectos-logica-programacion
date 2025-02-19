package Herencia1;
/**
 * 
 * @author User
 *
 */
public class Producto {
	protected int codigo;
	protected String nombre;
	protected int precio;
	/**
	 * @param codigo
	 * @param nombre
	 * @param precip
	 */
	public Producto(int codigo, String nombre, int precio) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}
	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
	 * @return the precip
	 */
	public int getPrecip() {
		return precio;
	}
	/**
	 * @param precip the precip to set
	 */
	public void setPrecip(int precip) {
		this.precio = precip;
	}
	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	
	

}
