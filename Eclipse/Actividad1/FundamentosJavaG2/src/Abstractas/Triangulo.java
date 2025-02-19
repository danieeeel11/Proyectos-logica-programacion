package Abstractas;

public class Triangulo extends Figura{
	private double base;
	private double altura;
	/**
	 * @param base
	 * @param altura
	 */
	public Triangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	@Override
	public void calcularArea() {
		// TODO Auto-generated method stub
		this.area =((this.base * this.altura)/2);
	}
	@Override
	public String toString() {
		return "Triangulo [base=" + base + ", altura=" + altura + "]";
	}
	
	

}
