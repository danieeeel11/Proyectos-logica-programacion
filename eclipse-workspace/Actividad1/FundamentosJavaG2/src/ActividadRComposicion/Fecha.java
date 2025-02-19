package ActividadRComposicion;

public class Fecha {
	private int año;
	private String mes;
	private int dia;
	/**
	 * @param año
	 * @param mes
	 * @param dia
	 */
	public Fecha(int año, String mes, int dia) {
		super();
		this.año = año;
		this.mes = mes;
		this.dia = dia;
	}
	/**
	 * @return the año
	 */
	public int getAño() {
		return año;
	}
	/**
	 * @param año the año to set
	 */
	public void setAño(int año) {
		this.año = año;
	}
	/**
	 * @return the mes
	 */
	public String getMes() {
		return mes;
	}
	/**
	 * @param mes the mes to set
	 */
	public void setMes(String mes) {
		this.mes = mes;
	}
	/**
	 * @return the dia
	 */
	public int getDia() {
		return dia;
	}
	/**
	 * @param dia the dia to set
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	

}
