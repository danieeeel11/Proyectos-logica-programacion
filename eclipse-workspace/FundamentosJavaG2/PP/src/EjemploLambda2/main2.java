package EjemploLambda2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
/**
 * Programa principal para probar distintos tipos de predicados a la hora de filtrar
 * personas de un listado
 */
public class main2 {
	public static void main(String[] args) {
		List<Persona> listaPersonas = new ArrayList<Persona>();
		
		listaPersonas.add(new Persona("Maria", 20));
		listaPersonas.add(new Persona("Martha", 19));
		listaPersonas.add(new Persona("Magda", 17));
		listaPersonas.add(new Persona("Pedro", 16));
		listaPersonas.add(new Persona("Manuel", 18));
		listaPersonas.add(new Persona("Laura", 20));
		
		Predicate<Persona> pAdultos = p -> p.getEdad() >= 18;
		Predicate<Persona> pNombreM = p -> p.getNombre().startsWith("M");
		//List<Persona> adultos = filtrar(listaPersonas,pAdultos);
		List<Persona> adultos = filtrar(listaPersonas,pAdultos.and(pNombreM));
		System.out.println("Listado de personas adultas cuyo nombre empieza por  M:");
		for (Persona persona : adultos) {
			System.out.println(persona);
		}
	}

	private static List<Persona> filtrar(List<Persona> listaPersonas, Predicate<Persona> pAdultos) {
		List<Persona> resultado = new ArrayList<Persona>();
		for (Persona persona : listaPersonas) {
			if (pAdultos.test(persona)) {
				resultado.add(persona);
			}
		}
		return resultado;
	}
}
