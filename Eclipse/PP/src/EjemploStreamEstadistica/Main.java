package EjemploStreamEstadistica;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

import EjemploStream.Persona;

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
		
		//Persona Mayor
		Optional<Persona> mayor = listaPersonas.stream().max((p1,p2)->Integer.compare(p1.getEdad(),p2.getEdad()));
		if(mayor.isPresent()) {
			System.out.println("La persona mayor es: " + mayor.get());
		}else {
			System.out.println("No se han encontrado personas que cumplan el requisito");
		}
		//Persona menor
		Optional<Persona> menor = listaPersonas.stream().min((p1,p2)->Integer.compare(p1.getEdad(),p2.getEdad()));
		if(menor.isPresent()) {
			System.out.println("La persona mayor es: " + menor.get());
		}else {
			System.out.println("No se han encontrado personas que cumplan el requisito");
		}
		//La media de las edades de las personas adultas
		OptionalDouble mediaEdadesAdultas = listaPersonas.stream().filter(p->p.getEdad()>=18).mapToInt(p->p.getEdad()).average();
		if (mediaEdadesAdultas.isPresent()) {
			System.out.println("La media de las personas adultas es: " + mediaEdadesAdultas.getAsDouble());
		}else {
			System.out.println("No se puede calcular la media");
		}
	}

}
