package Ej3;

import java.util.Arrays;

public class DifArray {
	public static void difArreglo(int[] array) {
		int[] arrayD = new int[array.length-1];
		for(int i=0; i<arrayD.length; i++) {
			arrayD[i] = (array[i]-array[i+1]);
			//System.out.println(arrayD[i] + " ");
		}
		System.out.println(" ");
		System.out.println("Arreglo original");
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println(" ");
		System.out.println("Arreglo resultante");
		for(int i=0; i<arrayD.length; i++) {
			System.out.print(arrayD[i] + " ");
		}
		//System.out.println(Arrays.toString(arrayD)); para imprimir el arreglo
	}
}