package arrays;

import java.util.Scanner;

public class Bidimensionales {
	
	public static int[][] array =new int [3][3];
	public static int[][] edades;
	public static Scanner leerDato =new Scanner(System.in); 

	public static void main(String[] args) {
		//int dato =10;
		for(int i=0; i < array.length; i++) {
			for(int j=0; j < array.length; j++) {
				System.out.println("Entrar un dato de tipo entero");
				array[i][j]=leerDato.nextInt();
				
			}
		}
		
		for(int i=0; i < array.length; i++) {
			for(int j=0; j < array.length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}

	}

}
