package Ejercicio1y3;
/**
 * Clase que contiene funciones recursivas e iterativas
 * @author Laura Sofia Ojeda Leon & Daniel Felipe Velasquez Rincon
 * @version 2
 * @since 10-02-2020
 */
public class Funciones {
	/**
	 * Funcion recursiva para imprimir los datos de un arreglo
	 * @param array arreglo de datos
	 * @param pos posicion desde la cual se imprime el array
	 */
	public static void imprimir(int[] array, int pos) {
		if(pos == array.length-1) {//caso base
			System.out.println(array[pos]);
		}else {
			System.out.print(array[pos]);
			System.out.print(", ");
			imprimir(array,pos + 1);
		}
	}
	/**
	 * Funcion recursiva para calcular el producto de los datos de dos arreglos
	 * @param v1 primer array de enteros
	 * @param v2 segundo array de enteros
	 * @param pos posicion desde la cual se inicia el conteo
	 * @return el producto de dos arrays con enteros
	 */
	public static int productoArrays(int [] v1, int [] v2, int pos) {
		if(pos == 0) {
			return v1[pos];
		}else {
			return v1[pos] * v2[pos] + productoArrays(v1, v2, pos-1); 
		} 
	}
	/**
	 * Funcion recursiva para calcular el producto posicion por posicion de dos arreglos
	 * @param v1 primer array de enteros
	 * @param v2 segundo array de enteros
	 * @param pos posicion desde la cual se inicia el conteo
	 */
	public static void productoArray(int [] v1, int [] v2, int pos) {
		if(pos == v1.length-1) {
			System.out.println(v1[pos] * v2[pos]);
		}else {
			System.out.print(v1[pos] * v2[pos]); 
			System.out.print(", ");
			productoArray(v1, v2, pos+1); 
		} 
	}
	
	/**
	 * Funcion recursiva para calcular la suma de los datos de dos arreglos
	 * @param v1 primer array de enteros
	 * @param v2 segundo array de enteros
	 * @param pos posicion desde la cual se inicia el conteo
	 * @return la suma de los datos de dos arrays
	 */
	public static int sumaArrays(int [] v1, int [] v2, int pos) {
		if(pos == v1.length-1) {
			return v1[pos];
		}else {
			return v1[pos] + v2[pos] + sumaArrays(v1, v2, pos+1 ); 
		}
	}
	
	/**
	 * Funcion recursiva para determinar si los elementos de dos arreglos son iguales
	 * @param v1 primer array de enteros
	 * @param v2 segundo array de enteros
	 * @param pos posicion desde la cual se inicia el conteo
	 */
	
	public static void igualdadArraysRecursiva(int [] v1, int [] v2, int pos) {
		if(v1[pos] == v2[pos]) {
			System.out.print(v1[pos] + " = " + v2[pos] + ": ");
			System.out.println(true);
		}else {
			System.out.print(v1[pos] + " = " + v2[pos] + ": ");
			System.out.println(false);
		}
		if(pos == v1.length-1) {
			System.out.println();
		}
		else {
			igualdadArraysRecursiva(v1,v2,pos+1);
		}
	}
	
	/**
	 * Funcion iterativa para determinar si los elementos de dos arreglos son iguales
	 * @param v1 primer array de enteros
	 * @param v2 segundo array de enteros
	 */
	public static void igualdadArraysIterativa(int [] v1, int [] v2) {
		for (int i = 0; i < v1.length; i++) {
			if(v1[i] == v2[i]) {
				System.out.print(v1[i] + " = " + v2[i] + ": ");
				System.out.println(true);
			}else {
				System.out.print(v1[i] + " = " + v2[i] + ": ");
				System.out.println(false);
			}
		}
	}
}
