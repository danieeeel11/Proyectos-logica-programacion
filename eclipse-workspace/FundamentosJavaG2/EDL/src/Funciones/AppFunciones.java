package Funciones;

import java.util.Arrays;

public class AppFunciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(funciones.suma1(2000, 1256));
		
		System.out.println(funciones.potencia(20, 4));
		
		int[] array = {10,20,30,40,50};
		if(funciones.buscarDato(array, 30)){
			System.out.println("El numero existe");
		}else {
			System.out.println("El numero no existe");
		}
		
		int[] arrayB = {10,20,30,40,50};
		//int[] arrayC = funciones.sumaArray(array, arrayB);
		System.out.println(Arrays.toString(funciones.sumaArray(array, arrayB)));
	}

}
