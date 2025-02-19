package EjemploStreamOtrasColecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/*
 * Programa principal donde se aplican streams sobre arrays y mapas
 */
public class Main {

	public static void main(String[] args) {
		Persona[] arrayPersonas = new Persona[7];
		arrayPersonas[0] =new Persona("Sebastian", 42);
		arrayPersonas[1] =new Persona("Laura", 20);
		arrayPersonas[2] =new Persona("Margarita", 7);
		arrayPersonas[3] =new Persona("Luis", 4);
		arrayPersonas[4] =new Persona("Veronica", 27);
		arrayPersonas[5] =new Persona("Valery", 27);
		arrayPersonas[6] =new Persona("Jennifer", 21);
		
		Persona[] adultos = Arrays.stream(arrayPersonas).filter(p->p.getEdad()>=18).toArray(tam->new Persona[tam]);
		System.out.println("Personas mayores de edad en el array");
		for (Persona persona : adultos) {
			System.out.println(persona);
		}
		procesarMapPersonas();

	}
	private static void procesarMapPersonas() {
		Map<String, Persona> mapaPersonas = new HashMap();
		mapaPersonas.put("111A", new Persona ("Pedro",17));
		mapaPersonas.put("222B", new Persona ("Diana",19));
		mapaPersonas.put("333C", new Persona ("Laura",17));
		mapaPersonas.put("444D", new Persona ("Victoria",22));
		mapaPersonas.put("777F", new Persona ("Valentina",17));
		mapaPersonas.put("654G", new Persona ("Valery",23));
		
		List<Persona> adultosMapa = mapaPersonas.values().stream().filter(p->p.getEdad()>=18).collect(Collectors.toList());
		System.out.println("\nPersonas adultas en el mapa");
		for (Persona persona : adultosMapa) {
			System.out.println(persona);
		}
		
		List<String> codigoPersona = mapaPersonas.entrySet().stream().filter(p->p.getValue().getEdad()>=18).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println("\nLos codigos de las personas mayores de edad");
		for (String string : codigoPersona) {
			System.out.println(string);
		}
	}

}
