package Recursion;

import java.util.Scanner;

public class Ej4Potencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingresar el numero base");
		int base = teclado.nextInt();
		System.out.println("Ingrese el numero de la potencia");
		int pot = teclado.nextInt();
		
		System.out.println("El resultado es: " + potencia(base, pot));
	}
	
	public static int potencia(int base, int pot) {
		if (pot == 0) {
			return 1;
		}else {
			return base * potencia(base, pot-1);
		}
	}


}
