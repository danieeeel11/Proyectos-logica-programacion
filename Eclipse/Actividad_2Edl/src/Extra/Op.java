package Extra;

import java.util.Scanner;

public class Op <E>{
	// instancia de la clase Nodo
    private Nodo inicio;
	private int tamaño;
	private Scanner leerDato = new Scanner(System.in);
	/**
	 * Constructor de a clase sin parametro para inicializar
	 * los atributos de la clase
	 */
	public void Operacion1() {
		inicio = null;
		tamaño = 0;
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
	public int getTamaño(){
		return tamaño;
	}
	public void generarLista(int dato) {
		System.out.println("Ingrese los numeros enteros");
		for (int i = 0; i < dato; i++) {
			int a = leerDato.nextInt();
			Nodo nuevo = new Nodo();
			nuevo.setDato(a);
			if(esVacia()) {
				inicio = nuevo;
			}else {
				Nodo auxiliar = inicio;
				while(auxiliar.getSiguiente() != null) {
					auxiliar = auxiliar.getSiguiente(); 
				}
				auxiliar.setSiguiente(nuevo);
			}
			tamaño++;
		}
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
		tamaño++;
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
	
	public int suma() {
		Nodo auxiliar = inicio;
		int sum = 0;
		while(auxiliar != null) {
			//int x = (Integer) auxiliar.getDato();
			//sum = 1;
			//int x = (Integer) auxiliar.getDato();
			sum += (Integer) auxiliar.getDato();
			auxiliar = auxiliar.getSiguiente();
		}
		return sum;
	}
	
	public int buscarDato(E dato) {
		Nodo auxiliar = inicio;
		int find = 0;
		while(auxiliar != null) {
			if(dato == auxiliar.getDato()) {
				int a = (Integer) auxiliar.getDato();
				return find = a;
			}else {
				auxiliar = auxiliar.getSiguiente();
			}
		}
		return find;
	}
	
	public int buscarData(int dato) {
		Nodo auxiliar = inicio;
		int find = 0;
		while(auxiliar != null) {
			if(dato == (Integer) auxiliar.getDato()) {
				return find = (Integer) auxiliar.getDato();
			}else {
				auxiliar = auxiliar.getSiguiente();
			}
		}
		return find;
	}
	
	public void addZero() {
		if(!esVacia()) {
			Nodo nuevo = new Nodo();
			Nodo auxiliar = inicio;
			while(auxiliar != null) {
				//auxiliar.getDato();
				//auxiliar = auxiliar.getSiguiente();
				if(buscarData(suma()) == (Integer)auxiliar.getDato()) {
					//nuevo.setDato(0);
					//auxiliar.setDato(0);
					//auxiliar.setSiguiente(nuevo.setDato(0));
					auxiliar = auxiliar.getSiguiente();
					nuevo = inicio;
					nuevo.setDato(0);
					//auxiliar = auxiliar.getSiguiente();
				}
				auxiliar = auxiliar.getSiguiente();
					
			}
		}
		tamaño++;
	 }
	
	public void addCero() {
		Nodo nuevo = new Nodo();
		Nodo auxiliar = inicio;
		nuevo.setDato(0);
		if(!esVacia()) {
			while(auxiliar != null) {
				if(buscarData(suma()) == (Integer)auxiliar.getDato()) {
					//inicio = nuevo;
					auxiliar.setSiguiente(nuevo);
				}
					
				auxiliar = auxiliar.getSiguiente(); 
					
					//auxiliar.setSiguiente(nuevo);
			}
		}
			
			tamaño++;
	}
		/**if(buscarData(suma()) == (Integer)auxiliar.getDato()) {
			inicio = nuevo;
			auxiliar.setSiguiente(nuevo);
		}else {
			//Nodo1 auxiliar = inicio;
			while(auxiliar.getSiguiente() != null) {
				auxiliar = auxiliar.getSiguiente(); 
			}
			//auxiliar.setSiguiente(nuevo);
		}
		tamaño++;**/
		/**
		if(!esVacia()) {
			Nodo1 nuevo = new Nodo1();
			Nodo1 auxiliar = inicio;
			//nuevo.setDato(0);
			while(auxiliar != null) {
				//auxiliar.getDato();
				//auxiliar = auxiliar.getSiguiente();
				if(buscarData(suma()) == (Integer)auxiliar.getDato()) {
					//nuevo.setDato(0);
					//auxiliar.setDato(0);
					//auxiliar.setSiguiente(nuevo.setDato(0));
					auxiliar = auxiliar.getSiguiente();
					//nuevo = 0;
					nuevo.setDato(0);
					//auxiliar.setDato(auxiliar.getDato());
					//auxiliar = auxiliar.getSiguiente();
				}
				auxiliar = auxiliar.getSiguiente();
					
			}
		}
		tamaño++;**/
	
	public void correr() {
		int opc=0;
		boolean salir = false;
		while(!salir) {
			System.out.println("Operaciones con una lista de numeros enteros");
			System.out.println("1. Crear lista");
			System.out.println("2. Evaluar la suma de los elementos");
			System.out.println("3. Mostrar lista");
			System.out.println("4. Salir");
			System.out.println("Entrar una de las opciones");
			//Operacion1 lista = new Operacion1();
			opc = leerDato.nextInt();
			switch(opc) {
				case 1:
					System.out.println("Crear lista");
					System.out.println("Cuantos datos en la lista");
					generarLista(leerDato.nextInt());
					System.out.println();
					break;
				case 2:
					mostrar();
					System.out.println();
					System.out.println("La suma de los elementos de la serie es: " + suma());
					//addZero();
					//System.out.println(buscarData(suma()));
					System.out.println();
					break;
				case 3:
					addCero();
					mostrar();
					System.out.println();
					break;
				case 4:
					salir=true;
					break;
				default:
					System.out.println("Solo numeros entre 1 y 4");
					System.out.println();
					break;
			}
			
		}
	}
}
