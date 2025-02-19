package Ejercicio1;
/**
 * Clase de tipo pelicula que contiene el titulo, director y año de estreno de la pelicula
 * @author Laura Sofia Ojeda Leon & Daniel Felipe Velasquez Rincon
 * @version 1
 * @since 04-05-2021
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
    
    public String getTitulo()
    {
        return titulo;
    }
    
    public String getDirector()
    {
        return director;
    }
    
    public int getEstreno()
    {
        return estreno;
    }
    
    @Override
    public String toString()
    {
        return titulo + " (" + director + ", " + estreno + ")";
    }
    
    public String aArchivo() {
		return titulo + ":" + director + ":" + estreno;  
	}

}
