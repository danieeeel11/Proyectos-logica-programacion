package Ej1;
/**
 * Clase funciones
 * @author Daniel Felipe Velásquez Rincón
 *
 */
public class Funciones1 {
	/**
	 * La funcion recibe como parametro un array de enteros y un dato de tipo entero
	 * La funcion busca el dato en el array
	 * @param array arreglos de enteros enviado desde una clase externa
	 * @param dato el dato a buscar enviado desde una clase externa
	 * @return el indice en el array si el dato a buscar existe o -1 si el dato a buscar no existe
	 */
	public static int buscarDato(int[] array, int dato) {
		int index = -1;
		for(int i=0; i<array.length; i++) {
			if(array[i] == dato) {
				index = i;
				break;
			}
		}
		
		
		return index;
	}
	
	public int[] buscarEnArray(int[] array, int dato) {
		int[] arrayD = new int[array.length];
		
		
		return arrayD;
	}
}
