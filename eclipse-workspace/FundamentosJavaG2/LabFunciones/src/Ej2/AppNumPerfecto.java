package Ej2;

import java.util.Scanner;

public class AppNumPerfecto {
	public static Scanner leerDato = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese un numero para determinar si es perfecto");
		int numero = leerDato.nextInt();
		NumPerfecto.NumPerfecto(numero);
	}

}
