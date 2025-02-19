package Ej3;

import java.util.Arrays;
import java.util.Scanner;

public class AppDif {
	public static Scanner leerDato = new Scanner(System.in);
	public static void main(String[] args) {
		int[] arreglo = new int [8];
		for(int i=0; i<arreglo.length; i++) {
			System.out.println("Introducir los enteros");
			arreglo[i] = leerDato.nextInt();
		}
		
		System.out.println(Arrays.toString(Diferencia.diferencia(arreglo)));
		
	}

}
