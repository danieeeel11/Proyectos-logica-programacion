package Ej1;

import java.util.Stack;

public class TdaPila<E> {
	public Stack<E> pila;
	
	/*
	 * Constructor de la clase permite crear una instancia (objeto) de la clase Stack
	 */
	public TdaPila() {
		this.pila = new Stack<>();
	}
	
	/**
	 * Funcion para determinar si la pila contiene o no elementos
	 * @return true si la pila esta vacia, false si la pila no esta vacia
	 */
	public boolean vacia() {
		return this.pila.empty();
	}
	
	/**
	 * Funcion retornar el numero de elementos de la pila
	 * @return un entero con el numero de elementos de una pila
	 */
	public int tamanio() {
		return this.pila.size();
	}
	
	/**
	 * Funcion apilar
	 * @param elemento es la instancia que se debe apilar
	 */
	public void apilar(E elemento) {
		this.pila.push(elemento);
	}
	
	/**
	 * Funcion para extraer un elemento de la pila
	 * @return la referencia al elemento (dato)
	 */
	public E desapilar() {
		return this.pila.pop();
	}
	
	/**
	 * 
	 * @return la referencia al elemento (dato) sin removerlo
	 */
	public E tope() {
		return this.pila.peek();
	}
}
