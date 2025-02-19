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
	private int a�o;
	/**
	 * @param dia
	 * @param mes
	 * @param a�o
	 */
	public Fecha(int dia, String mes, int a�o) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.a�o = a�o;
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
	 * @return the a�o
	 */
	public int getA�o() {
		return a�o;
	}
	/**
	 * @param a�o the a�o to set
	 */
	public void setA�o(int a�o) {
		this.a�o = a�o;
	}
	
	/**
	 * Metodo de la clase Object para retornar una cadena de caracteres
	 */
	@Override
	public String toString() {
		return "[Dia= " + dia + ", mes= " + mes + ", a�o= " + a�o + " ]";
	}

}
