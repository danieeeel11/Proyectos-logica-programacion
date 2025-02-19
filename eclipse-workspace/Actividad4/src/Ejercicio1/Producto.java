package Ejercicio1;
/**
 * Programa la clase Producto para crear objetos
 * @author Daniel Felipe Velasquez Rincon
 * @since 2020-10-02
 * @version 1
 */

public class Producto {
	private int codigo;
	private String descripcion;
	private int precio;
	private int cantidad;
	private Fecha vencimiento;
	/**
	 * @param codigo
	 * @param descripcion
	 * @param precio
	 * @param cantidad
	 * @param vencimiento
	 */
	public Producto(int codigo, String descripcion, int precio, int cantidad) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
		this.cantidad = cantidad;
		//this.vencimiento = vencimiento;
	}
	/**
	 * Metodo para asignar los datos de fecha de vencimiento de la clase Fecha a la clase Producto
	 * @param dia
	 * @param mes
	 * @param año
	 */
	public void agregarFechaVencimiento(int dia, String mes, int año) {
		this.vencimiento =new Fecha(dia, mes, año);
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
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	/**
	 * @return the cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * @return the vencimiento
	 */
	public Fecha getVencimiento() {
		return vencimiento;
	}

	/**
	 * @param vencimiento the vencimiento to set
	 */
	public void setVencimiento(Fecha vencimiento) {
		this.vencimiento = vencimiento;
	}
	
	/**
	 * Metodo de la clase Object para retornar una cadena de caracteres
	 */
	@Override
	public String toString() {
		return "Producto [codigo= " + codigo + ", descripcion= " + descripcion + ", precio= " + precio + 
				", cantidad= " + cantidad + ", fecha vencimiento= " + vencimiento + "]";
	}

}
