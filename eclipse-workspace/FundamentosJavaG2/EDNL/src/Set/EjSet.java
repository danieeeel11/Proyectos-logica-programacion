package Set;

import java.util.HashSet;
import java.util.Set;

public class EjSet {
	public void realizarEjemplo() {
		Set<Integer> listNum;
		listNum = new HashSet<>();
		//agregar elementos
		listNum.add(1);
		listNum.add(2);
		listNum.add(1);
		listNum.add(3);
		listNum.add(4);
		listNum.add(2);
		listNum.add(1);
		listNum.add(3);
		listNum.add(4);
		//Impresion
		System.out.println(listNum);
		
		HashSet<String> listNombre = new HashSet<>();
		listNombre.add("Santiago");
		listNombre.add("Ivan");
		listNombre.add("Juan");
		listNombre.add("Miguel");
		listNombre.add("Lina");
		listNombre.add("Laura");
		listNombre.add("Sofia");
		listNombre.add("Ivan");
		listNombre.add("Juan");
		listNombre.add("Miguel");
		listNombre.add("Lina");
		listNombre.add("Laura");
		listNombre.add("Sofia");
		for (String str : listNombre) {
			System.out.println(str);
		}
		
		
	}
	public static void main(String[] args) {
		EjSet ej = new EjSet();
		ej.realizarEjemplo();
	}
}
