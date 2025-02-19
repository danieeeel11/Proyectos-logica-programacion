package ArrayObjetos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * Programa principal para precargar los datos de tipo
 * String del nombre de una persona y asignarlos a un arreglo.
 * Además, de precargar los datos de tipo entero de numeros enteros
 * y asignarlos a un arreglo. Esto usando el concepto de arrayList.
 * @author Daniel Felipe Velásquez Rincón
 * @version 1
 * @date 16-02-2021
 */
public class EjemploArrayList {

	public static void main(String[] args) {
		List <String> lista = new ArrayList<String>();
		
		lista.add("Valentina");
		lista.add("Pedro");
		lista.add("Sebastian");
		lista.add("Santiago");
		lista.add("Laura");
		
		System.out.println("Primera Impresion");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println();
		System.out.println("Segunda Impresion");
		
		for (String str : lista) {
			System.out.println(str);
		}
		
		System.out.println();
		System.out.println("Tercera Impresion");
		
		Iterator<String> it = lista.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//Segundo Ejemplo
		List <Integer> lista1 = new ArrayList<Integer>();
		lista1.add(10);
		lista1.add(12);
		lista1.add(15);
		lista1.add(20);
		lista1.add(30);
		
		System.out.println();
		System.out.println("Impresion enteros");
		for (Integer in : lista1) {
			System.out.println(in);
		}
	}

}
