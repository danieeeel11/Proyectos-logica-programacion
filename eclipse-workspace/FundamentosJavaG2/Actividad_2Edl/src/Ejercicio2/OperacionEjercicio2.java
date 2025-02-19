package Ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

import TDA.Tda;
/**
 * Clase que contiene operaciones con numeros enteros de una lista del ejercicio2
 * @author Laura Sofia Ojeda Leon & Daniel Felipe Velasquez Rincon
 * @version 3
 * @since 03-03-2021
 *
 */
public class OperacionEjercicio2 {
	private Tda listaN;
	private Scanner leerDato = new Scanner(System.in);
	
	public OperacionEjercicio2() {
		listaN = new Tda();
	}
	/**
	 * Metodo para generar una lista de numeros ingresados por pantalla
	 * @param dato determina el tamaño de la lista
	 */
	public void generarLista(int dato) {
		System.out.println("Ingrese los numeros enteros");
		for (int i = 0; i < dato; i++) {
			int a = leerDato.nextInt();
			listaN.addFinal(a);
		}
	}
	/**
	 * Metodo para determinar la suma total de los elementos cotenidos en posiciones pares en una lista
	 * @return la suma de los contenidos de la lista
	 */
	
	public int sumaPar() {
		ArrayList<Integer> lista = listaN.getLista();
		int sumaP = 0;
		for (int i = 0; i< listaN.tamanio(); i++) {
			if((i+1)%2 == 0) {
				sumaP += lista.get(i);
			}
		}
		return sumaP;
	}
	
	/**
	 * Metodo para determinar la suma total de los elementos cotenidos en posiciones impares en una lista
	 * @return la suma de los contenidos de la lista
	 */
	public int sumaImpar() {
		int sumaI = 0;
		ArrayList<Integer> lista = listaN.getLista();
		for (int i = 0; i< listaN.tamanio(); i++) {
			if((i+1)%2 != 0) {
				sumaI += lista.get(i);
			}
		}
		return sumaI;
	}	
	
	/**
	 * Metodo para determinar si la suma de los elementos contenidos en posiciones pares es igual
	 * a la suma de los elementos contenidos en posiciones impares
	 * @return true si son iguales las sumas, y borra los elementos de las posiciones pares, 
	 * false si son diferentes las sumas, y borra los elementos de las posiciones impares 
	 */	
	public boolean determinarIgual() {
		ArrayList<Integer> lista = listaN.getLista();
		boolean igualdad = false;
		if(sumaPar() != sumaImpar()) {
			int g=0;
			System.out.println("Las sumas son diferentes");
			for (int i = 0; i< listaN.tamanio(); i++) {
				if((g)%2 == 0) {
					lista.remove(i);
				}
				g += g;
				if(g> listaN.tamanio()) {
					break;
				}
			}
			igualdad = true;
		}else {
			int g=0;
			System.out.println("Las sumas son iguales");
			for (int i = 0; i <listaN.tamanio(); i++) {
				if((g)%2 != 0) {
					lista.remove(i);
				}
				g += g-1;
				if(g> listaN.tamanio()) {
					break;
				}
			}
			igualdad = false;
		}
		return igualdad; 
	}
	
	/**
	 * 
	 */
	public void run() {
		int opc=0;
		boolean salir = false;
		while(!salir) {
			System.out.println("Operaciones con una lista de numeros enteros, posiciones pares e impares");
			System.out.println("1. Crear lista");
			System.out.println("2. Evaluar la suma de los elementos en las posiciones pares e impares");
			System.out.println("3. Determinar igualdad de sumas, y mostrar lista");
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
					listaN.muestra();
					System.out.println("La suma de los elementos de las posiciones pares de la serie es: " + sumaPar());
					System.out.println("La suma de los elementos de las posiciones impares de la serie es: " + sumaImpar());
					System.out.println();
					break;
				case 3:
					determinarIgual();
					listaN.muestra();
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
