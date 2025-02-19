package Ejercicio1;

import java.util.ArrayList;

public class Curso {
	private int codigoCurso;
	private String nombreProg;
	private String grupo;
	private Asignatura asignatura;
	private Profesor profesor;
	//private Estudiante[] estudiantes;
	ArrayList<Estudiante> estudiantes;
	
	
	private float promedioCurso;
	private float promedioC2;
	
	/**
	 * @param codigoCurso
	 * @param nombreProg
	 * @param grupo
	 * @param asignatura
	 * @param profesor
	 * @param estudiantes
	 */
	public Curso(int codigoCurso, String nombreProg, String grupo, Asignatura asignatura, Profesor profesor) {
		super();
		this.codigoCurso = codigoCurso;
		this.nombreProg = nombreProg;
		this.grupo = grupo;
		this.asignatura = asignatura;
		this.profesor = profesor;
		
		this.estudiantes = new ArrayList<>();
	}
	
	public void agregarEst(int idEst, String nombreEst, String apellidoEst, float c1, float c2, float c3){
		estudiantes.add(new Estudiante(idEst,nombreEst,apellidoEst,c1,c2,c3));
	}
	
	
	public float getPromedioCurso() {
		setPromedioCurso();
		return promedioCurso;
	}
	
	public void setPromedioCurso() {
		for(int i=0; i<estudiantes.size(); i++) {
			this.promedioCurso = estudiantes.get(i).getNotaFinal();
		}
		this.promedioCurso = promedioCurso/estudiantes.size();
	}
	
	public float getPromedioC2() {
		setPromedioC2();
		return promedioC2;
	}
	public void setPromedioC2( ) {
		int n=0;
		for(int i=0; i<estudiantes.size(); i++) {
			if(estudiantes.get(i).getC2()>3.0)
			{
				this.promedioC2 =estudiantes.get(i).getC2()+promedioC2;
				n++;
			}
		}
		this.promedioC2 = promedioC2/n;
	}



	/**
	 * @return the codigoCurso
	 */
	public int getCodigoCurso() {
		return codigoCurso;
	}



	/**
	 * @param codigoCurso the codigoCurso to set
	 */
	public void setCodigoCurso(int codigoCurso) {
		this.codigoCurso = codigoCurso;
	}



	/**
	 * @return the nombreProg
	 */
	public String getNombreProg() {
		return nombreProg;
	}



	/**
	 * @param nombreProg the nombreProg to set
	 */
	public void setNombreProg(String nombreProg) {
		this.nombreProg = nombreProg;
	}



	/**
	 * @return the grupo
	 */
	public String getGrupo() {
		return grupo;
	}



	/**
	 * @param grupo the grupo to set
	 */
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}



	/**
	 * @return the asignatura
	 */
	public Asignatura getAsignatura() {
		return asignatura;
	}



	/**
	 * @param asignatura the asignatura to set
	 */
	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}



	/**
	 * @return the profesor
	 */
	public Profesor getProfesor() {
		return profesor;
	}



	/**
	 * @param profesor the profesor to set
	 */
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	/**
	 * @return the estudiantes
	 */
	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	/**
	 * @param estudiantes the estudiantes to set
	 */
	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}
	
}
