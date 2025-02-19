package actividad1;

public class Ejercicio1 {
	private static int base;
	private static int altura;
	private static double area;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		base = 10;
		altura = 30;
		
		calcularArea(10,30);
		System.out.println("El Area del Triangulo es: " + area);
		
		if (base>altura) {
			System.out.println("La base es mayor");
		} else {
			System.out.println("La altura es mayor");

		}

	}
	public static void calcularArea(int a, int b) {
		area = (b*a) /2;
	}

}
