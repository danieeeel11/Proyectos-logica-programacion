package Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

import TDA.Tda;
/**
 * Clase que contiene operaciones con numeros enteros de una lista del ejercicio1
 * @author Laura Sofia Ojeda Leon & Daniel Felipe Velasquez Rincon
 * @version 3
 * @since 01-03-2021
 *
 */
public class OperacionEjercicio1 <E>{
	private Tda listaNum;
	private Scanner leerDato = new Scanner(System.in);
	
	/**
	 * Constructor de la clase OperacionEjercicio1
	 */
	public OperacionEjercicio1() {
		listaNum = new Tda();
	}
	
	/**
	 * Metodo para generar una lista de numeros ingresados por pantalla
	 * @param dato determina el tamaño de la lista
	 */
	public void generarLista(int dato) {
		System.out.println("Ingrese los numeros enteros");
		for (int i = 0; i < dato; i++) {
			int a = leerDato.nextInt();
			listaNum.addFinal(a);
		}
	}
	
	/**
	 * Metodo para buscar un numero dentro de los nodos
	 * @param dato entero a buscar
	 * @return 0 si no se encuntra en los nodos, indice del numero a buscar si se encuentra en los nodos
	 */
	public int buscarNum(int dato) {
		ArrayList<Integer> lista = listaNum.getLista();
		int find = 0;
		for (Integer numero : lista) {
			if (dato == numero) {
				find = listaNum.IndexOf(numero);
				break;
			}
		}
		return find;
	}
	
	/**
	 * Metodo para determinar la suma total de los elementos cotenidos en una lista
	 * @return la suma de los contenidos de la lista
	 */
	public int sumaItems() {
		int suma = 0;
		ArrayList<Integer> lista = listaNum.getLista();
		for (Integer integer : lista) {
			suma += integer;
		}
		return suma;
	}
	
	/**
	 * Metodo para agregar un cero despues de cada ciertos indices
	 * @param dato suma total de los elementos cotenidos en la lista
	 */
	public void agregarCero(int dato) {
		ArrayList<Integer> lista = listaNum.getLista();
		listaNum.addEntreNodo(dato, 0);
		int g = buscarNum(0);
		for (int i = 0; i <= listaNum.tamanio(); i++) {
			g+=dato+1;
			if(g > listaNum.tamanio()) {
				break;
			}
			listaNum.addEntreNodo(g, 0);
		}
	}
	
	/**
	 * Metodo para lanzar un menu de opciones del ejercicio1
	 */
	public void run() {
		int opc=0;
		boolean salir = false;
		while(!salir) {
			System.out.println("Operaciones con una lista de numeros enteros");
			System.out.println("1. Crear lista");
			System.out.println("2. Evaluar la suma de los elementos");
			System.out.println("3. Mostrar lista");
			System.out.println("4. Salir");
			System.out.println("Entrar una de las opciones");
			opc = leerDato.nextInt();
			switch(opc) {
				case 1:
					System.out.println("Crear lista");
					System.out.println("Cuantos datos en la lista");
					generarLista(leerDato.nextInt());
					System.out.println();
					break;
				case 2:
					listaNum.muestra();
					System.out.println("La suma de los elementos de la serie es: " + sumaItems());
					if(sumaItems() >= listaNum.tamanio()) {
						System.out.println("La suma es más grande que los indices de la lista");
						System.out.println();
					}else if(sumaItems() <= 0){
						System.out.println("La suma es más pequeña que los indices de la lista");
						System.out.println();
					}else {
						agregarCero(sumaItems());
					}
					System.out.println();
					break;
				case 3:
					listaNum.muestra();
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
