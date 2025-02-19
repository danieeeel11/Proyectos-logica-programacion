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
	private int año;
	/**
	 * @param dia
	 * @param mes
	 * @param año
	 */
	public Fecha(int dia, int mes, int año) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.año = año;
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
	/** Metodo para obtener una instancia de año de la clase Fecha
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
	 * Metodo para convertir los datos de las instancias de Fecha a cadena de caracteres tipo String
	 */
	public String toString() {
		return "Fecha [dia= " + dia + ", mes= " + mes + ", año= " + año + " ]";
	}

}



