package POO;
/**
 * Programa la clase categoria para crear objetos
 * @author Daniel Felipe Velasquez Rincon
 * @since 2020-08-27
 * @version 1
 */

public class Categoria {
	private int codigoCategoria;
	private String descripcionCategoria;
	/**
	 * @param codigoCategoria
	 * @param descripcionCategoria
	 */
	public Categoria(int codigoCategoria, String descripcionCategoria) {
		super();
		this.codigoCategoria = codigoCategoria;
		this.descripcionCategoria = descripcionCategoria;
	}
	/**
	 * @return the codigoCategoria
	 */
	public int getCodigoCategoria() {
		return codigoCategoria;
	}
	/**
	 * @param codigoCategoria the codigoCategoria to set
	 */
	public void setCodigoCategoria(int codigoCategoria) {
		this.codigoCategoria = codigoCategoria;
	}
	/**
	 * @return the descripcionCategoria
	 */
	public String getDescripcionCategoria() {
		return descripcionCategoria;
	}
	/**
	 * @param descripcionCategoria the descripcionCategoria to set
	 */
	public void setDescripcionCategoria(String descripcionCategoria) {
		this.descripcionCategoria = descripcionCategoria;
	}
	
	
	

}
