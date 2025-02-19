/**
 * Clase que implementa diferentes funciones
 * @author Daniel Velasquez
 * @since 2021-1-27
 */
package Funciones;

public class funciones {
	
	// Forma menos eficiente
	/** 
	public int suma(int numero1, int numero2) {
		int resultado;
		resultado = numero1 + numero2;
		
		return resultado;
	}
	**/
	
	
	/**
	 * Funcion suma de dos numeros enteros
	 * Forma mas eficiente, el static permite que se pueda acceder desde otro punto
	 * @param numero1 primer numero a sumar
	 * @param numero2 segundo numero a sumar
	 * @return el resultado de la suma
	 */
	public static int suma1(int numero1, int numero2) {
		return numero1 + numero2;
	}
	/**
	 * Double porque el proceso math.pow devuelve un dato tipo double
	 * @param base
	 * @param potencia
	 * @return
	 */
	/**
	public static double potencia(int base, int potencia) {
	
		return Math.pow(base, potencia);
	}
	**/
	
	/**
	 * Funcion para elevar un numero a una potencia
	 * @param base numero double
	 * @param potencia numero double
	 * @return un valor entero
	 */
	public static int potencia(double base, double potencia) {
		
		return (int) Math.pow(base, potencia);
	}
	/**
	 * Funcion busca un dato en un array
	 * @param array de enteros
	 * @param dato a buscar en el array
	 * @return true si el dato se encuentra en el array o false si no se encuentra
	 */
	public static boolean buscarDato(int[] array, int dato) {
		boolean estado = false;
		for(int i=0; i<array.length; i++) {
			if(array[i] == dato) {
				estado = true;
				break;
			}
		}
		return estado;
	}
	/**
	 * Funcion para sumar dos arreglos a y b
	 * @param arrayA
	 * @param arrayB
	 * @return
	 */
	public static int[] sumaArray(int[] arrayA, int[] arrayB) {
		int[] arrayC = new int[arrayA.length];
		
		for(int i=0; i<arrayA.length ; i++) {
			arrayC[i] = arrayA[i]+arrayB[i];
		}
		return arrayC;
	}
}
