package EjemploLambda2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
/**
 * Programa principal que ordena un listado de personas en base a distintos
 * criterios, empleando la clase ComparadorPersona, una clase anonima, y también
 * expresiones lambda. Incluso se combinan expresiones lambda para hacer comparaciones compuestas
 */
public class main {

	public static void main(String[] args) {
		List<Persona> listaPersona = new ArrayList<Persona>();
		
		listaPersona.add(new Persona("Maria", 20));
		listaPersona.add(new Persona("Martha", 19));
		listaPersona.add(new Persona("Sergio", 17));
		listaPersona.add(new Persona("Manuel", 18));
		listaPersona.add(new Persona("Laura", 20));
		
		//Ordenar de menor a mayor edad, utilizando una clase tradicional
		ComparadorPersonas cp = new ComparadorPersonas();
		listaPersona.sort(cp);
		System.out.println("Personas ordenadas de menor a mayor por la edad");
		for (Persona persona : listaPersona) {
			System.out.println(persona);
		}
		
		//Ordenar de mayor a menor edad, utilizando una clase anonima
		listaPersona.sort(new Comparator <Persona>() {
			@Override
			public int compare(Persona o1, Persona o2) {
				return o2.getEdad()-o1.getEdad();
			}
		});
		System.out.println("\n Personas ordenadas de mayor a menor por la edad");
		for (Persona persona : listaPersona) {
			System.out.println(persona);
		}
		
		//Ordenar por nombre de menor a mayor utilizando una expresion lambda
		listaPersona.sort((o1,o2) -> o1.getNombre().compareTo(o2.getNombre()));
		System.out.println("\n Personas ordenadas por el nombre");
		for (Persona persona : listaPersona) {
			System.out.println(persona);
		}
		
		//Ordenar por edad ascendente, y en caso de igualdad, por nombre
		Comparator<Persona> cEdad = (per1,per2) -> per1.getEdad() - per2.getEdad();
		Comparator<Persona> cNombre = (per1,per2) -> per1.getNombre().compareTo(per2.getNombre());
		listaPersona.sort(cEdad.thenComparing(cNombre));
		System.out.println("\n Personas ordenadas por edad y luego por nombre");
		for (Persona persona : listaPersona) {
			System.out.println(persona);
		}
	}
}
