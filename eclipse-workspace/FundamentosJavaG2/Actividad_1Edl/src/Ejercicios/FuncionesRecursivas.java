package Ejercicios;

public class FuncionesRecursivas {
	public static String cadena = "0 1 2 3 4 5 6 7 8 9 A B C D E F";
	public static String[] conversionCadena = cadena.split(" ");
	
	/**
	 * Ejercicio 1
	 * Funcion recursiva que permite sumar los elementos de dos arreglos
	 * @param l1 arreglo de enteros 1
	 * @param l2 arreglo de enteros 2
	 * @param i indice del elemento donde se inicia la suma debe ser 0
	 * @return un entero con la suma de los dos arreglos
	 */
	public static int fSumaArray(int[] l1, int[] l2, int i) {
		if(i > l1.length) {
			return 0;
		}else {
			return l1[i]+l2[i] + fSumaArray(l1,l2,i+1);
		}
	}
	
	/**
	 * Funcion recursiva que convierte un numero entero positivo a cualquier base 2,8,16
	 * @param numero numero entero a convertir
	 * @param base numero entero que identifica la base
	 * @return una cadena de caracteres con el numero convertido a la base pasada como parametro
	 */
	public static String convertirEntero(int numero, int base) {
		if(numero < base) {
			return conversionCadena[numero];
		}else
			return convertirEntero((numero/base),base) + conversionCadena[numero % base];
	}
	
	/**
	 * Funcion recursiva que compara elemento por elemento dos arreglos de numeros enteros
	 * @param l1 arreglos de enteros 1
	 * @param l2 arreglo de enteros 2
	 * @param i indice del primer elemento desde donde inicia la comparacion por default deb ser 0
	 * @return true si los elementos son iguales o false si no son iguales
	 */
	public static boolean arrayIguales(int[] l1, int[] l2, int i) {
		if(i == l1.length) {
			return true;
		}else if(l1[i] != l2[i]) {
			return false;
		}else {
			return arrayIguales(l1,l2,i+1);
		}
	}
	/**
	 * Funcion recursiva que toma dos arreglos de numeros enteros y suma los elementos de arreglos 1 y del arreglos 2 y 
	 * guarda el resultado en un tercer arreglo
	 * @param l1 arreglo 1 de numeros enteros
	 * @param l2 arreglo 2 de numeros enteros
	 * @param i indice del primer elemento desde donde inicia la sumatoria por default debe ser 0
	 * @param l3 arreglo con la sumatoria de los elementos del arreglo 1 y arreglo 2
	 * @return l3 el refalo con la sumatoria
	 */
	public static int[] sumaArray(int[] l1, int[] l2, int i, int[] l3) {
		if(i > l1.length-1) {
			return l3;
		}else {
			l3[i] = l1[i] + l2[i];
			return sumaArray(l1,l2,i+1,l3);
		}
	}
}
