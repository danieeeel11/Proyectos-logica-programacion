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
	 * M�todo get del n�nmero del reparto
	 * @return el n�mero del reparto
	 */
	public int getnReparto() {
		return nReparto;
	}
	/**
	 * M�todo set del n�mero del reparto
	 * @param nReparto n�mero del reparto
	 */
	public void setnReparto(int nReparto) {
		this.nReparto = nReparto;
	}
	/**
	 * M�todo de la Upz del reparto
	 * @return la Upz del reparto
	 */
	public String getUPZ() {
		return UPZ;
	}
	/**
	 * M�todo set de la Upz del reparto
	 * @param uPZ del reparto
	 */
	public void setUPZ(String uPZ) {
		UPZ = uPZ;
	}
	/**
	 * M�todo get de la fecha de la semana del reparto
	 * @return la fecha de la semana del reparto
	 */
	public String getFecha() {
		return fecha;
	}
	/**
	 * M�todo set de la fecha del reparto
	 * @param fecha del reparto
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	/**
	 * M�todo get del Cliente del reparto
	 * @return Cliente del reparto
	 */
	public Client getCliente() {
		return cliente;
	}
	/**
	 * M�todo set del Cliente del reparto
	 * @param cliente del reparto
	 */
	public void setCliente(Client cliente) {
		this.cliente = cliente;
	}
	/**
	 * M�todo get del n�mero de la semana del reparto
     * @return el n�mero de la semana del reparto
	 */
	public int getSemana() {
		return semana;
	}
	/**
	 * M�todo set del n�mero de la semana del reparto
     * @param semana del reparto
	 */
	public void setSemana(int semana) {
		this.semana = semana;
	}
	
	/**
	 * M�todo toString de la clase
	 */
	@Override
	public String toString() {
		return "[N� Reparto= " + nReparto + ", Semana:"+ semana +", UPZ:" + UPZ + ", fecha:" + fecha +
				"]\nCliente:" + cliente + "]";
	}
}
