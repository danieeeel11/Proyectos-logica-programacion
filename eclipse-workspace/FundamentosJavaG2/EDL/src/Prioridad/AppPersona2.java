package Prioridad;

import java.util.ArrayList;
import java.util.Comparator;

public class AppPersona2 {
	private static ArrayList<Persona2> listaPersona;
	public static void main(String[] args) {
		listaPersona = new ArrayList<Persona2>();
		
		listaPersona.add(new Persona2("juanita","Perez",25));
		listaPersona.add(new Persona2("Pachito","Rodriguez",35));
		listaPersona.add(new Persona2("Albita","Mora",23));
		listaPersona.add(new Persona2("Rosita","Agudelo",45));
		listaPersona.add(new Persona2("rosita","Alba",30));
		listaPersona.add(new Persona2("PEDRO","14",35));
		listaPersona.add(new Persona2("rodrigo","14",30));
		
		System.out.println("Lista original");
		mostrar();
		System.out.println("\nLista ordenada por el nombre");
		listaPersona.sort(Comparator.comparing(Persona2::getNombre));
		mostrar();
		System.out.println("\nLista ordenada por la edad");
		listaPersona.sort(Comparator.comparingInt(Persona2::getEdad));
		mostrar();
		System.out.println("\nLista ordenada por la edad y luego por el nombre");
		listaPersona.sort(Comparator.comparingInt(Persona2::getEdad).thenComparing(p->p.getNombre()));
		mostrar();
		System.out.println("\nLista ordenada por el nombre de forma descendente");
		listaPersona.sort(Comparator.comparing(Persona2::getNombre).reversed());
		mostrar();
		
		Comparator<Persona2> comparadorMultiple = Comparator.comparing(Persona2::getNombre)
				.thenComparing(Comparator.comparing(Persona2::getApellidos))
				.thenComparing(Comparator.comparing(Persona2::getEdad));
		//listaPersona.stream().sorted(comparadorMultiple).forEach(System.out::println);
	}
	public static void mostrar() {
		listaPersona.forEach(System.out::println);
	}

}
