package Ejercicio2;

public class Estudiante {
	private int id;
	private String nombre;
	private double notaCorte1;
	private Curso curso;
	/**
	 * @param id
	 * @param nombre
	 * @param notaCorte1
	 * @param curso
	 */
	public Estudiante(int id, String nombre, double notaCorte1, Curso curso) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.notaCorte1 = notaCorte1;
		this.curso = curso;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the notaCorte1
	 */
	public double getNotaCorte1() {
		return notaCorte1;
	}
	/**
	 * @param notaCorte1 the notaCorte1 to set
	 */
	public void setNotaCorte1(double notaCorte1) {
		this.notaCorte1 = notaCorte1;
	}
	/**
	 * @return the curso
	 */
	public Curso getCurso() {
		return curso;
	}
	/**
	 * @param curso the curso to set
	 */
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	

}
