package HerenciaEj2;

public class Lavadora extends Electrodomestico{
	private int carga;

	/**
	 * @param marca
	 * @param modelo
	 * @param precioBase
	 * @param carga
	 */
	public Lavadora(String marca, String modelo, long precioBase, int carga) {
		super(marca, modelo, precioBase);
		this.carga = carga;
	}

	/**
	 * @return the carga
	 */
	public int getCarga() {
		return carga;
	}

	/**
	 * @param carga the carga to set
	 */
	public void setCarga(int carga) {
		this.carga = carga;
	}

	@Override
	public String toString() {
		return super.toString() + "Lavadora [carga=" + carga + "]";
	}
	
	

}