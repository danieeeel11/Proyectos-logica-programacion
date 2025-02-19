package EjemploStreamCollectorCadena;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import EjemploStream.Persona;

public class main {

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
		
		String nombresAdultos = listaPersonas.stream().filter(p->p.getEdad()>=18).map(p->p.getNombre()).collect(Collectors.joining(",", "Nombre Personas ", " ..."));
		System.out.println(nombresAdultos);
	}
}
