package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayD {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leerDato = new Scanner(System.in);
		int[] array = new int[5];
		int[] arra1 = {4,6,9,10,25};
		int[] arra2 = {4,6,9,10,25};
		int dato;
		int suma = 0;
		
		////////////////////////////////////////////////////
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Entrar un dato entero");
			array[i] = leerDato.nextInt();
		}
		/**
		 * Imprime los datos de un array 
		 */
		System.out.println(Arrays.toString(array));
		/**
		 * Ordena el arreglo por el algoritmo sort o burbuja
		 */
		Arrays.sort(array);
		
		System.out.println();
		System.out.println("Arreglo ordenado");
		System.out.print(Arrays.toString(array));
		
		////////////////////////////////////////////////////
		
		for (int i = 0; i < arra2.length; i++) {
			suma += arra1[i] + arra2[i];
		}
		
		for (int i = 0; i < arra2.length; i++) {
			if (arra1[i] == arra2[i]) {
				
			}
		}
	}
}
