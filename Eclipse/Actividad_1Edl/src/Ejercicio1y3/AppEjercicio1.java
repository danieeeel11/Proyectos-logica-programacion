package Ejercicio1y3;
/**
 * Clase principal que contiene el main del ejercicio1, contiene dos arrays de enteros, y llama metodos
 * para calcular el producto y la suma de los dos arrays
 * @author Laura Sofia Ojeda Leon & Daniel Felipe Velasquez Rincon
 * @version 2
 * @since 11-02-2020
 *
 */
public class AppEjercicio1 {
	
	public static void main(String[] args) {
		int v1 [] = {200,100,500,400,400,150};
		int v2 [] = {1,0,0,2,1,0};
		
		System.out.print("Array 1: ");
		Funciones.imprimir(v1, 0);
		System.out.print("Array 2: ");
		Funciones.imprimir(v2, 0);
		System.out.println();
		System.out.print("Producto posicion por posicion de los datos de dos arreglos: ");
		Funciones.productoArray(v1, v2, 0);
		System.out.println("Producto de los datos posicion por posicion y la suma del total es de: " 
				+ Funciones.productoArrays(v1, v2, 5));
		System.out.println("Suma total de los datos de los dos arreglos es de: " + Funciones.sumaArrays(v1, v2, 0));
		
	}

}
