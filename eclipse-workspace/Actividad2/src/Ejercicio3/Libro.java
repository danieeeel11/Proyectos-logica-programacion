package Ejercicio3;
/**
 * Programa la clase Libro para crear objetos
 * @author Daniel Felipe Velásquez Rincón
 * @since 2020-08-28
 * @version 1
 *
 */

public class Libro {
	private String titulo;
	private int isbn;
	private String nombreLibro;
	private int edicion;
	private int paginas;
	private Autor autor;
	/**
	 * Constructor
	 * @param titulo
	 * @param isbn
	 * @param nombreLibro
	 * @param edicion
	 * @param paginas
	 * @param autor
	 */
	public Libro(String titulo, int isbn, String nombreLibro, int edicion, int paginas, Autor autor) {
		super();
		this.titulo = titulo;
		this.isbn = isbn;
		this.nombreLibro = nombreLibro;
		this.edicion = edicion;
		this.paginas = paginas;
		this.autor = autor;
	}
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * @return the isbn
	 */
	public int getIsbn() {
		return isbn;
	}
	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	/**
	 * @return the nombreLibro
	 */
	public String getNombreLibro() {
		return nombreLibro;
	}
	/**
	 * @param nombreLibro the nombreLibro to set
	 */
	public void setNombreLibro(String nombreLibro) {
		this.nombreLibro = nombreLibro;
	}
	/**
	 * @return the edicion
	 */
	public int getEdicion() {
		return edicion;
	}
	/**
	 * @param edicion the edicion to set
	 */
	public void setEdicion(int edicion) {
		this.edicion = edicion;
	}
	/**
	 * @return the paginas
	 */
	public int getPaginas() {
		return paginas;
	}
	/**
	 * @param paginas the paginas to set
	 */
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	/**
	 * @return the autor
	 */
	public Autor getAutor() {
		return autor;
	}
	/**
	 * @param autor the autor to set
	 */
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	

}
