package Ejercicio1y3;
import java.util.Arrays;
/**
 * Clase principal que contiene el main del ejercicio3, contiene dos arrays de enteros, y llama metodos
 * para determinar si sus elementos son iguales
 * @author Laura Sofia Ojeda Leon & Daniel Felipe Velasquez Rincon
 * @version 1
 * @since 11-02-2020
 *
 */
public class AppEjercicio3 {
	public static void main(String[] args) {
		int v1[] = {8,7,6,2,4};
		int v2[] = {2,9,4,7,6};
		System.out.print("Array 1: ");
		Funciones.imprimir(v1, 0);
		System.out.print("Array 2: ");
		Funciones.imprimir(v2, 0);
 		Arrays.sort(v1);
		Arrays.sort(v2);
		System.out.println();
		System.out.println("Funcion recursiva: ");
		Funciones.igualdadArraysRecursiva(v1, v2, 0);
		System.out.println("Funcion iterativa: ");
		Funciones.igualdadArraysIterativa(v1, v2);
	}

}
