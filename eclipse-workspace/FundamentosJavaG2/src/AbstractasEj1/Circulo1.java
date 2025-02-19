package AbstractasEj1;

public class Circulo1 extends Figura1{
	private double radio;

	/**
	 * @param radio
	 */
	public Circulo1(double radio) {
		super();
		this.radio = radio;
	}

	@Override
	public void calcularArea() {
		// TODO Auto-generated method stub
		this.area= (Math.PI * Math.pow(radio, 2));
	}

	@Override
	public void calcularPerimetro() {
		// TODO Auto-generated method stub
		this.perimetro= (2 * Math.PI * radio);
	}
	

	/**
	 * @return the radio
	 */
	public double getRadio() {
		return radio;
	}

	/**
	 * @param radio the radio to set
	 */
	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}
	
	

}
