package Lab1;

import java.util.Scanner;

public class AppCuenta {
	public static Scanner leerDato = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Bienvenido");
		System.out.println("Va a consignar o retirar saldo");
		System.out.println("1 = Consignar");
		System.out.println("2 = Retirar");
		double cr = leerDato.nextDouble();
		
		
		Cuenta c = new Cuenta();
		if(cr == 1) {
			System.out.println("Cantidad a consignar:");
			double cantidad = leerDato.nextDouble();
			c.consignar(cantidad);
		}else {
			System.out.println("Cantidad a retirar");
			double cantidad = leerDato.nextDouble();
			c.retirar(cantidad);
		}
		
		System.out.println("¿Desea ver su saldo?");
		System.out.println("1 = Si");
		System.out.println("2 = No");
		double s = leerDato.nextDouble();
		
		if(s == 1) {
			System.out.println(c.obtenerSaldo());
			System.out.println("Gracias!");
		}else {
			System.out.println("Gracias!");
		}
	}

}
