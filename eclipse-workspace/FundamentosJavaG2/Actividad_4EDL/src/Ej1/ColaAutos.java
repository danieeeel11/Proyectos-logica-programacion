package Ej1;

import java.util.Scanner;

import TdaCola.TdaCola;
/**
 * Clase ColaAutos que contiene los metodos añadirAuto(), sacarAuto(), rellenar(), moverEspera(), imprimir() y run(),
 * donde se realiza movimientos en una via parking de autos de 10 espacios 
 * @author Laura Sofia Ojeda Leon & Daniel Felipe Velasquez Rincon
 * @version 2
 * @since 14-04-2021
 */
public class ColaAutos {
	TdaCola colaAuto = new TdaCola<>();
	TdaCola colaAux = new TdaCola<>();
	TdaCola colaEspera = new TdaCola<>();
	boolean estado = true;
	Scanner leerDato =new Scanner(System.in);
	/**
	 * Metodo para ingresar un auto al parking
	 */
	public void añadirAuto() {
		estado=true;
		while(estado) {
			if(colaAuto.tamanio()!=10) {
				System.out.println("Ingrese la matricula del auto");
				int matricula = leerDato.nextInt();
				colaAuto.encolar(matricula);
			}else {
				System.out.println("La via esta llena, se mueve el carro a la cola de espera");
				System.out.println("Ingrese la matricula del auto");
				int matricula = leerDato.nextInt();
				colaEspera.encolar(matricula);
			}
			System.out.println("Quiere continuar metiendo autos?");
			System.out.print("Si:1, No:2 --> ");
			int r = leerDato.nextInt();
			if(r == 1) {
				estado= true;
			}else {
				estado=false;
			}
		}
	}
	/**
	 * Metodo para sacar un auto de la via
	 */
	public void sacarAuto() {
		estado=true;
		boolean encontrado=true;
		while(estado) {
			if (colaAuto.tamanio()>0) {
				System.out.println("Ingrese la matricula del auto que desea sacar");
				int matricula = leerDato.nextInt();
				int sacado = 0;
				for (int i = colaAuto.tamanio(); i > 0; i--) {
					if(colaAuto.tamanio() == 0 ) {
						encontrado = false;
						break;
					}else {
						int car1 = (int)colaAuto.tope();
						if(car1 != matricula) {
							colaAux.encolar(colaAuto.decolar());
						}else {
							sacado = (int)colaAuto.decolar();
							encontrado = true;
							break;
						}
					}
				}
				if(encontrado) {
					System.out.println("\nEl auto de matricula " + sacado + " se ha movido " + (colaAux.tamanio()+1) + " veces en la via");
					System.out.println("Fueron movidos " + colaAux.tamanio() + " autos para sacar el auto requerido");
					rellenar();
					moverEspera();
					System.out.println("Quiere continuar sacando autos?");
					System.out.print("Si:1, No:2 --> ");
					int r = leerDato.nextInt();
					if(r == 1) {
						estado= true;
					}else {
						estado=false;
					}
				}else {
					rellenar();
					System.out.println("No se encontro el auto");
					System.out.println("Quiere buscar otro auto?");
					System.out.print("Si:1, No:2 --> ");
					int r = leerDato.nextInt();
					if(r == 1) {
						estado= true;
					}else {
						estado=false;
					}
				}
			}else {
				System.out.println("La via esta vacia");
				estado=false;
			}
		}
	}
	/**
	 * Metodo para volver a ingresar los autos movidos
	 */
	public void rellenar() {
		for (int i = colaAux.tamanio(); i > 0; i--) {
			colaAuto.encolar(colaAux.tope());
			colaAux.decolar();
		}
	}
	/**
	 * Metodo para ingresar el auto que esta en la primera posicion de la cola de espera a la via, cuando haya espacio disponible
	 */
	public void moverEspera() {
		if (colaEspera.tamanio()>0) {
			colaAuto.encolar(colaEspera.tope());
			colaEspera.decolar();
		}
	}
	/**
	 * Metodo para mostrar por pantalla los autos dentro de la via
	 */
	public void imprimir() {
		System.out.println("Los carros dentro de la via:");
		for (int i = colaAuto.tamanio(); i > 0 ; i--) {
			System.out.println(colaAuto.tope());
			colaAux.encolar(colaAuto.decolar());
		}
		rellenar();
	}
	/**
	 * Metodo que ejecuta un menu de opciones para añadir o sacar un auto de la via, e imprimir las matriculas de los autos dentro de la via
	 */
	public void run() {
		int op=0;
		boolean salir = false;
		System.out.println("Bienvenido a la via de parqueo");
		System.out.println("----------------------------------------------");
		while(!salir) {
			System.out.println("1. Ingresar auto");
			System.out.println("2. Sacar auto");
			System.out.println("3. Mostrar via");
			System.out.println("4. Salir");
			System.out.println("Digite una opcion");
			op = leerDato.nextInt();
			switch(op) {
				case 1:
					añadirAuto();
					break;
				case 2:
					sacarAuto();
					break;
				case 3:
					imprimir();
					break;
				case 4:
					salir = true;
					break;
				default:
					System.out.println("Digite un numero entre 1 y 4");
					break;
			}
			System.out.println("___________");
			System.out.println(" ");
		}
	}
}
