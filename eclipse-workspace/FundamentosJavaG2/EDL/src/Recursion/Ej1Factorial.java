package Recursion;

public class Ej1Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("El factorial es: " + factorial(3));
	}
	
	public static int factorial(int numero) {
		if (numero==0) {
			return 1;
		}
		else {
			return factorial(numero-1)*numero;
		}
	}

}
