package Ejercicio1;
/**
 * Clase de tipo carro que contiene la marca y modelo del carro
 * @author Laura Sofia Ojeda Leon & Daniel Felipe Velasquez Rincon
 * @version 1
 * @since 29-04-2021
 */
public class Carro {
	private String marca;
	private int modelo;
	
	public Carro(String marca, int modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", modelo=" + modelo + "]";
	}
	
	public String aArchivo() {
		return marca + ":" + modelo;  
	}
}
