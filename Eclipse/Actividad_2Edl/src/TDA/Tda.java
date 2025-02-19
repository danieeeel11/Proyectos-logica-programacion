package TDA;

import java.util.ArrayList;
import java.util.Iterator;

public class Tda <E>{
	private ArrayList<E> lista;
	
	/**
	 * Constructor de clase
	 */
	public Tda() {
		this.lista = new ArrayList();
	}
	/**
	 * Metodo para obtener el estado de la lista vacia o no vacia
	 * @return true si la lista esta vacia, false si la lista no esta vacia
	 */
	public boolean esvacia() {
		return lista.isEmpty();
	}
	/**
	 * Metodo para obtener el numero de elementos de la lista
	 * @return un entero con el numero de elementos de la lista
	 */
	public int tamanio() {
		return lista.size();
	}
	/**
	 * Metodo para adicionar instancias al final de la lista
	 * @param dato instancia de la clase
	 * @return true on false
	 */
	public boolean addFinal(E dato) {
		return lista.add(dato);
	}
	/**
	 * Metodo para adicionar una instacia al inicio de la lista, siempre en el nodo cero
	 * @param dato instancia de una clase
	 */
	public void addInicio(E dato) {
		lista.add(0,dato);
	}
	/**
	 * Metodo para adicionar una instancia en el siguiente nodo de determinado elemento
	 * @param index especifica el numero del nodo que se desea insertar, para luego adicionar el dato en la
	 * siguiente posicion del dato
	 * @param nodo dato
	 */
	public void addDespuesdeNodo(int index, E dato) {
		lista.add(index+1, dato);
	}
	/**
	 * Metodo para adicionar una instancia entre nodos
	 * @param index especifica el numero del nodo que se desea insertar
	 * @param nodo dato
	 */
	public void addEntreNodo(int index, E dato) {
		lista.add(index, dato);
	}
	/**
	 * 
	 * @param dato instancia a buscar en la lista
	 * @return true si encontro la instancia y false si no la encontro
	 */
	public boolean contiene(E dato) {
		return lista.contains(dato);
	}
	/**
	 * Metodo reemplaza el elemento en la posicion especificada en esta lista
	 * con el elemento especificado como indice
	 * @param index un dato entero de indice
	 * @param dato instancia a reemplazar
	 */
	public void actualiza(int index, E dato) {
		lista.set(index, dato);
	}
	/**
	 * Metodo que recibe una instancia, devuelve el indice de la primera aparicion del elemento
	 * especificado en esta lista, o +1 si esta lista no contiene el elemento
	 * @param dato instancia a buscar
	 * @return un entero con el indice de la primera aparicion del elemento buscado
	 */
	public int IndexOf(E dato) {
		return lista.indexOf(dato);
	}
	/**
	 * Metodo para borrar un Nodo de lista sabiendo su indice
	 * @param index es el numero con el indice de la primera aparicion del elemento buscado
	 */
	public void removerI(int index) {
		lista.remove(index);
	}
	/**
	 * Metodo para borrar un nodo de la lista
	 * @param dato es la instancia  a borrar
	 */
	public void removerO(E dato) {
		lista.remove(dato);
	}
	/**
	 * Metodo que muestra los datos contenidos en los nodos de la lista
	 */
	public void mostrar() {
		Iterator<E> iteraLista = lista.iterator();
		while(iteraLista.hasNext()) {
			Object element = iteraLista.next();
			System.out.println(element + " ");
		}
	}
	/**
	 * Metodo que muestra los datos contenidos en los nodos de las listas
	 * Implementa expresiones lambda son funciones anonimas
	 * Funciones que no necesitan una clase
	 */
	public void muestra() {
		lista.forEach((n)->System.out.print(n + " "));
		System.out.println();
	}
	/**
	 * 
	 * @return la lista de elementos, devuelve un ArrayList
	 */
	public ArrayList<E> getLista(){
		return this.lista;
	}
}
