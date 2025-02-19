package Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

import TDA.Tda;

public class OpRevision {
	private Tda listaNumeros;
	private Scanner leerDato = new Scanner(System.in);
	
	/**
	 * Constructor de la clase OperacionEjercicio1
	 */
	public OpRevision() {
		listaNumeros = new Tda();
	}
	
	public void creaLista() {
		System.out.println("Cuantos numeros desea generar");
		int dato = leerDato.nextInt();
		for(int i=0; i<dato; i++) {
			int numero = (int)(Math.random()*20+1);
			listaNumeros.addFinal(numero);
		}
	}
	
	public void insertarCero() {
		ArrayList<Integer> lista = listaNumeros.getLista();
		int suma = 0;
		int index;
		for (Integer integer : lista) {
			suma += integer;
		}
		index = (suma%2)+1;
		int a = lista.size()+lista.size()-index;
		for (int i = index; i<a ; i+=(index+1)) {
			lista.add(i,0);
		}
	}
	
	public void mostrarLista() {
		listaNumeros.muestra();
	}
	
	public void run() {
		int opc=0;
		boolean salir = false;
		while(!salir) {
			System.out.println("\n");
			System.out.println("MENU DE OPCIONES");
			System.out.println("1. Crear lista de numeros");
			System.out.println("2. Insertar cero");
			System.out.println("3. Mostrar lista");
			System.out.println("4. Salir");
			System.out.println("Entrar un dato entre 1 y 4");
			opc = leerDato.nextInt();
			switch(opc) {
				case 1:creaLista();break;
				case 2:insertarCero();break;
				case 3:mostrarLista();break;
				case 4:salir=true;break;
				default:System.out.println("Solo numeros entre 1 y 4");break;
			}
			
		}
	}

}
