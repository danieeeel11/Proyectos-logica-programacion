package Ej1;

import java.util.Scanner;

import TdaPila.TdaPila;
/**
 * Clase PilaAutos que contiene los metodos llenar(), añadir(), devolver(), imprimir() y run(), donde se añaden dos palabras en una pila de forma alfabetica
 * @author Laura Sofia Ojeda Leon & Daniel Felipe Velasquez Rincon
 * @version 2
 * @since 09-04-2021
 */
public class PilaAutos {
	Scanner leerDato =new Scanner(System.in);
	TdaPila autos = new TdaPila<>();
	TdaPila aux = new TdaPila<>();
	
	/**
	 * Metodo para ingresar los nombres de os automoviles
	 */
	public void llenar() {
		autos.apilar("Lanborghini");
		autos.apilar("Jaguar");
		autos.apilar("Honda");
		autos.apilar("Ferrari");
		autos.apilar("Bmw");
		autos.apilar("Audi");
	}
	
	/*
	 * Metodo para añadir los nombres de dos automoviles en orden alfabetico
	 */
	public void añadir() {
		String au1 = "Hyundai";
		String au2 = "Citroen";
		for (int i = autos.tamanio(); i > 0; i--) {
			if(autos.tamanio() == 1 ) {
				break;
			}
			String pal1 = (String)autos.tope();
			int res1 = pal1.compareTo(au2);
			if(res1 < 0) {
				aux.apilar(autos.desapilar());
			}else {
				autos.apilar(au2);
				aux.apilar(autos.desapilar());
				break;
			}
		}
		
		for (int i = autos.tamanio(); i > 0; i--) {
			if(autos.tamanio() == 1 ) {
				break;
			}
			String pal1 = (String)autos.tope();
			int res2 = pal1.compareTo(au1);
			if(res2 < 0) {
				aux.apilar(autos.desapilar());
			}else {
				autos.apilar(au1);
				aux.apilar(autos.desapilar());
				break;
			}
		}
	}
	
	/**
	 * Metodo para devolver los datos almacenados en el aux devuelta a la pila autos
	 */
	public void devolver() {
		for (int i = aux.tamanio(); i > 0; i--) {
			autos.apilar(aux.tope());
			aux.desapilar();
		}
	}
	
	/**
	 * Metodo que imprime los datos contenidos dentro de la pila autos
	 */
	public void imprimir(){
		for (int i = autos.tamanio(); i > 0; i--) {
			System.out.println(autos.tope());
			autos.desapilar();
		}
	}
	
	/**
	 * Metodo que ejecuta los metodos llenar, añadir, devolver e imprimir
	 */
	public void run() {
		llenar();
		añadir();
		devolver();
		imprimir();
	}

}
