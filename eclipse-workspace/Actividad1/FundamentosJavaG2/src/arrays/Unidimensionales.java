package arrays;

import java.util.Scanner;

public class Unidimensionales {
	
	public static double [] notas =new double [25];
	public static int [] array;
	public static Scanner leerDato =new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Entre el numero de elementos del array" );
		int elementos = leerDato.nextInt();
		array = new int [elementos];
		
		for(int i=0; i < array.length ; i++) {
			System.out.print("Entrar un dato entero ");
			array[i] = leerDato.nextInt();
		}
		
		for(int i=0; i < array.length ; i++) {
			System.out.println(array[i]);
		}
		
		int dato;
		System.out.println();
		dato= leerDato.nextInt();
		
		for (int i = 0; i < array.length; i++) {
			if(array[i]==dato){
				System.out.println("Dato encontrado");
			} else {
				System.out.println("Dato encontrado");
			}
		
		
	}

}
}
