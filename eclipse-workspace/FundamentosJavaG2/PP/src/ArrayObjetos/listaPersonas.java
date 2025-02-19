package ArrayObjetos;

import java.util.ArrayList;
import java.util.List;
/**
 * Programa principal para precargar los datos de tipo
 * String del nombre e int de la edad de una persona y asignarlos a un arreglo.
 * Esto usando el concepto de arrayList.
 * @author Daniel Felipe Velásquez Rincón
 * @version 1
 * @date 16-02-2021
 */
public class listaPersonas {

	public static void main(String[] args) {
		List <Persona> listaPersona = new ArrayList<>();
		listaPersona.add(new Persona("Maria",12));
		listaPersona.add(new Persona("Juan",18));
		listaPersona.add(new Persona("Mario",17));
		listaPersona.add(new Persona("Laura",20));
		listaPersona.add(new Persona("Carlos",21));
		
		System.out.println("Lista de personas");
		
		for (int i = 0; i < listaPersona.size(); i++) {
			System.out.println(listaPersona.get(i).getNombre() + " " + listaPersona.get(i).getEdad());
		}
		
		listaPersona.remove(1);
		System.out.println();
		System.out.println("Segunda impresion");
		
		for (Persona persona : listaPersona) {
			System.out.println(persona.getNombre() + " " + persona.getEdad());
		}

	}

}
