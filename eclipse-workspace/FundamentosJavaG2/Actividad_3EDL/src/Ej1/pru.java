package Ej1;

import java.util.Collections;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import TdaPila.TdaPila;

public class pru {
	/*
	public static void main(String[] args) {
		Scanner leerDato =new Scanner(System.in);
		TdaPila miPila = new TdaPila<>();
	}*/
	Scanner leerDato =new Scanner(System.in);
	TdaPila autos = new TdaPila<>();
	TdaPila aux = new TdaPila<>();
	
	public void llenar() {
		autos.apilar("Lanborghini");
		autos.apilar("Jaguar");
		autos.apilar("Honda");
		autos.apilar("Ferrari");
		autos.apilar("Bmw");
		autos.apilar("Audi");
	}
	
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
	/*
	public void añadir2(){
		String au1 = "Hyundai";
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
	}*/
	
	public void devolver() {
		for (int i = aux.tamanio(); i > 0; i--) {
			autos.apilar(aux.tope());
			aux.desapilar();
		}
	}
	
	public void imprimir(){
		for (int i = autos.tamanio(); i > 0; i--) {
			System.out.println(autos.tope());
			autos.desapilar();
		}
	}
	public void run() {
		llenar();
		añadir();
		devolver();
		imprimir();
	}
	
}
