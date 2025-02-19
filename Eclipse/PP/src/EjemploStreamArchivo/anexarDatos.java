package EjemploStreamArchivo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class anexarDatos {
	private List<Persona> personas;
	public anexarDatos() {
	}
	public void anexarDato() {
		System.out.println("Anexar datos I");
		try {
			this.personas = Files.lines(Paths.get("personas2.txt")).map(l->new Persona(l.split(":")[0], Integer.parseInt(l.split(":")[1]))).collect(Collectors.toList());
			
		}catch(IOException exc) {
			System.out.println("Error procesando datos: " + exc.getMessage());
		}
		System.out.println("Personas del archivo:");
		personas.stream().forEach(System.out::println);
	}
	public void anexaDatos2() {
		System.out.println("\nAnexar datos II");
		try {
			personas.add(new Persona("Javier", 32));
			personas.add(new Persona("Esteban", 25));
			Files.write(Paths.get("personas2.txt"),personas.stream().map(p->p.aArchivo()).collect(Collectors.toList()));
			
		}catch(Exception exc) {
			System.out.println("Error procesando datos: " + exc.getMessage());
		}
		System.out.println("Personas del archivo:");
		personas.stream().forEach(System.out::println);
	}
	public static void main(String[] args) {
		anexarDatos arch = new anexarDatos();
		arch.anexarDato();
		arch.anexaDatos2();
	}
}
