package Ej3;

import java.util.Scanner;

public class AppDifArray {
	public static Scanner leerDato = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Escriba el numero de elementos del arreglo");
		int x = leerDato.nextInt();
		int[] array = new int[x];
		
		for(int i=0; i<array.length; i++) {
			System.out.println("Introducir los enteros");
			array[i] = leerDato.nextInt();
		}
		
		DifArray.difArreglo(array);

	}

}
