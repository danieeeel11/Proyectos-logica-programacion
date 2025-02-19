package Map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class EjTreeMap {
	
	private Map<Integer, String> treeMap;
	
	public EjTreeMap() {
		this.treeMap=new TreeMap<Integer,String>();
	}
	
	public void ingresarDatos() {
		treeMap.put(3,"Isabella Alzate");
		treeMap.put(4,"Laura Ojeda");
		treeMap.put(2,"Ivan Rodriguez");
		treeMap.put(5,"Alejandro Caro");
		treeMap.put(1,"Sebastian Vasquez");
		treeMap.put(6,"Ricardo Quintero");
		treeMap.put(5,"Pablo Quijano");
	}
	
	public void anexarSiNoExiste() {
		treeMap.putIfAbsent(5, "Pablo Prieto");
	}
	
	public void imprimir() {
		imprimir1();
		imprimir2();
		imprimir3();
		imprimir4();
	}
	
	public void imprimir1() {
		System.out.println("\nImpresion 1");
		Iterator<Integer> it = treeMap.keySet().iterator();
		it=treeMap.keySet().iterator();
		System.out.println("Clave \t Valor");
		while(it.hasNext()) {
			Integer key = it.next();
			System.out.println(" " + key + " \t " + treeMap.get(key));
		}
	}
	public void imprimir2() {
		System.out.println("\nImpresion 2");
		for (Entry<Integer, String> e : treeMap.entrySet()) {
			System.out.println("Llave: " + e.getKey() + " Valor: " + e.getValue());
		}
	}
	public void imprimir3() {
		System.out.println("\nImpresion 3");
		System.out.println("Llave\tValor");
		treeMap.forEach((k,v)->System.out.println(" " + k+ " "+ v));
	}
	public void imprimir4() {
		System.out.println("\nImpresion 4");
		treeMap.entrySet().stream().forEach(System.out::println);
	}
	
	public void buscar() {
		System.out.println();
		String valor = treeMap.getOrDefault(3, "No se encontro");
		System.out.println(valor);
	}
	
	public static void main(String[] args) {
		EjTreeMap ejTM = new EjTreeMap();
		ejTM.ingresarDatos();
		ejTM.anexarSiNoExiste();
		ejTM.imprimir();
		ejTM.buscar();
	}

}
