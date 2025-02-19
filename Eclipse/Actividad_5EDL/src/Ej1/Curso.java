package Ej1;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;



public class Curso {
	private static String grupo;
	private static String asignatura = "Estructura de datos lineales";
	private static Queue<Estudiante> estudiantes= new PriorityQueue<Estudiante>();
	private static Queue<Estudiante> auxEst = new PriorityQueue<Estudiante>();
	static Scanner leerDato =new Scanner(System.in);
	
	
	public Curso(String grupo, String asignatura) {
		super();
		this.grupo = grupo;
		this.asignatura = asignatura;
		//this.estudiantes = estudiantes;
	}
	public static String nomAleatorio() {
		String aleaNom = new String();
		String[] nombres = { "Andrea", "David", "Baltasar", "Barry", "Bartolomeo",
				"Carlos", "Zaramay", "Marcos", "Davinson", "Polo", "Pepito", "Pachito", 
				"Carlota", "Estefania", "Gabriel", "Dayana", "Hulio", "Roco"};
		String[] apellidos = { "Ruiz", "Guerrero", "Cardenas", "Montoya", "Cuccitini", 
				"Dos Santos", "Gaucho", "Rodriguez","Garcia", "Sanchez", "Cantona", 
				"McKennie", "Araujo", "Alba", "Lavezzi", "Ramos", "Paez", "Montero" };
		aleaNom = nombres[(int)(Math.floor(Math.random()*((nombres.length-1)-0+1)+0))] + " "+ apellidos[(int)(Math.floor(Math.random()*((apellidos.length-1)-0+1)+0))];
		return aleaNom;
	}
	
	public static String grupoAle() {
		String[] grupos = { "R-01", "R-02", "R-03", "R-04"};
		grupo = grupos[(int)(Math.floor(Math.random()*((grupos.length-1)-0+1)+0))];
		return grupo; 
	}

	public static void agregarEst() {
		System.out.println("\nCuantos estudiantes son en el curso?");
		int n = leerDato.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("Identificacion: ");
			//int id = leerDato.nextInt();
			int id = (int) (Math.random()*(1999999999-1000000000+1)+1000000000);
			System.out.print(id);
			System.out.print("\nNombre: ");
			//String nombre = leerDato.next();
			String nombre = nomAleatorio();
			System.out.print(nombre);
			System.out.print("\nNota de la actividad 1: ");
			//double act1 = leerDato.nextDouble();
			int act1= (int) (Math.random()*(50-10+1)+10);
			System.out.print(act1);
			System.out.print("\nNota de la actividad 2: ");
			int act2 = (int) (Math.random()*(50-10+1)+10);
			System.out.print(act2);
			System.out.print("\nNota de la actividad 3: ");
			int act3 = (int) (Math.random()*(50-10+1)+10);
			System.out.print(act3);
			System.out.println("\n");
			Notas nota = new Notas(act1,act2,act3);
			nota.setNotaFinal();
			Estudiante est = new Estudiante(id,nombre,nota);
			//System.out.println(est);
			estudiantes.add(est);
		}
		
	}
	
	public static void ordBurbujaNotaFinal(Queue<Estudiante> estudiantes) {
		Estudiante[] aux = new Estudiante[estudiantes.size()]; 
		int c=0;
		int tam = estudiantes.size();
		Estudiante est;
		boolean b=false;
		
		while(estudiantes.size()>0) {
			aux[c] = estudiantes.remove();
			c++;
		}
		
		while(!b) {
			b=true;
			for (int i = 0; i <tam-1; i++) {
				//float a1 = aux[i].getNotas().getNotaFinal();
				//System.out.print(a1);
				//float a2 = aux[i+1].getNotas().getNotaFinal();
				//System.out.println(" " +a2);
				/*if(a1 > a2) {
				//if((int)aux[i].getNotas().getNotaFinal() > (int)aux[i+1].getNotas().getNotaFinal()) {
					est = aux[i];
					aux[i] = aux[i+1];
					aux[i+1] = est;
					b = false;
				}*/
				/*if(a2 > a1) {
					est = aux[i+1];
					aux[i+1] = aux[i];
					aux[i] = est;
					b = false;
				}*/
				if(aux[i+1].getNotas().getNotaFinal() > aux[i].getNotas().getNotaFinal()) {
					est = aux[i+1];
					aux[i+1] = aux[i];
					aux[i] = est;
					b = false;
				}
			}
		}
		for (int i = 0; i < tam; i++) {
			estudiantes.add(aux[i]);
			//System.out.println(aux[i]);
			Estudiante e = estudiantes.poll();
			auxEst.add(e);
			System.out.println(e);
			//System.out.println(estudiantes.peek());
		}
		devolver();
	}
	
	public static void rango() {
		//ordBurbujaNotaFinal(estudiantes);
		int tam = estudiantes.size();
		for (int i = 0; i < tam; i++) {
			Estudiante e = estudiantes.peek();
			//Estudiante e = estudiantes.remove();
			if(e.getNotas().getNotaFinal()>=40.0) {
				auxEst.add(e);
				//System.out.println(e);
			}
			
			estudiantes.remove();
		}
		devolver();
		if(estudiantes.isEmpty()) {
			System.out.println("No hay estudiantes en el rango");
		}
		imprimir();
		//imprimirAux();
	}
	
	public static void devolver() {
		for (int i = auxEst.size(); i > 0; i--) {
			estudiantes.add(auxEst.peek());
			auxEst.remove();
		}
	}
	
	public static void imprimir() {
		int tam = estudiantes.size();
		for (int i = tam; i > 0; i--) {
			System.out.println(estudiantes.peek());
			estudiantes.remove();
			//auxEst.add(estudiantes.remove());
		}
		devolver();
	}
	
	public static void main(String[] args) {
		grupo = grupoAle();
		System.out.println("ASIGNATURA: " + asignatura + " GRUPO: " + grupo);
		agregarEst();
		System.out.println("Lista de estudiantes ordenados por el nombre");
		while(!estudiantes.isEmpty()) {
			Estudiante i = estudiantes.remove();
			auxEst.add(i);
			System.out.println(i);
		}
		devolver();
		System.out.println("\nLista de estudiantes ordenados la nota final");
		ordBurbujaNotaFinal(estudiantes);
		System.out.println("\nLista de estudiantes cuyo rango de nota final es alto (45 a 50)");
		rango();
	}
	
}
