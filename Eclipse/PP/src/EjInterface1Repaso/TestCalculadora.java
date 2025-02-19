package EjInterface1Repaso;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora unaCalculadora = new Calculadora();
		double x = 7;
		double y = 2;
		
		unaCalculadora.setX(x);
		unaCalculadora.setY(y);
		
		System.out.println("Suma: " + unaCalculadora.sumar());
		System.out.println("Resta: " + unaCalculadora.resta());
		System.out.println("Multiplicacion: " + unaCalculadora.multiplicar());
		System.out.println("Division: " + unaCalculadora.dividir());
	}

}
