package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class EjArrayList1 {
	private String[] pandemias;
	private ArrayList<String> lista;
	
	public EjArrayList1() {
		this.pandemias = new String[] {"La peste negra", "Gripe española", "La gripe de Honk Kong"
				, "Ebola", "VIH", "SARS"};
		this.lista = new ArrayList<String>();
	}
	public void copiarDatos() {
		for (int i = 0; i < pandemias.length; i++) {
			lista.add(pandemias[i]);
		}
	}
	public void imprimirLista1() {
		System.out.println("\nPrimera impresion");
		for (String str : lista) {
			System.out.println(str);
		}
	}
	public void imprimirLista2() {
		System.out.println("\nSegunda impresion");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}
	public void imprimirLista3() {
		System.out.println("\nTercera impresion");
		Iterator<String> it = lista.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	public void imprimirLista4() {
		System.out.println("\nCuarta impresion");
		lista.forEach(System.out::println);
	}
	public void convertirMayusculas1() {
		System.out.println("\nQuinta impresion");
		for (int i = 0; i < lista.size(); i++) {
			lista.set(i, lista.get(i).toUpperCase());
		}
		for (String cadena : lista) {
			System.out.println(cadena);
		}
	}
	public void convertirMayusculas2() {
		System.out.println("\nSexta impresion");
		lista.replaceAll(String::toUpperCase);
		lista.forEach(System.out::println);
	}
	public void procesarInformacion() {
		copiarDatos();
		imprimirLista1();
		imprimirLista2();
		imprimirLista3();
		imprimirLista4();
		convertirMayusculas1();
		convertirMayusculas2();
	}
	public static void main(String[] args) {
		EjArrayList1 lst = new EjArrayList1();
		lst.procesarInformacion();
	}
}
