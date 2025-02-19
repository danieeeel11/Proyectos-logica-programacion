package ColaTDA;

import java.util.LinkedList;
import java.util.Queue;

public class AppCola {

	public static void main(String[] args) {
		TdaCola miCola = new TdaCola();
		
		miCola.encolar(10);
		miCola.encolar(40);
		miCola.encolar(50);
		
		System.out.println(miCola.tope());
		System.out.println(miCola.decolar());
		System.out.println(miCola.tope());
		System.out.println(miCola.tamanio());
		
		Queue<Integer> cola = new LinkedList<>();
		
		cola.add(100);

	}

}
