package EjemploLambda;

public class EjemploLambda1 {
	public double operar() {
		IOperacion unaOperacion = (x, y) -> (x * y);
		return unaOperacion.calcularResultado(7, 5);
	}
	public static void main(String[] args) {
		EjemploLambda1 obj = new EjemploLambda1();
		System.out.println(obj.operar());
	}
}
