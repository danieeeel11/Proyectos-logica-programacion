package EjemploLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class EjemploLambda3 {
	private List <String> lista;
	
	public EjemploLambda3() {
		this.lista = new ArrayList<String>();
	}
	
	public void llenarLista() {
		lista.add("Computacion");
		lista.add("Ciencias");
		lista.add("Inteligencia");
		lista.add("Artificial");
	}
	//---------Clase anonima----------------
	public void ordenar() {
		llenarLista();
		System.out.println("Ordenamiento con porgramacion imperativa");
		Collections.sort(lista, new Comparator<String>(){
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		for (String dato : lista) {
			System.out.println(dato);
		}
	}
	//---------Expresiones Lambda----------------
	public void ordenar2() {
		//llenarLista();
		System.out.println();
		System.out.println("Ordenamiento con expresiones lambda programacion funcional");
		Collections.sort(lista, (String d1, String d2) -> d1.compareTo(d2));
		for (String dato : lista) {
			System.out.println(dato);
		}
	}
	
	public static void main(String[] args) {
		EjemploLambda3 el = new EjemploLambda3();
		el.ordenar();
		el.ordenar2();

	}

}
