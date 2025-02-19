package Map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class EjLinkedHashMap {
	private Map<Integer, String> linkedHashMap;
	
	public EjLinkedHashMap() {
		this.linkedHashMap=new TreeMap<Integer,String>();
	}
	
	public void ingresarDatos() {
		linkedHashMap.put(4,"Juan Rios");
		linkedHashMap.put(2,"Paula Jimenez");
		linkedHashMap.put(1,"Marlon Diaz");
		linkedHashMap.put(3,"Maria ALvarez");
		linkedHashMap.put(3,"Daniela Romero");
	}
	
	public void imprimir() {
		imprimir1();
		imprimir2();
		imprimir3();
	}
	
	public void imprimir1() {
		System.out.println("\nImpresion 1");
		Iterator<Integer> it = linkedHashMap.keySet().iterator();
		it=linkedHashMap.keySet().iterator();
		System.out.println("Clave \t Valor");
		while(it.hasNext()) {
			Integer key = it.next();
			System.out.println(" " + key + " \t " + linkedHashMap.get(key));
		}
	}
	public void imprimir2() {
		System.out.println("\nImpresion 3");
		System.out.println("Llave\tValor");
		linkedHashMap.forEach((k,v)->System.out.println(" " + k+ " "+ v));
	}
	public void imprimir3() {
		System.out.println("\nImpresion 4");
		linkedHashMap.entrySet().stream().forEach(System.out::println);
	}
	public static void main(String[] args) {
		EjLinkedHashMap ejLHM = new EjLinkedHashMap();
		ejLHM.ingresarDatos();
		ejLHM.imprimir();
	}

}
