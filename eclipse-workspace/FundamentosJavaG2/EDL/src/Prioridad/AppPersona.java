package Prioridad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class AppPersona {

	public static void main(String[] args) {
		Queue<Persona> cola = new PriorityQueue<Persona>();
		//prioridad 3 mayor, 2 medio, 1 menor
		cola.add(new Persona(100,"Juanita", 80, 3));
		cola.add(new Persona(1031,"Pachito", 70, 2));
		cola.add(new Persona(2100,"Albita", 60, 1));
		cola.add(new Persona(3150,"Rosita", 81, 3));
		cola.add(new Persona(3150,"Pachita", 82, 3));
		cola.add(new Persona(3150,"Orlando", 83, 3));
		cola.add(new Persona(3150,"Carlitos", 61, 1));
		
		while(!cola.isEmpty()) {
			Persona a = cola.remove();
			System.out.println(a);
		}
		
		PriorityQueue<Integer> colita = new PriorityQueue<Integer>();
		colita.add(20);
		colita.add(200);
		colita.add(10);
		colita.add(35);
		colita.add(9);
		colita.add(-5);
		colita.add(4);
		colita.add(99);
		
		while(!colita.isEmpty()) {
			Integer i = colita.remove();
			System.out.println(i);
		}
		
		cola.stream().forEach(System.out::println);
		//Collections.sort(colaPersonas);
		ArrayList<Persona> listaPersonas = new ArrayList<>();
		Collections.sort(listaPersonas);
		
	}

}
