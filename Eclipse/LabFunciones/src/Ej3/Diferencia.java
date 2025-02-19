package Ej3;

public class Diferencia {
	public static int[] diferencia(int[] array) {
		int[] nuevo = new int [array.length-1];
		for(int i=0 ; i<array.length-1 ; i++) {
			nuevo[i] = (array[i] - array[i+1]);
		}
		return nuevo;
	}
}
