package modelo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * 
 * @author Laura Ojeda & Daniel Velasquez
 *
 */
public class OperacionEstudiante implements IOperacionEstudiante{
	private Scanner in;
	private String cadena;
	private String[] est;
	private Map<String, Estudiante> listaEstudiantes = new HashMap<String, Estudiante>(); 
	
	public boolean estado() {
		if(listaEstudiantes.isEmpty()) {
			return true;
		}
		return false;
	}
	
	public void leerArchivo() {
		if(estado()) {
			try{
				in = new Scanner (new File("./data/dataEst.txt"));
				while(in.hasNextLine()) {
					cadena=in.nextLine();
					generarLista(cadena);
				}

			}catch (FileNotFoundException e) {
				e.printStackTrace();
			} 
			System.out.println("Data importada");
		}else {
			System.out.println("Data ya importada");
		}
		
	}
	
	public void generarLista(String cadena) {
		est = cadena.split(" ");
		listarEstudiante(est[0],new Estudiante(est[1], est[2], est[3], est[4], est[5], est[6], Integer.parseInt(est[7]), est[8]));
	}
	
	@Override
	public void listarEstudiante(String id, Estudiante e) {
		listaEstudiantes.put(id, e);
	}

	@Override
	public void mostrarEstudiante(String id) {
		if(listaEstudiantes.entrySet().stream().filter(e->e.getKey().equals(id)).findAny().isPresent()) {
			Map<String, Estudiante> mapaFiltrado = listaEstudiantes.entrySet().stream()
					.filter(e->e.getKey().equals(id))
					.collect(Collectors.toMap(p->p.getKey(), p->p.getValue()));
			System.out.printf("Id \t Estudiante \n");
			mapaFiltrado.forEach((k,v)->System.out.println("" + k+ " "+ v));
		}else {
			System.out.println("El estudiante no esta registrado");
		}
	}

	@Override
	public void actualizarEstudiante(String id) {
		if(listaEstudiantes.entrySet().stream().filter(e->e.getKey().equals(id)).findAny().isPresent()) {
			Scanner leer = new Scanner(System.in);
			System.out.println("Id: " + id);
			System.out.print("Nombre: ");
			String nombre = leer.next();
			System.out.print("Apellido: ");
			String apellido = leer.next();
			System.out.print("Correo personal: ");
			String correoPer = leer.next();
			System.out.print("Correo institucional: ");
			String correoInst = leer.next();
			System.out.print("Numero celular: ");
			String numTel = leer.next();
			System.out.print("Genero: ");
			String genero = leer.next();
			System.out.print("Edad: ");
			int edad = leer.nextInt();
			System.out.print("Programa: ");
			String programa = leer.next();
			
			listarEstudiante(id, new Estudiante(nombre,apellido,correoPer,correoInst,numTel,genero,edad,programa));
			System.out.println("Estudiante actualizado");
		}else {
			System.out.println("El estudiante no esta registrado");
		}
	}

	@Override
	public void anexarEstucianteSiNoExiste(String id, Estudiante e) {
		listaEstudiantes.putIfAbsent(id, e);
	}

	@Override
	public void borrarEstudiante(String id) {
		if(!estado()) {	
			if(listaEstudiantes.entrySet().stream().filter(e->e.getKey().equals(id)).findAny().isPresent()) {
				Map<String, Estudiante> mapaFiltrado = listaEstudiantes.entrySet().stream()
						.filter(e->e.getKey().equals(id))
						.collect(Collectors.toMap(p->p.getKey(), p->p.getValue()));
				listaEstudiantes.remove(mapaFiltrado.entrySet().stream().findFirst().get().getKey());
				System.out.println("El estudiante fue removido");
			}else {
				System.out.println("El estudiante no esta registrado");
			}
		}else {
			System.out.println("La lista esta vacia");
		}
	}

	@Override
	public void consultaPrograma(String programa) {

		if(listaEstudiantes.entrySet().stream().filter(e->e.getValue().getPrograma().equals(programa)).findAny().isPresent()) {
			Map<String, Estudiante> mapaFiltrado = listaEstudiantes.entrySet().stream()
					.filter(e->e.getValue().getPrograma().equals(programa))
					.collect(Collectors.toMap(p->p.getKey(), p->p.getValue()));
			System.out.println("Estudiantes del programa: " + programa);
			System.out.printf("Id \t Estudiante \n");
			mapaFiltrado.forEach((k,v)->System.out.println("" + k+ " "+ v));
			int cont = (int)mapaFiltrado.entrySet().stream().count();
			System.out.println("El numero de estudiantes del programa " + programa + " es: " + cont);
		}else {
			System.out.println("No hay data disponible");
		}
	}

	@Override
	public void consultarGenero(String genero) {
		if(listaEstudiantes.entrySet().stream().filter(e->e.getValue().getGenero().equals(genero)).findAny().isPresent()) {
			Map<String, Estudiante> mapaFiltrado = listaEstudiantes.entrySet().stream()
					.filter(e->e.getValue().getGenero().equals(genero))
					.collect(Collectors.toMap(p->p.getKey(), p->p.getValue()));
			System.out.println("Estudiantes del genero: " + genero);
			System.out.printf("Id \t Estudiante \n");
			mapaFiltrado.forEach((k,v)->System.out.println("" + k+ " "+ v));
			int cont = (int)mapaFiltrado.entrySet().stream().count();
			System.out.println("El numero de estudiantes del genero " + genero + " es: " + cont);
		}else {
			System.out.println("No hay data disponible");
		}
	}

	@Override
	public void consultarRangoEdad(int edadBase, int edadTope) {
		if(listaEstudiantes.entrySet().stream().filter(e -> e.getValue().getEdad()>=edadBase).findAny().isPresent()) {
			Map<String, Estudiante> mapaFiltrado = listaEstudiantes.entrySet().stream()
					.filter(e -> e.getValue().getEdad()>=edadBase)
					.filter(e2 -> e2.getValue().getEdad()<=edadTope)
					.collect(Collectors.toMap(p->p.getKey(), p->p.getValue()));
			System.out.println("Estudiantes entre las edades " + edadBase +  " y " + edadTope);
			System.out.printf("Id \t Estudiante \n");
			mapaFiltrado.forEach((k,v)->System.out.println("" + k+ " "+ v));
		}else {
			System.out.println("No hay data disponible");
		}
	}
	
	
	
	@Override
	public void consultarMenoresEdad() {
		if(listaEstudiantes.entrySet().stream().filter(e -> e.getValue().getEdad()<18).findAny().isPresent()) {
			Map<String, Estudiante> mapaFiltrado = listaEstudiantes.entrySet().stream()
					.filter(e -> e.getValue().getEdad()<18)
					.collect(Collectors.toMap(p->p.getKey(), p->p.getValue()));
			System.out.println("Estudiantes menores de edad");
			System.out.printf("Id \t Estudiante \n");
			mapaFiltrado.forEach((k,v)->System.out.println("" + k+ " "+ v));
		}else {
			System.out.println("No hay data disponible");
		}
	}

	public void imprimir() {
		if(!estado()) {
			System.out.printf("Id \t Estudiante \n");
			listaEstudiantes.entrySet().stream().forEach(System.out::println);
		}else {
			System.out.println("No hay data importada");
		}
	}

}
