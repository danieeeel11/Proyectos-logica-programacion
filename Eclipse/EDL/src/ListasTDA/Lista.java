package ListasTDA;
/**
 * Clase para implementarlas funcionalidades de una lista
 * Atributos de instancia
 * 	inicio crea un puntero como cabecera de inicio de la lista de clase Nodo+
 * 	tamanio variable de tipo entero para identificar el tamaño de la lista
 * @author Daniel Felipe Velasquez Rincon
 * @param <E>
 */
public class Lista<E> implements ITda<E> {
	// instancia de la clase Nodo
	private Nodo inicio;
	private int tamanio;
	/**
	 * Constructor de a clase sin parametro para inicializar
	 * los atributos de la clase
	 */
	public void Lista() {
		inicio = null;
		tamanio = 0;
	}
	/**
	 * Metodo que consulta si la lista esta vacia
	 * @return true si el primer nodo (inicio), no apunta a otro nodo
	 */
	public boolean esVacia() {
		return inicio == null;
	}
	/**
	 * Consulta cuantos elementos (nodsos) tiene la lista
	 * @return numero entero entre [0,n] donde n es el numero de elementos
	 * que contiene la lista
	 */
	public int getTamanio(){
		return tamanio;
	}
	/**
	 * Metodo para agrefar un nuevo nodo al final de la lista
	 * Crear un nuevo nodo
	 * Agregar el valor al nodo
	 * Consulta si la lista esta vacia
	 * Si la lista esta vacia inicializa la lisgta agregando como inicio al nuevo nodo
	 * Si no recorre la lista hasta llegar al ultimo nodo 
	 * 	Crea una copia de la lista
	 * 	Recorre la lista hasta llegar al ultimo nodo 
	 * 	Agrega el nuevo nodo al final de la lista
	 * 	ncrementa el contador de tamañao de la lista
	 * @param dato a agregar
	 */
	public void agregarAlFinal(E dato) {
		//Crearuna instancia de la clase nodo
		Nodo nuevo = new Nodo();
		nuevo.setDato(dato);
		if(esVacia()) {
			inicio = nuevo;
		}else {
			Nodo auxiliar = inicio;
			while(auxiliar.getSiguiente() != null) {
				auxiliar = auxiliar.getSiguiente(); 
			}
			auxiliar.setSiguiente(nuevo);
		}
		tamanio++;
	}
	/**
	 * Metodo para recorrer la lista y mostrar por consola los datos que contienen cada nodo
	 * Verifica si la lista no esta vacia
	 * Si no esta vacia
	 * 	Crea una copia de la lista
	 * 	Posicion de los elementos de la lista
	 * 	Recorre la lista hasta el final
	 * 	Muestra por pantalla la informacion contenida en el nodo
	 * 	Avanza el siguiente nodo
	 * Si esta vacia enviar mensaje
	 */
	public void mostrar() {
		if(!esVacia()) {
			Nodo auxiliar = inicio;
			while(auxiliar != null) {
				System.out.print(" " + auxiliar.getDato() + " ");
				auxiliar = auxiliar.getSiguiente();
			}
		}else {
			System.out.println("La lista esta vacia");
		}
	}
	/**
	 * Metodo para buscar si existe un dato especifico en la lista
	 * @param dato a buscar
	 * Crea una copia de la lista
	 * Variable local encontrado de tipo boolean para indicar si el valor existe
	 * Recorre la lista hasta encontrar el elemento o hasta llegar al final de la lista
	 * Si el dato del nodo es igual al del dato enviado como parametro
	 * 	Cambia el valor de variable encontrado a true
	 * Si no avanza al siguiente nodo
	 * Retorna el valor de la variable encontrado
	 * @return true si existe el dato en la lista o false si no existe el dato en la lista
	 */
	public boolean buscar(E dato) {
		Nodo auxiliar = inicio;
		while(auxiliar != null) {
			if(dato.equals(auxiliar.getDato())) {
				return true;
			}else {
				auxiliar = auxiliar.getSiguiente();
			}
		}
		return false;
	}
}
