package EjemploStreamArchivo;


import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Programa principal donde se cargan unas personas de un archivo
 */
public class Main {
	public static void main(String[] args) {
		try {
			List<Persona> personas = Files.lines(Paths.get("personas.txt")).map(l->new Persona(l.split(":")[0], Integer.parseInt(l.split(":")[1]))).collect(Collectors.toList());
			System.out.println("Personas registradas en el archivo");
			personas.stream().forEach(System.out::println);
		}catch(Exception exc) {
			
		}
		
	}

} 
