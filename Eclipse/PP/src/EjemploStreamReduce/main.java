package EjemploStreamReduce;

import java.util.ArrayList;
import java.util.List;

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
		
		int sumaEdades = listaPersonas.stream().map(p->p.getEdad()).reduce(0, (e1,e2)->e1+e2);
		System.out.println("La suma de las edades: " + sumaEdades);
		if(listaPersonas.stream().anyMatch(p->p.getEdad()>18)) {
			System.out.println("Existe al menos una persona mayor de 18 años");
		}
		
		int sumaEdades2 = listaPersonas.stream().mapToInt(p->p.getEdad()).reduce(0, (e1,e2)->e1+e2);
		System.out.println("La suma de las edades: " + sumaEdades2);
		if(listaPersonas.stream().allMatch(p->p.getEdad()>=18)) {
			System.out.println("Existe al menos una persona mayor de 18 años");
		}else {
			System.out.println("No todas las personas son mayores de edad");
		}
	}

}
