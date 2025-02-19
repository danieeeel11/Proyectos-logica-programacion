package Ejercicio1;
/**
 * Clase puesto que contiene los datos del puesto, la letra que acompaña al asiento, el numero, y el pasajero asignado
 * @author Daniel Velasquez y julian Cardenas
 * @since 24-10-2020
 * @version 1
 * 
 */

public class Puesto {
	final static String LETRA = "A";
	private int numero;
	private Pasajero pasajero;
	
	
	/**
	 * @param letra
	 * @param numero
	 * @param pasajero
	 */
	public Puesto(int numero, Pasajero pasajero) {
		super();
		//this.letra = letra;
		this.numero = numero;
		this.pasajero = pasajero;
	}

	/**public String denominacion() {
		int n = 100;
		denominacion = "A" + n;
		n++;
		return denominacion;
	}
	**/
	
	
	/**
	 * @return the pasajero
	 */
	public Pasajero getPasajero() {
		return pasajero;
	}
	

	/**
	 * @return the letra
	 */
	public static String getLetra() {
		return LETRA;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @param pasajero the pasajero to set
	 */
	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}

	@Override
	public String toString() {
		return "Puesto [letra=" + LETRA + ", numero=" + numero + ", pasajero=" + pasajero + "]";
	}
	
	
	
	
	

}
