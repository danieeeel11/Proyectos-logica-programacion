package Ej1;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Clase que contiene estadisticas de un listado de personas a vacunar
 * @author Laura Sofia Ojeda Leon & Daniel Felipe Velasquez Rincon
 * @version 2
 * @since 15-03-2021
 *
 */

public class ListaVacuna {
	ArrayList<Persona> listaVac = new ArrayList<>();
	ArrayList<Persona> lista1 = new ArrayList<>();
	ArrayList<Persona> lista2 = new ArrayList<>();
	ArrayList<Persona> lista3 = new ArrayList<>();
	private Scanner leerDato = new Scanner(System.in);
	
	/**
	 * Metodo que llena aleatoriamnete la lista de candidatos a vacunarse
	 */
	public void llenarLista() {
		int num1 = 97;
		int num2= 122;
		System.out.println("¿Cuantas personas desea?");
		int a = leerDato.nextInt();
		//char genero;
		for (int i = 0; i < a; i++) {
			int NomAl = (int)Math.floor(Math.random()*(num2-num1)+num1);
			char nombre = (char)NomAl;
			int letraAl = (int)(Math.random()*(3-1)+1);
			char genero;
			if(letraAl == 1) {
				genero = 'M';
			}else {
				genero = 'F';
			}
			int naciAl = (int) (Math.random()*(1962-1947)+1947);
			int nacimiento = naciAl;
			int edad = 2021 - naciAl;
			
			Persona p = new Persona(nombre,genero,nacimiento,edad);
			listaVac.add(p);
		}
		for (Persona persona : listaVac) {
			System.out.println(persona);
		}
	}
	/**
	 * Metodo que extrae los datos para determinar su clasificacion
	 */
	public void extraerDatos() {
		for (int i = 0; i < listaVac.size(); i++) {
			if(listaVac.get(i).getEdad() >= 60 && listaVac.get(i).getEdad() <= 64) {
				char n = listaVac.get(i).getNombre();
				char g = listaVac.get(i).getGenero();
				int na = listaVac.get(i).getNacimiento();
				int e = listaVac.get(i).getEdad();
				Persona p1 = new Persona(n,g,na,e);
				lista1.add(p1);
			}
			if(listaVac.get(i).getEdad() >= 65 && listaVac.get(i).getEdad() <= 69) {
				char n = listaVac.get(i).getNombre();
				char g = listaVac.get(i).getGenero();
				int na = listaVac.get(i).getNacimiento();
				int e = listaVac.get(i).getEdad();
				Persona p2 = new Persona(n,g,na,e);
				lista2.add(p2);
			}
			if(listaVac.get(i).getEdad() >= 70 && listaVac.get(i).getEdad() <= 74) {
				char n = listaVac.get(i).getNombre();
				char g = listaVac.get(i).getGenero();
				int na = listaVac.get(i).getNacimiento();
				int e = listaVac.get(i).getEdad();
				Persona p3 = new Persona(n,g,na,e);
				lista3.add(p3);
			}
		}
	}
	/**
	 * Metodo para obtener las estadisticas de cada listado
	 */
	public void estadisticas() {
		int m1=0;
		int m2=0;
		int m3=0;
		int f1=0;
		int f2=0;
		int f3=0;
		
		for (int i = 0; i < lista1.size(); i++) {
			if(lista1.get(i).getGenero() == 'M') {
				m1++;
			}
			if(lista1.get(i).getGenero() == 'F') {
				f1++;
			}
		}
		int porm1 = (m1*100)/listaVac.size();
		int porf1 = (f1*100)/listaVac.size();
		System.out.println();
		System.out.println("El porcentaje de hombres entre 60 y 64, son: " + porm1);
		System.out.println("El porcentaje de mujeres entre 60 y 64, son: " + porf1);
		
		for (int i = 0; i < lista2.size(); i++) {
			if(lista2.get(i).getGenero() == 'M') {
				m2++;
			}
			if(lista2.get(i).getGenero() == 'F') {
				f2++;
			}
		}
		int porm2 = (m2*100)/listaVac.size();
		int porf2 = (f2*100)/listaVac.size();
		System.out.println();
		System.out.println("El porcentaje de hombres entre 65 y 69, son: " + porm2);
		System.out.println("El porcentaje de mujeres entre 65 y 69, son: " + porf2);
		
		for (int i = 0; i < lista3.size(); i++) {
			if(lista3.get(i).getGenero() == 'M') {
				m3++;
			}
			if(lista3.get(i).getGenero() == 'F') {
				f3++;
			}
		}
		int porm3 = (m3*100)/listaVac.size();
		int porf3 = (f3*100)/listaVac.size();
		System.out.println();
		System.out.println("El porcentaje de hombres entre 70 y 74, son: " + porm3);
		System.out.println("El porcentaje de mujeres entre 70 y 74, son: " + porf3);
		System.out.println();
		System.out.println("El numero de personas a vacunar son: " + listaVac.size());
	}
	
	
}
