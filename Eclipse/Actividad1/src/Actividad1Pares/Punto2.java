package Actividad1Pares;

import java.util.Scanner;

public class Punto2 {
	
	public static double ancho;
	public static double largo;
	public static double longitud;
	public static double radio;
	public static double area;
	public static Scanner leerAncho =new Scanner(System.in);
	public static Scanner leerLargo =new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Calcular area circular con piel de buey (cuadrado)");
		System.out.print("Entre la medida del ancho - ");
		ancho=leerAncho.nextDouble();
		System.out.print("Entre la medida del largo - ");
		largo=leerLargo.nextDouble();
		
		longitud=largo*(ancho*1000);
		radio=longitud/(2*3.14);
		area=(3.14*(radio*radio))/1000000;
		// 1000000; porque se debe a que es de m2 a km2; 1m2 = 1000000km2
		System.out.println();
		System.out.println("El area total en km cuadrados con la piel de buey es= " +area);
		
	}

}
