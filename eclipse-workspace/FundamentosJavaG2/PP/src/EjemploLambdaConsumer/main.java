package EjemploLambdaConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class main {
	public static void main(String[] args) {
		List<Persona> listaPersonas = new ArrayList<>(); 
		listaPersonas.add(new Persona("Pedro", 27));
		listaPersonas.add(new Persona("Diego", 29));
		listaPersonas.add(new Persona("Mario", 17));
		listaPersonas.add(new Persona("Laura", 21));
		listaPersonas.add(new Persona("Mayuri", 22));
		/*
		Consumer<Persona> imprimir = p -> System.out.println(p);
		for (Persona persona : listaPersonas) {
			imprimir.accept(persona);
		}
		*/
		Consumer<Persona> imprimir = System.out::println;
		procesarPersona(listaPersonas, imprimir);
	}

	private static void procesarPersona(List<Persona> listaPersonas, Consumer<Persona> imprimir) {
		for (Persona persona : listaPersonas) {
			imprimir.accept(persona);
		}
		
	}

}
