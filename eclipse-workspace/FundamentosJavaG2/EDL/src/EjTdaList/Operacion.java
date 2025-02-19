package EjTdaList;

import java.util.ArrayList;
import java.util.Scanner;

import ListasTDA.ArryList.TDAlist;
/**
 * Clase operaciones implementa las funciones para crear lista
 * y realiza busquedas
 * @author Daniel Felipe Velasquez Rincon
 * @since 24-02-2021
 */
public class Operacion {
	private TDAlist listaNumeros;
	private Scanner leerDato = new Scanner(System.in);
	
	public Operacion() {
		listaNumeros = new TDAlist();
	}
	/**
	 * Metodo para generar una lista de numeros aleatorios
	 * @param dato determina el tamaño de la lista
	 */
	public void generarLista(int dato) {
		for (int i = 0; i < dato; i++) {
			//listaNumeros.addFinal(i + 50);
			listaNumeros.addFinal(Math.random()); //generamos numeros aleatorios
		}
	}
	/**
	 * 
	 * @return un entero del numero mayor de la lista
	 */
	public int buscarMayor() {
		int mayor = 0;
		ArrayList<Integer> lista = listaNumeros.getLista();
		for (Integer numero : lista) {
			if(numero > mayor) {
				mayor = numero;
				break;
			}
		}
		return mayor;
	}
	/**
	 * 
	 * @return un entero del numero menor de la lista
	 */
	public int buscarMenor() {
		int menor = 1000000;
		ArrayList<Integer> lista = listaNumeros.getLista();
		for (Integer numero : lista) {
			if(numero < menor) {
				menor = numero;
				break;
			}
		}
		return menor;
	}
	/**
	 * 
	 * @return el promedio de los contenidos de la lista
	 */
	public double promedio() {
		int suma = 0;
		ArrayList<Integer> lista = listaNumeros.getLista();
		for (Integer integer : lista) {
			suma += integer;
		}
		//return suma/ lista.size();
		return suma/ listaNumeros.tamanio();
	}
	/**
	 * 
	 * @param dato a buscar dentro de la lista
	 * @return true si encunetra el dato, false si no lo encuentra dentro de la lista
	 */
	public boolean buscarNumero(int dato) {
		ArrayList<Integer> lista = listaNumeros.getLista();
		boolean encontrar = false;
		for (Integer numero : lista) {
			if (dato == numero) {
				encontrar = true;
				break;
			}
		}
		
		return encontrar;
	}
	/**
	 * 
	 */
	public void menu() {
		int opc=0;
		boolean salir = false;
		while(!salir) {
			System.out.println("Operaciones con una lista de numeros enteros");
			System.out.println("1. Crear lista");
			System.out.println("2. EL mayor");
			System.out.println("3. El menor");
			System.out.println("4. Buscar numero");
			System.out.println("5. Promedio");
			System.out.println("6. Mostrar lista");
			System.out.println("7. Salir");
			System.out.println("Entrar una de las opciones");
			opc = leerDato.nextInt();
			switch(opc) {
				case 1:
					System.out.println("Crear lista");
					System.out.println("Cuantos datos en la lista");
					generarLista(leerDato.nextInt());
					break;
				case 2:
					System.out.println("El numero mayor de la lista es: " + buscarMayor());
				case 3:
					System.out.println("El numero menor de la lista: " + buscarMenor());
				case 4:
					System.out.println("Buscar un numero en la lista");
					System.out.println("Entrar el numero a buscar");
					int numero = leerDato.nextInt();
					if(buscarNumero(numero)) {
						System.out.println("Numero encontrado");
					}else {
						System.out.println("Numero no encontrado");
					}; break;
				case 5:
					System.out.println(promedio());break;
				case 6:
					listaNumeros.muestra();break;
				case 7:
					salir=true; break;
				default:
					System.out.println("Solo numeros entre 1 y 7"); break;
			}
			
		}
	}
	
}
