package LabClasesGenericasII;
/**
 * Clase de tipo generico que contiene 
 * el metodo encargado de comparar dos 
 * datos y determinar cual es mayor
 * @author Daniel Felipe Velásquez Rincón
 * @version 1
 * @date 11-02-2021
 */
public class Operacion {
	public static <T extends Comparable <T>> T obtenerMayor (T a, T b) {
		T result = b;
		if (a.compareTo(b) >0) {
			result = a;
		}
		return result;
	}
}
