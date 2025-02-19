package HerenciaEj2;

public class Electrodomestico {
	protected String marca;
	protected String modelo;
	protected long precioBase;
	/**
	 * @param marca
	 * @param modelo
	 * @param precioBase
	 */
	public Electrodomestico(String marca, String modelo, long precioBase) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precioBase = precioBase;
	}
	
	/**
	 * @return the marca
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
	 * @return the precioBase
	 */
	public long getPrecioBase() {
		return precioBase;
	}
	/**
	 * @param precioBase the precioBase to set
	 */
	public void setPrecioBase(long precioBase) {
		this.precioBase = precioBase;
	}
	@Override
	public String toString() {
		return "Electrodomestico [marca=" + marca + ", modelo=" + modelo + ", precioBase=" + precioBase + "]";
	}
	
	

}