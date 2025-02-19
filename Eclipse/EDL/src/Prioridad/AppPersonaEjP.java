package Prioridad;

import java.util.ArrayList;
import java.util.Collections;

public class AppPersonaEjP {
	private static ArrayList<PersonaEjP> listaPersonas;
	public static void main(String[] args) {
		listaPersonas = new ArrayList<PersonaEjP>();
		
		listaPersonas.add(new PersonaEjP(" Juanita","Perez",25));
		listaPersonas.add(new PersonaEjP("Pachito","Rodriguez",35));
		listaPersonas.add(new PersonaEjP("Albita","Mora",23));
		listaPersonas.add(new PersonaEjP("@Rosita","Agudelo",45));
		listaPersonas.add(new PersonaEjP("rosita","Alba",30));
		listaPersonas.add(new PersonaEjP("PEDRO","14",35));
		
		System.out.println("Lista original");
		mostrar();
		
		//Collections.sort(listaPersonas);
		System.out.println("Lista Ordenada");
		mostrar();
	}
	public static void mostrar() {
		listaPersonas.forEach(System.out::println);
	}
}
