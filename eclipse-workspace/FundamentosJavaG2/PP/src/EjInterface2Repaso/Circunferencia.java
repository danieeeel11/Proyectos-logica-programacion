package EjInterface2Repaso;

public class Circunferencia implements IFigura{
	private double radio;

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public double calcularPerimetro() {
		return 2*Math.PI*radio;
	}

	@Override
	public double calcularArea() {
		return Math.PI *Math.pow(radio, 2);
	}
	
	public double calcularDiametro() {
		return radio*2;
	}
	
	
}
