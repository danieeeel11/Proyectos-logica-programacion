package Automata;

import java.util.Scanner;

public class Automata {

	private String cadena;
	private char[] cadenaAutomata;
	private int contador;
	private boolean aceptado;
	
	public Automata() {
		this.cadena = "001111110";
		this.cadenaAutomata = cadena.toCharArray();
		this.contador = 0;
		this.aceptado = false;
	}
	
	public Automata(String cadena) {
		
		this.cadena = cadena;
		this.cadenaAutomata = cadena.toCharArray();
		this.contador = 0;
		this.aceptado = false;
		
	}
	
	public String getCadena(String cadena) {
		return cadena;
	}
	
	public void setCadena(String cadena) {
		this.cadena = cadena;
		this.cadenaAutomata = cadena.toCharArray();
		this.contador = 0;
		this.aceptado = false;
	}
	
	public void evaluarCadena() {
		this.aceptado = false;
		this.contador = 0;
		evaluarEstadoCero();
		if(!aceptado) {
			System.out.println(cadena + ", La cadena no esta definida"
					+ " en el automata");
		}else {
			System.out.println(cadena + ", La cadena si esta definida"
					+ " en el automata");
		}
	}
	
	private void evaluarEstadoCero() {
		
		System.out.println("Estado so");
		if(contador < cadenaAutomata.length) {
			if(cadenaAutomata[contador] == '1'){
				contador ++;
				evaluarEstadoCero();
				}else if(cadenaAutomata[contador]=='0'){
					contador ++;
					evaluarEstadoUno();
				}
			}
		
	}
	private void evaluarEstadoUno() {
		if(contador < cadenaAutomata.length) {
			System.out.println("Estado s1");
			if(cadenaAutomata[contador]=='1') {
				contador ++;
				evaluarEstadoUno();
			}else if(cadenaAutomata[contador]=='0') {
				contador++;
				evaluarEstadoDos();
			}
		}
	}
	
	private void evaluarEstadoDos() {
		
		System.out.println("Estado s2");
		if(contador < cadenaAutomata.length) {
			while(contador < cadenaAutomata.length) {
				if(cadenaAutomata[contador] == '1') {
					contador ++;
				}else {
					break;
				}
			}
			if(cadenaAutomata[contador]=='0') {
				contador++;
				evaluarEstadoTres();
			}
		}
		
	}
	
	private void evaluarEstadoTres() {
		System.out.println("Estado s3 aceptacion");
		this.aceptado = true;
		if(contador < cadenaAutomata.length) {
			if(cadenaAutomata[contador]=='1') {
				contador ++;
				evaluarEstadoTres();
			}else if(cadenaAutomata[contador]=='0') {
				contador ++;
				evaluarEstadoError();
			}
		}
		
	}
	private void evaluarEstadoError() {
		System.out.println("Estado de error");
		this.aceptado = false;
		
	}
	public static void main(String[ ] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite Cadena ");
		String cadena = in.next();
		Automata unAutomata = new Automata(cadena);
		unAutomata.evaluarCadena();
	}

}
