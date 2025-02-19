package EjInterface2Repaso;

public class Rectangulo implements IFigura{
	private double base;
	private double altura;
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return (2*base)+(2*altura);
	}
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return base*altura;
	}
	
	
}
