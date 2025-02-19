package RepartosSA;
/**
 * Clase Domicilio que contiene los atributos del domicilio
 * @author Laura Ojeda & Daniel Velasquez
 * @date 30-05-2021
 */
public class Domicilio {
	private boolean entregado;
	private Repart re;
	private Domicili domi;
	/**
	 * Constructor de la clase Domicilio
	 * @param entregado
	 * @param re
	 * @param domi
	 */
	public Domicilio(boolean entregado, Repart re, Domicili domi) {
		super();
		this.entregado = entregado;
		this.re = re;
		this.domi = domi;
	}
	
	/**
	 * M�todo get del estado (Entregado o no entregado) del reparto 
	 * @return el estado
	 */
	public boolean isEntregado() {
		return entregado;
	}
	/**
	 * M�todo set del estado (Entregado o no entregado) del reparto 
	 * @param entregado 
	 */
	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}
	/**
	 * M�todo get del reparto
	 * @return el reparto
	 */
	public Repart getRe() {
		return re;
	}
	/**
	 * M�todo set del Reparto
	 * @param re reparto
	 */
	public void setRe(Repart re) {
		this.re = re;
	}
	/**
	 * M�todo get del domicilario
	 * @return domiciliario
	 */
	public Domicili getDomi() {
		return domi;
	}
	/**
	 * M�todo set del domiciliario 
	 * @param domi domiciliario
	 */
	public void setDomi(Domicili domi) {
		this.domi = domi;
	}
	
	/**
	 * M�todo toString de la clase
	 */
	@Override
	public String toString() {
		return "Domicilio [Entrega= " + entregado + "]\nDomiciliario: " + domi + " \nReparto: " + re +  "\n-----";
	}
}
