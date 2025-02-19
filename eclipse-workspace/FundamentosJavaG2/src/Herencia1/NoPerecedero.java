package Herencia1;

public class NoPerecedero extends Producto{
	private String componente;

	/**
	 * @param codigo
	 * @param nombre
	 * @param precio
	 * @param componente
	 */
	public NoPerecedero(int codigo, String nombre, int precio, String componente) {
		super(codigo, nombre, precio);
		this.componente = componente;
	}

	/**
	 * @return the componente
	 */
	public String getComponente() {
		return componente;
	}

	/**
	 * @param componente the componente to set
	 */
	public void setComponente(String componente) {
		this.componente = componente;
	}

	@Override
	public String toString() {
		return super.toString() + "NoPerecedero [componente=" + componente + "]";
	}
	
	
	

}
