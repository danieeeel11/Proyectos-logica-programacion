package Extra;


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
