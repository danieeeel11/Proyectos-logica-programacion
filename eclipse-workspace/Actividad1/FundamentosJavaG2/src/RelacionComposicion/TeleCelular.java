package RelacionComposicion;

public class TeleCelular {
	private String marca;
	private String modelo;
	private Antena antena;
	/**
	 * @param marca
	 * @param modelo
	 */
	public TeleCelular(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
		//Se implementa una relacion de composicion
		//this.antena =new Antena(potencia);
	}
	public void crearAntena(int potencia) {
		this.antena =new Antena(potencia);
	}
	/**
	 * Metodo para obtener la marca del telefono celular
	 * @return the marca es de dato tipo String con la marca del telefono celular
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/**
	 * @return the antena
	 */
	public Antena getAntena() {
		return antena;
	}
	/**
	 * @param antena the antena to set
	 */
	public void setAntena(Antena antena) {
		this.antena = antena;
	}
	
	
	
	
	

}
