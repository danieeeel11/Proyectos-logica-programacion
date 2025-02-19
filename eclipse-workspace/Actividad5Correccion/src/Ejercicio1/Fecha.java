package Ejercicio1;
/**
 * Programa la clase fecha para crear objetos
 * @author Daniel Felipe Velasquez Rincon
 * @since 2020-10-13
 * @version 1
 */


public class Fecha {
	private int dia;
	private int mes;
	private int a�o;
	/**
	 * @param dia
	 * @param mes
	 * @param a�o
	 */
	public Fecha(int dia, int mes, int a�o) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.a�o = a�o;
	}
	/** Metodo para obtener una instancia de dia de la clase Fecha
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
	/** Metodo para obtener una instancia de mes de la clase Fecha
	 * @return the mes
	 */
	public int getMes() {
		return mes;
	}
	/**
	 * @param mes the mes to set
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}
	/** Metodo para obtener una instancia de a�o de la clase Fecha
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
	 * Metodo para convertir los datos de las instancias de Fecha a cadena de caracteres tipo String
	 */
	public String toString() {
		return "Fecha [dia= " + dia + ", mes= " + mes + ", a�o= " + a�o + " ]";
	}

}



