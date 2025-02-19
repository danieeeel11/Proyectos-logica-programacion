package Calculadora;

/**
 * Programa principal para ingresar los numeros a y b, para luego hacer los
 * calculos debidos
 * @author Daniel Felipe Velásquez Rincón
 * @version 1
 * @date 04-02-2021
 */

import java.util.Scanner;

public class AppCalBinaria {
	public static Scanner leer = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Programa para llegar de un numero 'a' al numero 'b', operando con -2 y +3");
		System.out.println("Ingrese el primer valor");
		int a = leer.nextInt();
		System.out.println("Ingrese el segundo valor");
		int b = leer.nextInt();
		System.out.println("El numero de pasos minimos es: " 
		+ CalculadoraBinaria.minPasos(a, b));
	}

}
