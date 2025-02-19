package EjemploStream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Persona> listaPersonas = new ArrayList<>();
		listaPersonas.add(new Persona("Isabel", 7));
		listaPersonas.add(new Persona("Laura", 4));
		listaPersonas.add(new Persona("Alirio", 41));
		listaPersonas.add(new Persona("Ricardo", 41));
		listaPersonas.add(new Persona("Pedro", 27));
		listaPersonas.add(new Persona("Juan", 29));
		listaPersonas.add(new Persona("Mario", 17));
		listaPersonas.add(new Persona("Laura", 21));
		listaPersonas.add(new Persona("Veronica",22));
		/*
		System.out.println("Personas mayores de edad y cuyos nombres inician en V");
		listaPersonas.stream().filter(p->p.getEdad()>=18 && p.getNombre().startsWith("V")).forEach(System.out::println);
		
		System.out.println("Personas ordenadas de mayor a menor edad y de menor a mayor nombre");
		Comparator<Persona> cEdad = (p1,p2)->Integer.compare(p2.getEdad(),p1.getEdad());
		Comparator<Persona> cNombre = (p1,p2)->p1.getNombre().compareTo(p2.getNombre());
		listaPersonas.stream().sorted(cEdad.thenComparing(cNombre)).forEach(System.out::println);
		
		System.out.println("Nombres de las personas");
		listaPersonas.stream().map(p->p.getNombre()).forEach(System.out::println);
		
		System.out.println("Construccion de la coleccion Persona a partir de strings: ");
		List<String> datosPersona = new ArrayList<>();
		datosPersona.add("Johanna:22");
		datosPersona.add("Tatiana:23");
		datosPersona.stream().map(s->new Persona (s.split(":") [0], Integer.parseInt(s.split(":") [1]))).forEach(System.out::println);
		*/
		System.out.println("Nombre de las tres primeras personas con mas edad");
		listaPersonas.stream().sorted((p1,p2)->Integer.compare(p2.getEdad(), p1.getEdad())).limit(3).map(p->p.getNombre()).forEach(System.out::println);
		
	}
}
