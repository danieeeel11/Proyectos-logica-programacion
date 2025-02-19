package AbstractasEj1;

import java.util.Scanner;

public class AppFigura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leerDato =new Scanner(System.in);
		
		System.out.println("Buen dia");
		System.out.println("Figuras geometricas");
		System.out.println("..............................................");
		System.out.println(" ");
		System.out.println("Datos circulo");
		System.out.println("Radio del circulo...");
		double radio =leerDato.nextDouble();
		Circulo1 objetoCirculo =new Circulo1(radio);
		objetoCirculo.calcularPerimetro();
		objetoCirculo.calcularArea();
		
		System.out.println("");
		System.out.println("Datos triangulo");
		System.out.println("Lado 1...");
		double lado1 =leerDato.nextDouble();
		System.out.println("Lado 2...");
		double lado2 =leerDato.nextDouble();
		System.out.println("Lado 3...");
		double lado3 =leerDato.nextDouble();
		Triangulo1 objetoTriangulo =new Triangulo1(lado1,lado2,lado3);
		objetoTriangulo.calcularPerimetro();
		objetoTriangulo.calcularArea();
		
		System.out.println("");
		System.out.println("Datos rectangulo");
		System.out.println("Ancho...");
		double ancho =leerDato.nextDouble();
		System.out.println("Alto...");
		double alto =leerDato.nextDouble();
		Rectangulo1 objetoRectangulo =new Rectangulo1(ancho, alto);
		objetoRectangulo.calcularPerimetro();
		objetoRectangulo.calcularArea();
		
		System.out.println("");
		System.out.println("");
		System.out.println("Circulo");
		System.out.println("Perimetro: " + objetoCirculo.getPerimetro());
		System.out.println("Area: " + objetoCirculo.getArea());
		System.out.println(" ");
		System.out.println("Triangulo");
		System.out.println("Perimetro: " + objetoTriangulo.getPerimetro());
		System.out.println("Area: " + objetoTriangulo.getArea());
		System.out.println(" ");
		System.out.println("Rectangulo");
		System.out.println("Perimetro: " + objetoRectangulo.getPerimetro());
		System.out.println("Area: " + objetoRectangulo.getArea());
		
		

	}

}
