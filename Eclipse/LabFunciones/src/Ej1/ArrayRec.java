package Ej1;

public class ArrayRec {
	/**
	 * 
	 * @param array
	 * @param dato
	 * @return
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
}
