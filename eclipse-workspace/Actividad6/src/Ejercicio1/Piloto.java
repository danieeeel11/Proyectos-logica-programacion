package Ejercicio1;
/**
 * Clase Piloto que contiene los datos del piloto, identificacion , nombre, y las horas de vuelo,
 * tiene la herencia de los datos de id y nombre de la superclase persona
 * @author Daniel Velasquez y julian Cardenas
 * @since 24-10-2020
 * @version 1
 * 
 */

public class Piloto extends Persona{
	private int horasVuelo;

	/**
	 * @param id
	 * @param nombre
	 * @param horasVuelo
	 */
	public Piloto(int id, String nombre, int horasVuelo) {
		super(id, nombre);
		this.horasVuelo = horasVuelo;
	}

	/**
	 * @return the horasVuelo
	 */
	public int getHorasVuelo() {
		return horasVuelo;
	}

	/**
	 * @param horasVuelo the horasVuelo to set
	 */
	public void setHorasVuelo(int horasVuelo) {
		this.horasVuelo = horasVuelo;
	}

	@Override
	public String toString() {
		return super.toString() + "Piloto [horasVuelo=" + horasVuelo + "]";
	}
	
	

}
