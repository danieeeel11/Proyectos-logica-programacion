package Ejercicio1;

public class Producto {
	private int codigo;
	private String descripcion;
	private long precio;
	private int cantidad;
	private Fecha vencimiento;
	/**
	 * @param codigo
	 * @param descripcion
	 * @param precio
	 * @param fechaVencimiento
	 * @param cantidad
	 */
	public Producto(int codigo, String descripcion, long precio, int cantidad, Fecha fecha) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
		this.cantidad = cantidad;
		this.vencimiento = fecha;
	}
	
	/**public void fechaVencimiento(int dia, int mes, int año) {
		this.fechaVencimiento =new Fecha (dia, mes, año);
	}
	**/
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
	public long getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(long precio) {
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

	public String toString () {
		return "Producto [codigo= " + codigo + ", descripcion= " + descripcion + 
				", precio= " + precio + ", cantidad= " + cantidad + 
				", fecha vencimiento= " + vencimiento + "]";
	}

}
