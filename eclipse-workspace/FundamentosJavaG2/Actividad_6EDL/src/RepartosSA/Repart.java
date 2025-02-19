package RepartosSA;
/**
 * Clase Reparto que contiene los atributos del reparto
 * @author Laura Ojeda & Daniel Velasquez
 * @date 30-05-2021
 */
public class Repart {
	private int nReparto;
	private String UPZ;
	private String fecha;
	private Client cliente;
	private int semana;
	/**
	 * Constructor de la clase Repart
	 * @param nReparto
	 * @param uPZ
	 * @param cliente
	 */
	public Repart(int nReparto, String uPZ, Client cliente) {
		super();
		this.nReparto = nReparto;
		this.UPZ = uPZ;
		this.cliente = cliente;
	}
	
	/**
	 * Método get del núnmero del reparto
	 * @return el número del reparto
	 */
	public int getnReparto() {
		return nReparto;
	}
	/**
	 * Método set del número del reparto
	 * @param nReparto número del reparto
	 */
	public void setnReparto(int nReparto) {
		this.nReparto = nReparto;
	}
	/**
	 * Método de la Upz del reparto
	 * @return la Upz del reparto
	 */
	public String getUPZ() {
		return UPZ;
	}
	/**
	 * Método set de la Upz del reparto
	 * @param uPZ del reparto
	 */
	public void setUPZ(String uPZ) {
		UPZ = uPZ;
	}
	/**
	 * Método get de la fecha de la semana del reparto
	 * @return la fecha de la semana del reparto
	 */
	public String getFecha() {
		return fecha;
	}
	/**
	 * Método set de la fecha del reparto
	 * @param fecha del reparto
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	/**
	 * Método get del Cliente del reparto
	 * @return Cliente del reparto
	 */
	public Client getCliente() {
		return cliente;
	}
	/**
	 * Método set del Cliente del reparto
	 * @param cliente del reparto
	 */
	public void setCliente(Client cliente) {
		this.cliente = cliente;
	}
	/**
	 * Método get del número de la semana del reparto
     * @return el número de la semana del reparto
	 */
	public int getSemana() {
		return semana;
	}
	/**
	 * Método set del número de la semana del reparto
     * @param semana del reparto
	 */
	public void setSemana(int semana) {
		this.semana = semana;
	}
	
	/**
	 * Método toString de la clase
	 */
	@Override
	public String toString() {
		return "[N° Reparto= " + nReparto + ", Semana:"+ semana +", UPZ:" + UPZ + ", fecha:" + fecha +
				"]\nCliente:" + cliente + "]";
	}
}
