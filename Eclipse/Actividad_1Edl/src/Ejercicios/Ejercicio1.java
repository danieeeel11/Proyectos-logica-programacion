package Ejercicios;

import java.util.Arrays;

public class Ejercicio1 {

	public static void main(String[] args) {
		int[] l1 = {1,2,3,4,5,6};
		int[] l2 = {1,2,3,4,5,6};
		System.out.println(Arrays.toString(l1));
		System.out.println(Arrays.toString(l2));
		System.out.println(FuncionesRecursivas.fSumaArray(l1,l2,0));
	}

}
