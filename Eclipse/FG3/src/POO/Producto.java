package POO;

public class Producto {
	private int codigoProducto;
	private String descripcionProducto;
	private String marca;
	private long precio;
	private int descuento;
	private Categoria categoria;
	/**
	 * Constructor
	 * @param codigoProducto
	 * @param descripcionProducto
	 * @param marca
	 * @param precio
	 * @param descuento
	 * @param categoria
	 */
	public Producto(int codigoProducto, String descripcionProducto, String marca, long precio, int descuento,
			Categoria categoria) {
		super();
		this.codigoProducto = codigoProducto;
		this.descripcionProducto = descripcionProducto;
		this.marca = marca;
		this.precio = precio;
		this.descuento = descuento;
		this.categoria = categoria; //relacion-de-asociacion
	}
	/**
	 * @return the codigoProducto
	 */
	public int getCodigoProducto() {
		return codigoProducto;
	}
	/**
	 * @param codigoProducto the codigoProducto to set
	 */
	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	/**
	 * @return the descripcionProducto
	 */
	public String getDescripcionProducto() {
		return descripcionProducto;
	}
	/**
	 * @param descripcionProducto the descripcionProducto to set
	 */
	public void setDescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
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
	 * @return the descuento
	 */
	public int getDescuento() {
		return descuento;
	}
	/**
	 * @param descuento the descuento to set
	 */
	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	/**
	 * @return the categoria
	 */
	public Categoria getCategoria() {
		return categoria;
	}
	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
}