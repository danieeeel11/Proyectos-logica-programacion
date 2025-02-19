package ListasTDA;
/**
 * Clase nodo que permite crear nodos en la lista
 * Atributos
 * 	dato de tipo object en el cual se guaardan el valor de tipo primario o una instancia
 *	de una clase siguiente de tipo nodo que permite guardar la ferencia para enlazar los nodos
 *
 * @author Daniel Felipe Velasquez Rincon
 *
 * @param <E>
 */

public class Nodo <E>{
	private E dato;
	private Nodo siguiente;
	/*
	 * Constructor que inicializamos el valor de los atributos de la clase
	 */
	public void Nodo() {
		this.dato = null;
		this.siguiente = null;
	}
	/**
	 * Metodo
	 * @return
	 */
	public E getDato() {
		return dato;
	}
	/**
	 * 
	 * @param dato
	 */
	public void setDato(E dato) {
		this.dato = dato;
	}
	/**
	 * 
	 * @return
	 */
	public Nodo getSiguiente() {
		return siguiente;
	}
	/**
	 * 
	 * @param siguiente
	 */
	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
	
	
	
	
}
