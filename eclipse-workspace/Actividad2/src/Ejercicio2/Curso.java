package Ejercicio2;

public class Curso {
	private int codigoCurso;
	private String nombreAsignatura;
	private String grupo;
	/**
	 * @param codigoCurso
	 * @param nombreAsignatura
	 * @param grupo
	 */
	public Curso(int codigoCurso, String nombreAsignatura, String grupo) {
		super();
		this.codigoCurso = codigoCurso;
		this.nombreAsignatura = nombreAsignatura;
		this.grupo = grupo;
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
	 * @return the nombreAsignatura
	 */
	public String getNombreAsignatura() {
		return nombreAsignatura;
	}
	/**
	 * @param nombreAsignatura the nombreAsignatura to set
	 */
	public void setNombreAsignatura(String nombreAsignatura) {
		this.nombreAsignatura = nombreAsignatura;
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
	
	

}
