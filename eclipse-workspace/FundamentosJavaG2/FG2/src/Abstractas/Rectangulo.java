package Abstractas;

public class Rectangulo extends Figura{
	private double ancho;
	private double alto;
	/**
	 * @param ancho
	 * @param alto
	 */
	public Rectangulo(double ancho, double alto) {
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
	public String toString() {
		return "Rectangulo [ancho=" + ancho + ", alto=" + alto + "]";
	}

}