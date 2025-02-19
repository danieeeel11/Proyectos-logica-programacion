package Abstracts;

public class Triangulo1 extends Figura1{
	private double lado1;
	private double lado2;
	private double lado3;
	/**
	 * @param lado1
	 * @param lado2
	 * @param lado3
	 */
	public Triangulo1(double lado1, double lado2, double lado3) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	@Override
	public void calcularArea() {
		// TODO Auto-generated method stub
		double semiperimetro =perimetro/2;
		this.area= (Math.sqrt(semiperimetro*(semiperimetro-lado1)*(
				semiperimetro-lado2)*(semiperimetro-lado3)));
	}
	@Override
	public void calcularPerimetro() {
		// TODO Auto-generated method stub
		this.perimetro= (lado1 + lado2 + lado3);
	}
	/**
	 * @return the lado1
	 */
	public double getLado1() {
		return lado1;
	}
	/**
	 * @param lado1 the lado1 to set
	 */
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}
	/**
	 * @return the lado2
	 */
	public double getLado2() {
		return lado2;
	}
	/**
	 * @param lado2 the lado2 to set
	 */
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	/**
	 * @return the lado3
	 */
	public double getLado3() {
		return lado3;
	}
	/**
	 * @param lado3 the lado3 to set
	 */
	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}
	
	
	@Override
	public String toString() {
		return "Triangulo [lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + "]";
	}
	
	
	
	

}