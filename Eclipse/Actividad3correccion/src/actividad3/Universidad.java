package actividad3;

import java.util.Scanner;

public class Universidad {
	private Scanner leerDato =new Scanner(System.in);
	private Curso curso;
	/**
	 * 
	 * @param codigo 
	 * @param programa
	 * @param grupo
	 * @param numero
	 */
	public Universidad(int codigo, String programa, String grupo, int numero) {
		// Se crea por composición una instancia de la clase Curso
		this.curso =new Curso(codigo,programa,grupo,numero);
	
	}
	/**
	 * Método menu de opciones para acceso a las opciones del programa
	 */
	public void run() {
		int opc = 0;
		boolean salir=false;
		while(!salir) {
			System.out.println(this.curso);
			System.out.println("1. Agregar Asignatura ");
			System.out.println("2. Agregar Docente");
			System.out.println("3. Agregar Estudiante ");
			System.out.println("4. Buscar Estudiante");
			System.out.println("5. Lista de Notas");
			System.out.println("6. Notas por Rango");
			System.out.println("7. Salir");
			System.out.print("Entrar una de las opciones");
			opc = leerDato.nextInt();
			switch (opc) {
				case 1:
					agregarAsignatura();break;
				case 2:
					agregarDocente();
					;break;
				case 3:
					agregarEstudiante();
					;break;
				case 4:
					buscarEstudiante();
					;break;
				case 5:
					curso.mostrarArregloEstudiante();
					break;
				case 6:
					notaRango();
					break;
				case 7:
					salir=true;
					break;	
				default: 
					System.out.println("Solo números entre 1 y 7");break; 
		   }
		}
		
		
		
	}
	/**
	 * 
	 * 
	 */
	private void notaRango() {
		// TODO Auto-generated method stub
		System.out.println("Lista de Notas por Rango");
		System.out.println("Rango Incial");
		double desde = leerDato.nextDouble();
		System.out.println("Rango Final");
		double hasta = leerDato.nextDouble();
		
		curso.mostrarNotasRango(desde, hasta);
		
	}
	/**
	 * 
	 */
	private void buscarEstudiante() {
		// TODO Auto-generated method stub
		System.out.println("Busqueda de Estudiante");
		System.out.println("Ingrese el nombre del Estudiante");
		String nombre = leerDato.next();
		
		
		
		
		
	}
	/**
	 * Método 
	 */
	private void agregarEstudiante() {
		// TODO Auto-generated method stub
		System.out.println("Datos del Estudiante");
		System.out.println("Identificación ");
		int id = leerDato.nextInt();
		System.out.println("Nombre ");
		String nombre =leerDato.next();
		System.out.println("Apellido ");
		String apellido = leerDato.next();
		System.out.println("Notas del Estudiante C1, C2, C3");
		
		double[] notas =new double[3];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Entrar la nota ");
			notas[i] = leerDato.nextDouble();
		}
		
		Estudiante miEstudiante =new Estudiante(id,nombre,apellido,notas);
		//Método de la clase Curso
		curso.agregarEstudiante(miEstudiante);
		
	}
	/**
	 * 
	 */
	private void agregarDocente() {
		// TODO Auto-generated method stub
		System.out.println("Datos del Docente");
		System.out.println("Identificación ");
		int id = leerDato.nextInt();
		System.out.println("Nombre ");
		String nombre = leerDato.next();
		System.out.println("Profesión ");
		String profesion = leerDato.next();
		
		Docente miDocente =new Docente(id,nombre,profesion);
		
		curso.setDocente(miDocente);
	}
	/**
	 * Método para agregar una instancia de la clase Asignutura a una instancia de la clase Curso. 
	 */
	private void agregarAsignatura() {
		// TODO Auto-generated method stub
		System.out.println("Datos de la Asignatura");
		System.out.println("Codigo ");
		int codigo = leerDato.nextInt();
		System.out.println("Denominación ");
		String denominacion = leerDato.next();
		
		Asignatura miAsignatura =new Asignatura(codigo,denominacion);
		
		curso.setAsignatura(miAsignatura);
	
	}
	

}
