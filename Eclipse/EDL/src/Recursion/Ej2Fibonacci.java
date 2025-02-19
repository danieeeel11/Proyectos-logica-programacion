package Recursion;

import java.util.Scanner;

public class Ej2Fibonacci {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		int resultado;
		
		System.out.println("Ingresar un numero entero");
		numero = teclado.nextInt();
		
		resultado = fibonacci(numero);
		System.out.println("El resultado es: " + resultado);
	}
	
	public static int fibonacci(int numero) {
		if (numero == 0) {
			return 0;
		}else if (numero == 1){ 
			return 1;
		}else {
			return fibonacci(numero-1) + fibonacci(numero-2);
		}
	}

}
