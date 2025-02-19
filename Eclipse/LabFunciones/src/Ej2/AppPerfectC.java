package Ej2;

import java.util.Scanner;

public class AppPerfectC {
	public static Scanner leerDato = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Entrar dato de tipo entero");
		int dato = leerDato.nextInt();
		
		if(NPerfectC.perfecto(dato)) {
			System.out.println("El numero es perfecto");
		}else {
			System.out.println("El numero no es perfecto");
		}

	}

}
