package Recursion;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingresar el numero de datos a sumar");
		int numero = teclado.nextInt();
		
		System.out.println("El resultado es: " + sumatoria(numero));
	}
	
	public static int sumatoria(int numero) {
		if (numero == 0) {
			return 0;
		}else {
			return sumatoria(numero-1) + numero;
		}
	}

}
