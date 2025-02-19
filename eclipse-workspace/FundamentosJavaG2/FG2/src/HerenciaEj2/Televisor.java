package HerenciaEj2;

public class Televisor extends Electrodomestico{
	private String sintonizador;

	/**
	 * @param marca
	 * @param modelo
	 * @param precioBase
	 * @param sintonizador
	 */
	public Televisor(String marca, String modelo, long precioBase, String sintonizador) {
		super(marca, modelo, precioBase);
		this.sintonizador = sintonizador;
	}

	/**
	 * @return the sintonizador
	 */
	public String isSintonizador() {
		return sintonizador;
	}

	/**
	 * @param sintonizador the sintonizador to set
	 */
	public void setSintonizador(String sintonizador) {
		this.sintonizador = sintonizador;
	}

	@Override
	public String toString() {
		return super.toString() + "Televisor [sintonizador=" + sintonizador + "]";
	}
	
	

}
