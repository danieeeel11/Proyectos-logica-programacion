package EjemploStream;

import java.util.ArrayList;
import java.util.List;

public class EjemploStream {
	private List<String> lista;
	
	public EjemploStream() {
		this.lista = new ArrayList<>();
	}
	
	public void llenarLista() {
		lista.add("Ciencias");
		lista.add("Inteligencia");
		lista.add("Artificial");
		lista.add("Computacion");
	}
	
	public void filtrar() {
		lista.stream().filter(c -> c.startsWith("C")).forEach(System.out::println);
	}
	
	public void ordenar() {
		lista.stream().sorted((a,b)->a.compareTo(b)).forEach(System.out::println);
	}
	
	public void aplicarMap() {
		lista.stream().map(String::toUpperCase).forEach(System.out::println);
	}
	
	public void limitarSalida() {
		lista.stream().limit(2).forEach(System.out::println);
	}
	
	public void contarElementos() {
		long cantidad = lista.stream().count();
		System.out.println("Cantidad: " + cantidad);
	}
}

