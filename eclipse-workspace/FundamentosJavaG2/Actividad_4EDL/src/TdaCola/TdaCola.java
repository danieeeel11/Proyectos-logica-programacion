package TdaCola;

import java.util.LinkedList;
import java.util.Queue;

public class TdaCola<E> {
	private Queue<E> cola;
	/**
	 * Constructor del TDA cola
	 */
	public TdaCola(){
		this.cola = new LinkedList<>();
	}
	/**
	 * Funcion retorna true si la cola esta vacia, o false si la cola tiene elementos
	 * @return
	 */
	public boolean vacia() {
		return this.cola.isEmpty();
	}
	/**
	 * Funcion para obtener el tamaño de la cola
	 * @return tamaño de la cola
	 */
	public int tamanio(){
		return this.cola.size();
	}
	/**
	 * Funcion para insertar datos en la cola
	 * @param dato es el dato a insertar
	 */
	public void encolar(E dato) {
		this.cola.add(dato);
	}
	/**
	 * Funcion para extraer un elemento de la cola
	 * @return la referencia de objetos (elemento o dato)
	 */
	public E decolar() {
		return this.cola.remove();
	}
	/**
	 * Funcion para obtener el dato del primer elemento de la cola 
	 * @return la referencia al objeto o el dato que se encuentra en el primer elemento de la cola sin removerlo
	 */
	public E tope() {
		return this.cola.peek();
	}
}
