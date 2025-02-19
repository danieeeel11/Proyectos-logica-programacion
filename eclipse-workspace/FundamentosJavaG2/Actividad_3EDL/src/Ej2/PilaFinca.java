package Ej2;

import java.util.Scanner;


import TdaPila.TdaPila;
/**
 * Clase PilaFinca que contiene los metodos llenar(), conteo() y run(), donde se clasifican los novillos segun su peso
 * @author Laura Sofia Ojeda Leon & Daniel Felipe Velasquez Rincon
 * @version 2
 * @since 07-04-2021
 */
public class PilaFinca {
	TdaPila rebanio1 = new TdaPila<>();
	TdaPila rebanio2 = new TdaPila<>();
	
	/**
	 * Metodo para ingresar los novillos de la finca y clasificarlos segun su peso
	 */
	public void llenar() {
		Scanner leerDato =new Scanner(System.in);
		System.out.println("Ingrese cuantos novillos de peso entre 200 y 500 kg, que desea aguardar en la finca");
		int n = leerDato.nextInt();
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.println("Ingrese el peso del novillo " + (i+1));
			int peso = leerDato.nextInt();
			if(peso>=200 && peso<=350) {
				rebanio1.apilar(peso);
			}else if(peso>=351 && peso<=450) {
				rebanio2.apilar(peso);
			}
		}
	}
	
	/**
	 * Metodo para realizar el conteo de los novillos jovenes y toros, mostrando los pesos respectivos
	 */
	public void conteo() {
		System.out.println("\nNovillos jovenes: " + rebanio1.tamanio());
		for (int i = rebanio1.tamanio(); i >0; i--) {
			System.out.println(rebanio1.tope()+ " kg");
			rebanio1.desapilar();
		}
		
		System.out.println("\nNovillos toros: " + rebanio2.tamanio());
		for (int i = rebanio2.tamanio(); i >0; i--) {
			System.out.println(rebanio2.tope()+ " kg");
			rebanio2.desapilar();
		}
	}
	
	/**
	 * Metodo que ejecuta los metodos llenar y conteo
	 */
	public void run() {
		llenar();
		conteo();
		/*Scanner leerDato =new Scanner(System.in);
		TdaPila rebanio1 = new TdaPila<>();
		TdaPila rebanio2 = new TdaPila<>();
		System.out.println("Ingrese cuantos novillos de peso entre 200 y 500 kg, que desea aguardar en la finca");
		int n = leerDato.nextInt();
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.println("Ingrese el peso del novillo " + (i+1));
			int peso = leerDato.nextInt();
			if(peso>=200 && peso<=350) {
				rebanio1.apilar(peso);
			}else if(peso>=351 && peso<=450) {
				rebanio2.apilar(peso);
			}
		}
		System.out.println("\nNovillos jovenes: " + rebanio1.tamanio());
		for (int i = rebanio1.tamanio(); i >0; i--) {
			System.out.println(rebanio1.tope()+ " kg");
			rebanio1.desapilar();
		}
		
		System.out.println("\nNovillos toros: " + rebanio2.tamanio());
		for (int i = rebanio2.tamanio(); i >0; i--) {
			System.out.println(rebanio2.tope()+ " kg");
			rebanio2.desapilar();
		}*/
		
	}
}
