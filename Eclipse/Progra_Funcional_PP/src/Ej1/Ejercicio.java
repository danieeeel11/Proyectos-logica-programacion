package Ej1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * Clase principal que contiene los metodos mostrar, que funciona para imprimir las peliculas ordenadas de acuerdo a lo solicitado
 * y el metodo main donde se realizan las operaciones con arreglos
 * @author Laura Sofia Ojeda Leon & Daniel Felipe Velasquez Rincon
 * @version 2
 * @since 18-03-2021
 */

public class Ejercicio {
	/**
	 * Metodo para mostrar el listado de peliculas ordenados segun sea el requerimento
	 * @param peliculas
	 * @param c
	 */
	static void mostrar(List<Pelicula> peliculas, Consumer c){
		for (Pelicula pelis : peliculas) {
			System.out.println(pelis);
		}
    }
    /**
     * Metodo main para realizar las operaciones necesarias con el listado de peliculas
     * @param args
     */
    public static void main(String[] args)
    {
        List<Pelicula> peliculas = new ArrayList<>();
        peliculas.add(new Pelicula("E.T.", "Steven Spielberg", 1982));
        peliculas.add(new Pelicula("Avatar", "James Cameron", 2009));
        peliculas.add(new Pelicula("Salvar al soldado Ryan", "Steven Spielberg", 1998));
        peliculas.add(new Pelicula("Origen", "Christopher Nolan", 2010));
        peliculas.add(new Pelicula("L.A. Confidential", "Curtis Hanson", 1997));
        
        //Ordenar peliculas de más reciente a más antigua con expresion lambda
		peliculas.sort((o1,o2) -> o2.getEstreno()-o1.getEstreno());
		System.out.println("\nPeliculas ordenadas de más reciente a más antigua");
		Consumer<Pelicula> imprimir = System.out::println;
		mostrar(peliculas, imprimir);
		
		//Ordenar peliculas por director de forma ascendente, en caso de igual director se ordena por nombre de pelicula de forma ascendete tambien, utilizando una expresion lambda
		Comparator<Pelicula> cDirector = (pe1,pe2) -> pe1.getDirector().compareTo(pe2.getDirector());
		Comparator<Pelicula> cTitulo = (pe1,pe2) -> pe1.getTitulo().compareTo(pe2.getTitulo());
		peliculas.sort(cDirector.thenComparing(cTitulo));
		System.out.println("\nPeliculas ordenadas por director de forma ascendente y luego por titulo");
		Consumer<Pelicula> imprimir1 = System.out::println;
		mostrar(peliculas, imprimir1);
    }

}
