package Abstractas;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circulo objetoCirculo =new Circulo(25);
		objetoCirculo.calcularArea();
		System.out.println(objetoCirculo.getArea());
		
		Triangulo objetoTriangulo =new Triangulo(20,33);
		objetoTriangulo.calcularArea();
		System.out.println(objetoTriangulo.getArea());
		
		Rectangulo objetoRectangulo =new Rectangulo(20,35);
		objetoRectangulo.calcularArea();
		System.out.println(objetoRectangulo.getArea());
		
		

	}

}
