package Ej4;

public class Funcion {
	public static void buscarDato(int[] array, int dato) {
		int[] arrayP = new int[array.length];
		//int x = array.length - 1;
		int a = 1;
		for(int i=1; i<array.length; i++) {
			if(array[i] == dato) {
				arrayP[a] = i;
				a=a+1;
			}
		}
		
		System.out.println("Arreglo original");
		for(int i=1; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println(" ");
		System.out.println("Arreglo resultante");
		for(int i=1; i<arrayP.length; i++) {
			System.out.print(arrayP[i] + " ");
		}
		
	}
}
