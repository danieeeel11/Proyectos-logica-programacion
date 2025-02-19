package Ejercicio2;

import java.util.Scanner;

public class AppNotas {
	public static Scanner leerDato= new Scanner(System.in);

	public static void main(String[] args) {
		int nEstudiante=3;
		Estudiante estudiante1 =null;
		Estudiante estudiante2 =null;
		Estudiante estudiante3 =null;
		
		System.out.println("Datos del curso ");
		System.out.println("Codigo ");
		int codigo= leerDato.nextInt();
		System.out.println("Nombre asignatura ");
		leerDato.nextLine();
		String asignatura= leerDato.nextLine();
		System.out.println("Grupo ");
		leerDato.nextLine();
		String grupo= leerDato.nextLine();
		
		Curso miCurso =new Curso(codigo, asignatura, grupo);
		
		do {
			System.out.println(miCurso.getNombreAsignatura()+ " Grupo " + miCurso.getGrupo());
			System.out.println("Datos de los estudiantes ");
			System.out.println("Identificacion ");
			int id =leerDato.nextInt();
			System.out.println("Nombre ");
			leerDato.nextLine();
			String nombre =leerDato.nextLine();
			System.out.println("Nota primer corte");
			double nota =leerDato.nextDouble();
			
			if(nEstudiante==3) {
				estudiante1 =new Estudiante(id, nombre, nota, miCurso);
			}
			if(nEstudiante==2) {
				estudiante2 =new Estudiante(id, nombre, nota, miCurso);
			}
			if(nEstudiante==1) {
				estudiante3 =new Estudiante(id, nombre, nota, miCurso);
			}
			nEstudiante--;
		}while(nEstudiante>0);
		
		/**
		 * Muestra los datos de las tres instancias
		 */
		System.out.println("Datos de los estudiantes");
		mostrarDatos(estudiante1);
		mostrarDatos(estudiante2);
		mostrarDatos(estudiante3);
		/**
		 * Encuentra la mayor nota de las tres instancias
		 */
		Estudiante estudianteM;
		if(estudiante1.getNotaCorte1() > estudiante2.getNotaCorte1() && estudiante1.getNotaCorte1() > estudiante3.getNotaCorte1()) {
			estudianteM = estudiante1;
		} else if(estudiante2.getNotaCorte1() > estudiante1.getNotaCorte1() && estudiante2.getNotaCorte1() > estudiante3.getNotaCorte1()){
			estudianteM = estudiante2;			
		} else {
			estudianteM = estudiante3;
		}
		System.out.println(" ");
		System.out.println("El estudiante con mayor nota es ");
		mostrarNombre(estudianteM);
	
	
	}
	
    public static void mostrarNombre(Estudiante estudiante) {
    	System.out.println("El estudiante " + estudiante.getNombre() + " tuvo la mayor nota de: " + estudiante.getNotaCorte1());
    }
	public static void mostrarDatos(Estudiante estudiante) {
		System.out.println("Para el estudiante " + estudiante.getNombre() + " del curso " + estudiante.getCurso().getCodigoCurso() + " asignatura " + estudiante.getCurso().getNombreAsignatura() + " la nota final es: " + estudiante.getNotaCorte1());
		
	}

}
