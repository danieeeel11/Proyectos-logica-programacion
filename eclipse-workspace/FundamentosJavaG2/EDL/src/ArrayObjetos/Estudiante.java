package ArrayObjetos;

public class Estudiante {
	private int id;
	private String nombre;
	private double nota;
	/**
	 * 
	 * @param id
	 * @param nombre
	 * @param nota
	 */
	public Estudiante(int id, String nombre, double nota) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.nota = nota;
	}
	/**
	 * 
	 * @return
	 */
	public int getId() {
		return id;
	}
	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * 
	 * @return
	 */
	public double getNota() {
		return nota;
	}
	/**
	 * 
	 * @param nota
	 */
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", nombre=" + nombre + ", nota=" + nota + "]";
	}
	
	
}
