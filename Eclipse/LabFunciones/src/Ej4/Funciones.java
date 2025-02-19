package Ej4;

public class Funciones {
	public static int[] buscaCrear(int[] array, int dato) {
		int[] nuevo = new int [array.length];
		int j = 0;
		for(int i=0 ; i<array.length ; i++) {
			if(array[i] == dato) {
				nuevo[j] = (i+1);
				j++;
			}
		}
		return nuevo;
	}
}
