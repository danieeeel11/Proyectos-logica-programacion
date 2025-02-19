package AbstractasEj1;

public abstract class Figura1 {
	protected double area;
	protected double perimetro;
	
	public double getArea() {
		return this.area;
	}
	public double getPerimetro() {
		return this.perimetro;
	}
	
	public abstract void calcularArea();
	public abstract void calcularPerimetro();

}
