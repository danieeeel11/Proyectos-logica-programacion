package Ej4;

import java.util.Scanner;

public class App {
	public static Scanner leerDato = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Escriba el numero de elementos del arreglo");
		int x = leerDato.nextInt();
		int[] numeros = new int[x+1];
		
		for(int i=1; i<numeros.length; i++) {
			System.out.println("Introducir los enteros");
			numeros[i] = leerDato.nextInt();
		}
		
		System.out.println("Entrar el dato a buscar");
		int dato = leerDato.nextInt();
		
		Funcion.buscarDato(numeros, dato);

	}

}
