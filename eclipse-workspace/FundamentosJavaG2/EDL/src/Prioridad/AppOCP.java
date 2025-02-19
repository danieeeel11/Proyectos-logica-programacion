package Prioridad;

import java.util.Queue;

public class AppOCP {

	public static void main(String[] args) {
		int datos[] = new int[20];
		System.out.println();
		for (int i = 0; i < datos.length; i++) {
			datos[i]= (int) (Math.random()*(50-5)+5);
		}
		
		System.out.println("Arreglos sin ordenar");
		for (int i = 0; i < datos.length; i++) {
			System.out.println(datos[i]);
		}
		
		Queue<Integer> c = OrdenarCp.ordenarR(datos, 0);
		
		System.out.println("Arreglos ordenado");
		while(!c.isEmpty()) {
			Integer i = c.remove();
			System.out.println(i);
		}
	}

}
