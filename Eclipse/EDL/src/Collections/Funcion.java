package Collections;
/**
 * Clase que contiene metodos tda, para un arreglo estatico de tipo Integer
 * @author Laura Sofia Ojeda Leon & Daniel Felipe Velasquez Rincon
 * @version 2
 * @since 10-03-2021
 */
public class Funcion {
	public int tamanio;
	public Integer[] numero;
	/**
	 * Constructor de la clase
	 */
	public Funcion() {
		this.tamanio = 0;
		this.numero = new Integer[10];
	}
	/**
	 * Metodo para determinar si el arreglo estatic es vacio o no
	 * @return true si esta vacia, false si esta con datos asignados
	 */
	public boolean vacia() {
		if(tamanio == 0) {
			return true;
		}else {
			return false;
		}
	}
	/**
	 * Metodo para determinar el tamaño del arreglo, contando el numero de datos que han sido asignados
	 * @return numero de elementos denro del arreglo
	 */
	public int tamanio() {
		return this.tamanio;
	}
	/**
	 * Metodo para adicionar una instacia al inicio de la lista, siempre en el nodo cero
	 * @param dato instancia numero entero
	 */
	public void agregarInicio(int dato) {
		if(tamanio == 0) {
			this.numero[0]=dato;
		}else{
			for (int i = numero.length; i > 0; i--) {
				if(numero[i-1] != null) {
				//break;
					numero[i] = numero[i-1];
				}
			}
			this.numero[0] = dato;
		}
		this.tamanio++;
	}
	/**
	 * Metodo para adicionar instancias al final de la lista
	 * @param dato instancia numero entero
	 */
	public void agregarFinal(int dato) {
		if(vacia()) {
			this.numero[0] = dato;
		}else {
			for (int i = 1; i < numero.length; i++) {
				if(numero[i] == null) {
					this.numero[i] = dato;
					break;
				}
			}
		}
		this.tamanio++;
	}
	/**
	 * Metodo para borrar un Nodo de lista sabiendo su indice
	 * @param index es el numero con el indice que al ser encontrado en la lista se remueve
	 */
	public void borrar(int index) {
		for (int i = 0; i < numero.length; i++) {
			if(i == index) {
				this.tamanio--;
				for (int j = index+1 ; j < numero.length; j++) {
					numero[j-1] = numero[j];
				}
			}
		}
	}
	/**
	 * Metodo reemplaza el elemento en la posicion especificada en esta lista
	 * con el elemento especificado como indice
	 * @param index un dato entero de indice
	 * @param dato instancia a reemplazar
	 */
	public void modificar(int index, int dato) {
		this.numero[index] = dato;
	}
	/**
	 * Metodo para recorrer la lista y encontrar un dato determinado
	 * @param dato instancia entera a buscardentro de la lista
	 * @return true si el dato fue encontrado, false si no fue encontrado
	 */
	public boolean consultar(int dato) {
		for (int i = 0; i < numero.length; i++) {
			if(numero[i] == dato) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	/**
	 * Metodo que muestra los datos contenidos en los nodos de la lista
	 */
	public void mostrar() {
		for (int i = 0; i < numero.length; i++) {
			if(numero[i] == null) {
				break;
			}
			System.out.println(numero[i]);
		}
	}
}
