package Abstractas;

public abstract class Figura {
	protected double area;
	
	public double getArea() {
		return this.area;
	}
	
	public abstract void calcularArea();
	//public abstract double calcularPerimetro();

}
