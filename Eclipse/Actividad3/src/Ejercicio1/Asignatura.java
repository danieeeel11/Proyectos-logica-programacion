package Ejercicio1;

public class Asignatura {
	private int codigoAsig;
	private String denoAsig;
	/**
	 * @param codigoAsig
	 * @param denoAsig
	 */
	public Asignatura(int codigoAsig, String denoAsig) {
		super();
		this.codigoAsig = codigoAsig;
		this.denoAsig = denoAsig;
	}
	/**
	 * @return the codigoAsig
	 */
	public int getCodigoAsig() {
		return codigoAsig;
	}
	/**
	 * @param codigoAsig the codigoAsig to set
	 */
	public void setCodigoAsig(int codigoAsig) {
		this.codigoAsig = codigoAsig;
	}
	/**
	 * @return the denoAsig
	 */
	public String getDenoAsig() {
		return denoAsig;
	}
	/**
	 * @param denoAsig the denoAsig to set
	 */
	public void setDenoAsig(String denoAsig) {
		this.denoAsig = denoAsig;
	}
	
	

}
