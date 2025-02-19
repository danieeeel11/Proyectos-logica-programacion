package EjInterface1Repaso;

public class Calculadora implements IOperacion{
	private double x;
	private double y;
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}

	@Override
	public double sumar() {
		return x+y;
	}

	@Override
	public double resta() {
		return x-y;
	}

	@Override
	public double multiplicar() {
		return x*y;
	}

	@Override
	public double dividir() {
		return x/y;
	}
	
	
	
	

}
