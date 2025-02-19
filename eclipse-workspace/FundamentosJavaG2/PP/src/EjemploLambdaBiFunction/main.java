package EjemploLambdaBiFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

import EjemploLambdaConsumer.Persona;

public class main {

	public static void main(String[] args) {
		List<Persona> listaPersonas = new ArrayList<>(); 
		listaPersonas.add(new Persona("Pedro", 27));
		listaPersonas.add(new Persona("Diego", 29));
		listaPersonas.add(new Persona("Mario", 17));
		listaPersonas.add(new Persona("Laura", 21));
		listaPersonas.add(new Persona("Mayuri", 22));
		//BiFunction filtra las personas mayores de edad
		BiFunction<List<Persona>, Integer, List<Persona>> obtenerEdad = (lista,edad)->{
			List<Persona> resultado = new ArrayList<>();
			for (Persona persona : listaPersonas) {
				if(persona.getEdad() >= 18) {
					resultado.add(persona);
				}
			}
			return resultado;
		};
		
		Integer edad = 18;
		List<Persona> mayorEdad = obtenerEdad.apply(listaPersonas, edad);
		for (Persona persona : mayorEdad) {
			System.out.println(persona);
		}
		
		//Function para mostrar personas speradass por comas
		Function<List<Persona>,String> listaAString = lista ->{
			String respuesta = "";
			for (int i = 0; i < lista.size(); i++) {
				if(i < lista.size()-1) {
					respuesta += lista.get(i).getNombre() + ", ";
				}else {
					respuesta += lista.get(i).getNombre();
				}
			}
			return respuesta;
		};
		System.out.println();
		System.out.println(listaAString.apply(listaPersonas));
		System.out.println();
		
		//Combinacion de BiFunction - Function
		BiFunction<List<Persona>, Integer, String> nombreAdultos = obtenerEdad.andThen(listaAString);
		System.out.println("Personas mayores de edad");
		System.out.println(nombreAdultos.apply(listaPersonas, edad));
		
		
		
	}

}
