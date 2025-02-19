package Collections;

import java.util.ArrayList;
import java.util.List;

public class EjArrayList {

	public static void main(String[] args) {
		List<Integer> lista;
		lista = new ArrayList<>();
		//Agregar datos
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		lista.add(6);
		lista.add(7);
		lista.add(8);
		//System.out.println(lista);
		//Salida de datos
		/*for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}*/
		for (Integer ist : lista) {
			System.out.println(ist);
		}
		System.out.println("Borrar");
		//Remover datos
		lista.remove(3);
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		System.out.println("Actualizar");
		//Actualizar datos
		lista.set(1, 45);
		for (Integer ist : lista) {
			System.out.println(ist);
		}
		
		System.out.println();
		ArrayList<String> listNombre = new ArrayList<>();
		listNombre.add("Santiago");
		listNombre.add("Mario");
		listNombre.add("Laura");
		System.out.println(listNombre);
	}

}
