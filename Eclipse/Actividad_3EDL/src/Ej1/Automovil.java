package Ej1;
/**
 * Clase automovil que contiene las instancias marca y modelo
 * @author Laura Sofia Ojeda Leon & Daniel Felipe Velasquez Rincon
 * @version 1
 * @since 09-04-2021
 */
public class Automovil {
	private String marca;
	private String modelo;
	
	/**
	 * Constructor de la clase
	 * @param marca del automovil
	 * @param modelo del automovil
	 */
	public Automovil(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}
	/**
	 * 
	 * @return la marca del automovil
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * 
	 * @param marca del automovil
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * 
	 * @return el modelo del automovil
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * 
	 * @param modelo del automovil
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
	@Override
	public String toString() {
		return "Automovil [marca=" + marca + ", modelo=" + modelo + "]";
	}
}
