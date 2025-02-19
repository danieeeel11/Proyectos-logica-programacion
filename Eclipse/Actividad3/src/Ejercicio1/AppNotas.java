package Ejercicio1;

import java.util.Scanner;

public class AppNotas {

	public static void main(String[] args) {
		Scanner leerDato =new Scanner(System.in);
		
		System.out.println("______DATOS CURSO_______");
		System.out.println("Codigo del curso...");
		int codigoCurso = leerDato.nextInt();
		System.out.println("Nombre programa...");
		String nombreProg = leerDato.next();
		System.out.println("Grupo...");
		String grupo = leerDato.next();
		
		System.out.println("------------------------");
		System.out.println("____DATOS ASIGNATURA____");
		System.out.println("Codigo asignatura...");
		int codigoAsig = leerDato.nextInt();
		System.out.println("Denominacion asignatura...");
		String denoAsig = leerDato.next();
		Asignatura asignatura =new Asignatura(codigoAsig, denoAsig);
		
		System.out.println("------------------------");
		System.out.println("____DATOS PROFESORES____");
		System.out.println("Id profesor...");
		int idProf = leerDato.nextInt();
		System.out.println("Nombre profesor...");
		String nombreProf = leerDato.next();
		System.out.println("Profesion...");
		String profesion = leerDato.next();
		Profesor profesor =new Profesor(idProf, nombreProf, profesion);
		
		Curso miCurso =new Curso(codigoCurso, nombreProg, grupo, asignatura, profesor);
		
		System.out.println("¿Cuantos estudiantes?");
		int nEst =leerDato.nextInt();
		
		
		System.out.println("------------------------");
		System.out.println("Favor digitar las notas en decimas, ej: 3.5, 4.7, 4, etc...");
		System.out.println("------------------------");
		System.out.println("____DATOS ESTUDIANTES___");
		for(int i=0; i<nEst; i++) {
			System.out.println("Id estudiante...");
			int idEst = leerDato.nextInt();
			System.out.println("Nombre estudiante...");
			String nombreEst = leerDato.next();
			System.out.println("Apellido estudiante...");
			String apellidoEst = leerDato.next();
			System.out.println("Nota primer corte...");
			float c1 = leerDato.nextFloat();
			System.out.println("Nota segundo corte...");
			float c2 = leerDato.nextFloat();
			System.out.println("Nota tercer corte...");
			float c3 = leerDato.nextFloat();
			System.out.println(" ");
			
			miCurso.agregarEst(idEst, nombreEst, apellidoEst, c1, c2, c3);
		}
		
		System.out.println("------------------------");
		System.out.println("------------------------");
		System.out.println("___LISTA ESTUDIANTES____");
		System.out.println(miCurso.getCodigoCurso() + " - " + miCurso.getAsignatura().getDenoAsig()
				+ " - " + miCurso.getGrupo() + " - " + miCurso.getProfesor().getNombreProf());
		System.out.println(" ");
		for(int i=0; i< miCurso.getEstudiantes().size(); i++)
		{
			System.out.println(miCurso.getEstudiantes().get(i).getIdEst() + " " + 
			miCurso.getEstudiantes().get(i).getNombreEst() + " " + miCurso.getEstudiantes().get(i).getApellidoEst()
			+ " " + miCurso.getEstudiantes().get(i).getC1() + " " + miCurso.getEstudiantes().get(i).getC2()
			+ " " + miCurso.getEstudiantes().get(i).getC3() + " - NotaFinal -> " + miCurso.getEstudiantes().get(i).getNotaFinal()
			+ " - " + miCurso.getEstudiantes().get(i).getApono());
		}
		System.out.println("Promedio Curso..." + miCurso.getPromedioCurso());
		
		
		System.out.println("-----------------------");
		System.out.println("-----------------------");
		System.out.println("__LISTA ESTUDIANTES APROB C2__");
		System.out.println(miCurso.getCodigoCurso() + " - " + miCurso.getAsignatura().getDenoAsig()
				+ " - " + miCurso.getGrupo() + " - " + miCurso.getProfesor().getNombreProf());
		System.out.println(" ");
		for(int i=0; i< miCurso.getEstudiantes().size(); i++) {
			if(miCurso.getEstudiantes().get(i).getC2()>3.0) {
				System.out.println(miCurso.getEstudiantes().get(i).getIdEst() + " " +
				miCurso.getEstudiantes().get(i).getNombreEst() + " " + miCurso.getEstudiantes().get(i).getApellidoEst()
				+ " " + miCurso.getEstudiantes().get(i).getC2());
			}else {
				System.out.println(".");
			}
		}
		System.out.println("Promedio estudiantes con C2 aprobado..." + miCurso.getPromedioC2());
		
		
	}

}
