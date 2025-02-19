package Ej2;

import java.util.ArrayList;
import java.util.Scanner;

import TdaPila.TdaPila;
/**
 * Clase PilaFinca que contiene los metodos llenar(), deter(), conteo() y run(), donde se clasifican los novillos segun su peso
 * @author Laura Sofia Ojeda Leon & Daniel Felipe Velasquez Rincon
 * @version 2
 * @since 07-04-2021
 */
public class PilaRebaño {
	
	ArrayList reba = new ArrayList<>();
	TdaPila rebanio1 = new TdaPila<>();
	TdaPila rebanio2 = new TdaPila<>();
	
	/**
	 * Metodo para ingresar los novillos de la finca
	 */
	public void llenar() {
		Scanner leerDato =new Scanner(System.in);
		System.out.println("Ingrese cuantos novillos de peso entre 200 y 500 kg, que desea aguardar en la finca");
		int n = leerDato.nextInt();
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.println("Ingrese el peso del novillo " + (i+1));
			int peso = leerDato.nextInt();
			reba.add(peso);
		}
	}
	
	/**
	 * Funcion recursiva para explorar el listado de rebaño total de novillos, para luego asignarlos al rebaño1 o rebaño2
	 * en funcion de su peso (novillos jovenes o novillos toros)
	 * @param reba listado total de novillos dentro de la finca ganadera
	 * @param rebanio1 listado pila de los novillos jovenes
	 * @param rebanio2 listado pila de los noovilos toros
	 * @param pos indice
	 */
	public static void deter(ArrayList reba, TdaPila rebanio1, TdaPila rebanio2, int pos) {		
		if(pos == 0) {
			if((int)reba.get(pos)>=200 && (int)reba.get(pos)<=350) {
				rebanio1.apilar((int)reba.get(pos));
			}
			if((int)reba.get(pos)>=351 && (int)reba.get(pos)<=450) {
				rebanio2.apilar((int)reba.get(pos));
			}
		}else {
			if((int)reba.get(pos)>=200 && (int)reba.get(pos)<=350) {
				rebanio1.apilar((int)reba.get(pos));
			}
			if((int)reba.get(pos)>=351 && (int)reba.get(pos)<=450) {
				rebanio2.apilar((int)reba.get(pos));
			}
			deter(reba, rebanio1, rebanio2, pos-1);
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
		deter(reba, rebanio1, rebanio2, (reba.size()-1));
		conteo();
	}

}
