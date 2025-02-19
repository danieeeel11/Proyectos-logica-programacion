package Prioridad;

import java.util.PriorityQueue;
import java.util.Queue;

public class Impresora {
	private Queue<Documento> cola;
	
	public Impresora() {
		this.cola = new PriorityQueue<Documento>();
	}
	
	public void encolar(Documento doc) {
		this.cola.add(doc);
	}
	
	/*public void imprimir(int prioridad) {
		
	}*/
	public void imprimir() {
		while(!cola.isEmpty()) {
			Documento a = cola.remove();
			System.out.println(a);
		}
	}

	/*public static void main(String[] args) {
		Queue<Documento> doc = new PriorityQueue<Documento>();
		//prioridad 3 mayor, 2 medio, 1 menor
		doc.add(new Documento(1,100));
		doc.add(new Documento(2,90));
		doc.add(new Documento(3,350));
		doc.add(new Documento(4,580));
		doc.add(new Documento(5,59));
		doc.add(new Documento(6,160));
		doc.add(new Documento(7,59));
		
		while(!doc.isEmpty()) {
			Documento a = doc.remove();
			System.out.println(a);
		}
	}*/

}
