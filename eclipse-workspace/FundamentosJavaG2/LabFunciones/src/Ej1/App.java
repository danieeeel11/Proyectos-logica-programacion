package Ej1;

import java.util.Scanner;

/**
 * 
 * @author Daniel Felipe Velasquez Rincon
 *
 */

public class App {
	public static Scanner leerDato = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Escriba el numero de elementos del arreglo");
		int x = leerDato.nextInt();
		int[] numero = new int[x];
		
		for(int i=0; i<numero.length; i++) {
			System.out.println("Introducir los enteros");
			numero[i] = leerDato.nextInt();
		}
		
		System.out.println("Entrar el dato a buscar");
		int dato = leerDato.nextInt();
		
		int a = Array.buscarDato(numero, dato);
		if(a == -1) {
			System.out.println("Dato no encontrado " + a);
		}else {
			System.out.println("Dato encontrado " + a);
		}
		

	}

}
