package EjArrayListRepaso;

import java.util.ArrayList;
import java.util.List;

public class EjArrayList {

	public static void main(String[] args) {
		/*List<String> lista = new ArrayList<String>();
		lista.add("Santiago");
		lista.add("Laura");
		lista.add("David");
		lista.add("Esteban");
		lista.add("Juan");
		
		for (String str : lista) {
			System.out.println(str);
		}
		System.out.println();
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		lista.remove(2);
		System.out.println("\n Despues de borrar");
		for (String str : lista) {
			System.out.println(str);
		}*/
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		
		for (Integer numero : lista) {
			System.out.println(numero);
		}
	}

}
