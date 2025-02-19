package Ejercicio1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Clase principal que contiene el main del Ejercicio1, que contiene los metodos anexarDato(), anexarDatos2(), borrar(), autosAntiguos(), imprimir(), run()
 * @author Laura Sofia Ojeda Leon & Daniel Felipe Velasquez Rincon
 * @version 2
 * @since 04-05-2021
 */
public class TestPelicula {
	private List<Pelicula> peliculas;
	
	public TestPelicula() {
		
	}
	/**
	 * Metodo que extrae los datos del archivo texto y asignarlo a intancias tipo Pelicula
	 */
	public void extraerPelicula() {
		System.out.println("Anexar datos I");
		try {
			this.peliculas = Files.lines(Paths.get("peliculas.txt")).map(l->new Pelicula(l.split(":")[0],l.split(":")[1], Integer.parseInt(l.split(":")[2]))).collect(Collectors.toList());
			
		}catch(IOException exc) {
			System.out.println("Error procesando datos: " + exc.getMessage());
		}
		System.out.println("Peliculas:");
		peliculas.stream().forEach(System.out::println);
	}
	/**
	 * Metodo para filtrar las peliculas cuyo año de estreno sea en el siglo XXI
	 */
	public void pelisXXI() {
		try {
			List<Pelicula> pelisSigloXXI = peliculas.stream().filter(p->p.getEstreno()>=2000).collect(Collectors.toList());
			Files.write(Paths.get("pelisXXI.txt"),pelisSigloXXI.stream().map(p->p.aArchivo()).collect(Collectors.toList()));
			System.out.println("Listado de las peliculas del siglo XXI:");
			pelisSigloXXI.stream().forEach(System.out::println);
		}catch(Exception exc) {
			System.out.println("Error procesando datos: " + exc.getMessage());
		}
	}
	/**
	 * Metodo para filtrar las peliculas del director Steven Spielberg, obteniendo el titulo
	 */
	public void spielberg() {
		String nombresPeliculasSp = peliculas.stream().filter(p->p.getDirector().equals("Steven Spielberg")).map(p->p.getTitulo()).collect(Collectors.joining(",", "Nombre Peliculas de Steven Spielberg: ", " ..."));
		System.out.println("Peliculas de Steven Spielberg:");
		System.out.println(nombresPeliculasSp);
	}
	/**
	 * Metodo para ordenar las peliculas segun su titulo alfabeticamente
	 */
	public void ordenamientoPeliculas() {
		System.out.println("Peliculas ordenadas alfabeticamente por el titulo:");
		Comparator<Pelicula> cTitulo = (p1,p2)->p1.getTitulo().compareTo(p2.getTitulo());
		peliculas.stream().sorted(cTitulo).forEach(System.out::println);
	}
	/**
	 * Metodo para obtener el titulo de la pelicula cuyo año de estreno sea el mas reciente
	 */
	public void peliculaMasReciente() {
		System.out.println("Pelicula mas reciente:");
		peliculas.stream().sorted((p1,p2)->Integer.compare(p2.getEstreno(), p1.getEstreno())).limit(1).forEach(System.out::println);
	}
	/**
	 * Metodo main para ejecutar los metodos de la clase TestPelicula
	 * @param args
	 */
	public static void main(String[] args) {
		TestPelicula arch = new TestPelicula();
		arch.extraerPelicula();
		System.out.println();
		arch.pelisXXI();
		System.out.println();
		arch.spielberg();
		System.out.println();
		arch.ordenamientoPeliculas();
		System.out.println();
		arch.peliculaMasReciente();
	}

}
