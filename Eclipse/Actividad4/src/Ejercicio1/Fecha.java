package Ejercicio1;
/**
 * Programa la clase Fecha para crear objetos
 * @author Daniel Felipe Velasquez Rincon
 * @since 2020-10-02
 * @version 1
 */

public class Fecha {
	private int dia;
	private String mes;
	private int año;
	/**
	 * @param dia
	 * @param mes
	 * @param año
	 */
	public Fecha(int dia, String mes, int año) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.año = año;
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
	 * Metodo de la clase Object para retornar una cadena de caracteres
	 */
	@Override
	public String toString() {
		return "[Dia= " + dia + ", mes= " + mes + ", año= " + año + " ]";
	}

}
