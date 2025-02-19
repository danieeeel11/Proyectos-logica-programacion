package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class EjHashMap {
	private Map<Integer, String> map;
	
	public EjHashMap() {
		this.map=new HashMap<Integer,String>();
	}
	
	public void ingresarDatos() {
		map.put(3,"Isabella Alzate");
		map.put(4,"Laura Ojeda");
		map.put(7,"Ivan Rodriguez");
		map.put(6,"Alejandro Caro");
		map.put(1,"Sebastian Vasquez");
	}
	
	public void anexarSiNoExiste() {
		map.putIfAbsent(5, "Ricardo Quintero");
	}
	
	public void imprimir() {
		imprimir1();
		imprimir2();
		imprimir3();
		imprimir4();
	}
	
	public void imprimir1() {
		System.out.println("\nImpresion 1");
		System.out.printf("Clave \t Valor \n");
		for (HashMap.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(" " + entry.getKey() + "\t" + entry.getValue());
		}
	}
	public void imprimir2() {
		System.out.println("\nImpresion 2");
		for (Entry<Integer, String> e : map.entrySet()) {
			System.out.println("Llave: " + e.getKey() + " Valor: " + e.getValue());
		}
	}
	public void imprimir3() {
		System.out.println("\nImpresion 3");
		System.out.println("Llave\tValor");
		map.forEach((k,v)->System.out.println(" " + k+ " "+ v));
	}
	public void imprimir4() {
		System.out.println("\nImpresion 4");
		map.entrySet().stream().forEach(System.out::println);
	}
	
	public void buscar() {
		Map<Integer, String> mapaFiltrado = map.entrySet().stream()
				.filter(e->e.getValue().contains("I"))
				.collect(Collectors.toMap(p->p.getKey(), p->p.getValue()));
		mapaFiltrado.forEach((k,v)->System.out.println("\nLlave: " + k+ " Valor: "+ v));
	}
	
	public static void main(String[] args) {
		EjHashMap ejHM = new EjHashMap();
		ejHM.ingresarDatos();
		ejHM.anexarSiNoExiste();
		ejHM.imprimir();
		ejHM.buscar();
	}
}
