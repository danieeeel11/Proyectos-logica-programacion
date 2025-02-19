package Ej1;

import java.util.Scanner;

public class AppFunciones1 {
	public static int[] numero = new int[5];
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		for(int i=0; i<numero.length; i++) {
			System.out.println("Entrar un dato entero");
			numero[i] = teclado.nextInt();
			
		}
		
		//int[] dato = {10,98,-8,5,1};
		
		/**for(int i=0; i<numero.length; i++) {
			System.out.println(numero[i]);
		}
		**/
		System.out.println("Entrar el dato a buscar");
		int dato = teclado.nextInt();
		
		int a = Funciones1.buscarDato(numero, dato);
		if(a == -1) {
			System.out.println("Dato no existe");
		}else {
			System.out.println("Dato existe en el indice " + a);
		}
	}
}
