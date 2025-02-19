package Abstractas;

public class Circulo extends Figura{
	private double radio;

	/**
	 * @param radio
	 */
	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	@Override
	public void calcularArea() {
		// TODO Auto-generated method stub
		this.area= (Math.PI * Math.pow(radio, 2));
	}

	@Override
	public String toString() {
		return "circulo [radio=" + radio + "]";
	}

	
	

}
