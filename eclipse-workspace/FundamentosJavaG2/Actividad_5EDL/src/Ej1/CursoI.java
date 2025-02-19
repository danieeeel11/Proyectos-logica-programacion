package Ej1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Clase principal que contiene el main del Ejercicio1, que contiene los metodos contendidos en el run()
 * Se ejecutan operaciones con un listado de la clase Estudiante
 * @author Laura Sofia Ojeda Leon & Daniel Felipe Velasquez Rincon
 * @version 2
 * @since 14-05-2021
 */
public class CursoI {
	private static String grupo;
	private static String asignatura = "Estructura de datos lineales";
	private static ArrayList<EstudianteI> estudiantes = new ArrayList<EstudianteI>();
	static Scanner leerDato =new Scanner(System.in);
	
	/**
	 * Constructor de la clase
	 * @param grupo
	 * @param asignatura
	 */
	public CursoI(String grupo, String asignatura) {
		super();
		this.grupo = grupo;
		this.asignatura = asignatura;
	}
	/**
	 * Metodo String para generar nombres aleatorios
	 * @return el nombre generado
	 */
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
	/**
	 * Metodo String para generar grupos aleatorios
	 * @return el grupo generado
	 */
	public static String grupoAle() {
		String[] grupos = { "R-01", "R-02", "R-03", "R-04"};
		grupo = grupos[(int)(Math.floor(Math.random()*((grupos.length-1)-0+1)+0))];
		return grupo; 
	}
	/**
	 * Metodo para agregar estudiantes a la lista de estudiantes
	 */
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
			EstudianteI est = new EstudianteI(id,nombre,nota);
			estudiantes.add(est);
		}
		
	}
	/**
	 * Metodo para mostrar por pantalla lo contenido en el listado
	 */
	public static void mostrar() {
		estudiantes.forEach(System.out::println);
	}
	/**
	 * Metodo para ordenar el listado por el nombre de los estudiantes
	 */
	public static void orderNom() {
		System.out.println("Lista de estudiantes ordenados por el nombre: ");
		Collections.sort(estudiantes);
		estudiantes.forEach(System.out::println);
	}
	/**
	 * Metodo para ordenar el listado por la nota final de los estudiantes
	 */
	public static void orderNotaFinal() {
		Comparator<EstudianteI> ordNotaFinal = (p1,p2)->Float.compare(p2.getNotas().getNotaFinal(),p1.getNotas().getNotaFinal());
		estudiantes.sort(ordNotaFinal);
		//mostrar();
	}
	/**
	 * Metodo para obtener los estudiantes cuya nota final esta en el rango de 40 a 50
	 */
	public static void range() {
		System.out.println("Lista de estudiantes cuya nota final esta entre 40 y 50: ");
		orderNotaFinal();
		int i=0;
		for (EstudianteI es : estudiantes) {
			if(es.getNotas().getNotaFinal()>=40) {
				i++;
			}
		}
		if(i==0) {
			System.out.println("No hay estudiantes en el rango");
		}
		estudiantes.subList(0,i).forEach(System.out::println);
	}
	/**
	 * Metodo para obtener los estudiantes cuya nota final esta en un rango especifico
	 */
	public static void rangeEspe() {
		System.out.println("En que rango de notas quiere buscar?");
		System.out.print("De: ");
		int de = leerDato.nextInt();
		System.out.print("A: ");
		int a = leerDato.nextInt();
		int i=0;
		for (EstudianteI es : estudiantes) {
			if(es.getNotas().getNotaFinal()>=de && es.getNotas().getNotaFinal()<=a) {
				System.out.println(es);
				i++;
			}
		}
		if(i==0) {
			System.out.println("No hay estudiantes en el rango");
		}
	}
	/**
	 * Metodo run donde se emplea un menu de opciones para ejecutar los metodos contenidos
	 */
	public static void run() {
		int op=0;
		boolean salir = false;
		grupo = grupoAle();
		System.out.println("ASIGNATURA: " + asignatura + " GRUPO: " + grupo);
		System.out.println("----------------------------------------------");
		agregarEst();
		System.out.println("----------------------------------------------");
		while(!salir) {
			System.out.println("1. Agregar al listado de estudiantes");
			System.out.println("2. Lista de estudiantes ordenados por el nombre");
			System.out.println("3. Lista de estudiantes ordenados la nota final (mayor a menor)");
			System.out.println("4. Lista de estudiantes cuyo rango de nota final es alto (40 a 50)");
			System.out.println("5. Lista de estudiantes con nota final en un rango especifico");
			System.out.println("6. Salir");
			System.out.println("Digite una opcion");
			op = leerDato.nextInt();
			switch(op) {
				case 1:
					agregarEst();
					break;
				case 2:
					orderNom();
					break;
				case 3:
					System.out.println("Lista de estudiantes ordenados por la nota final: ");
					orderNotaFinal();
					mostrar();
					break;
				case 4:
					range();
					break;
				case 5:
					rangeEspe();
					break;
				case 6:
					salir = true;
					break;
				default:
					System.out.println("Digite un numero entre 1 y 6");
					break;
			}
			System.out.println("___________");
			System.out.println(" ");
		}
	}
	/**
	 * Metodo main donde se ejecuta el metodo run()
	 * @param args
	 */
	public static void main(String[] args) {
		run();
	}

}
