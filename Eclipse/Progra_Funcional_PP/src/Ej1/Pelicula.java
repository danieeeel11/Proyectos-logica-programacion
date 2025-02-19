package Ej1;
/**
 * Clase pelicula que contiene las instancias titulo, director y estreno
 * @author Laura Sofia Ojeda Leon & Daniel Felipe Velasquez Rincon
 * @version 2
 * @since 18-03-2021
 */
public class Pelicula {
	private String titulo;
    private String director;
    private int estreno;
    
    public Pelicula(String titulo, String director, int estreno)
    {
        this.titulo = titulo;
        this.director = director;
        this.estreno = estreno;
    }
    
    public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getEstreno() {
		return estreno;
	}
	public void setEstreno(int estreno) {
		this.estreno = estreno;
	}
    
    @Override
    public String toString()
    {
        return titulo + " (" + director + ", " + estreno + ")";
    }
}
