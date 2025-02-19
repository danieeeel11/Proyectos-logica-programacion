package AbstractasEj1;

public class Rectangulo1 extends Figura1{
	private double ancho;
	private double alto;
	/**
	 * @param ancho
	 * @param alto
	 */
	public Rectangulo1(double ancho, double alto) {
		super();
		this.ancho = ancho;
		this.alto = alto;
	}
	@Override
	public void calcularArea() {
		// TODO Auto-generated method stub
		this.area =(this.ancho * this.alto);
	}
	@Override
	public void calcularPerimetro() {
		// TODO Auto-generated method stub
		this.perimetro= ((2*ancho)+(2*alto));
	}
	/**
	 * @return the ancho
	 */
	public double getAncho() {
		return ancho;
	}
	/**
	 * @param ancho the ancho to set
	 */
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	/**
	 * @return the alto
	 */
	public double getAlto() {
		return alto;
	}
	/**
	 * @param alto the alto to set
	 */
	public void setAlto(double alto) {
		this.alto = alto;
	}
	
	@Override
	public String toString() {
		return "Rectangulo [ancho=" + ancho + ", alto=" + alto + "]";
	}
	
	
	
	

}
