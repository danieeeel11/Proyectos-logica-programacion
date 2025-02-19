package Ejercicio1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Clase principal que contiene el main del Ejercicio1, que contiene los metodos anexarDato(), anexarDatos2(), borrar(), autosAntiguos(), imprimir(), run()
 * @author Laura Sofia Ojeda Leon & Daniel Felipe Velasquez Rincon
 * @version 2
 * @since 29-04-2021
 */
public class Concesionario {
	private List<Carro> autos;
	Scanner leerDato =new Scanner(System.in);
	public Concesionario() {
	}
	/**
	 * Metodo que extrae los datos del archivo texto y asignarlo a intancias tipo Carro
	 */
	public void anexarDato() {
		System.out.println("Anexar datos I");
		try {
			this.autos = Files.lines(Paths.get("carros.txt")).map(l->new Carro(l.split(":")[0], Integer.parseInt(l.split(":")[1]))).collect(Collectors.toList());
			
		}catch(IOException exc) {
			System.out.println("Error procesando datos: " + exc.getMessage());
		}
		System.out.println("Carros del archivo inicial:");
		autos.stream().forEach(System.out::println);
	}
	/**
	 * Metodo que anexa datos de tipo Carro a un archivo texto
	 */
	public void anexaDatos2() {
		System.out.println("\nAnexar datos II");
		try {
			System.out.println("Ingrese el numero de carros que desea añadir");
			int tam=leerDato.nextInt();
			for (int i = 0; i < tam; i++) {
				System.out.println("Ingrese los datos");
				System.out.print("Marca -> ");
				String marca = leerDato.next();
				System.out.print("Modelo -> ");
				int modelo = leerDato.nextInt();
				
				autos.add(new Carro(marca, modelo));
			}
			Files.write(Paths.get("personas2.txt"),autos.stream().map(p->p.aArchivo()).collect(Collectors.toList()));
			
		}catch(Exception exc) {
			System.out.println("Error procesando datos: " + exc.getMessage());
		}
	}
	/**
	 * Metodo para borrar un carro del listado y actualizar los datos del archivo texto
	 */
	public void borrar() {
		System.out.println("\nBorrar datos");
		try {
			System.out.println("Ingrese la marca y el modelo del carro");
			System.out.print("Marca -> ");
			String marca = leerDato.next();
			System.out.print("Modelo -> ");
			int modelo = leerDato.nextInt();
			int i=autos.size();
			for (Carro carro : autos) {
				if(carro.getMarca().equals(marca) && carro.getModelo() ==modelo) {
					System.out.println(carro);
					autos.remove(carro);
					System.out.println("El carro fue removido del listado");
					Files.write(Paths.get("carros2.txt"),autos.stream().map(p->p.aArchivo()).collect(Collectors.toList()));
					break;
				}else if(i==1){
					System.out.println("No se encontro el carro en el listado");
					break;
				}
				i--;
			}
		}catch(Exception exc) {
			System.out.println("Error procesando datos: " + exc.getMessage());
		}
	}
	/**
	 * Metodo para extraer los carros cuyo modelo se aanterior al año 2000
	 */
	public void autosAntiguos() {
		try {
			List<Carro> carrosAntiguos = autos.stream().filter(p->p.getModelo()<2000).collect(Collectors.toList());
			Files.write(Paths.get("carrosAntiguos.txt"),carrosAntiguos.stream().map(p->p.aArchivo()).collect(Collectors.toList()));
			System.out.println("Listado de los carros anteriores al año 2000:");
			carrosAntiguos.stream().forEach(System.out::println);
		}catch(Exception exc) {
			System.out.println("Error procesando datos: " + exc.getMessage());
		}
	}
	/**
	 * Metodo para imprimir los datos actualizados contenidos en el listado de autos
	 */
	public void imprimir() {
		System.out.println("Carros del archivo actualizado:");
		autos.stream().forEach(System.out::println);
	}
	/**
	 * Metodo para implementar un menu de opciones donde se ejecutan los metodos anexarDato(), anexaDatos2(), borrar() y autosAntiguos()  
	 */
	public void run() {
		int op=0;
		boolean salir = false;
		System.out.println("Bienvenido al concesionario");
		System.out.println("----------------------------------------------");
		while(!salir) {
			System.out.println("1. Extraer datos");
			System.out.println("2. Añadir datos");
			System.out.println("3. Borrar datos");
			System.out.println("4. Mostrar listado de carros antiguos");
			System.out.println("5. Imprimir listado total");
			System.out.println("6. Salir");
			System.out.println("Digite una opcion");
			op = leerDato.nextInt();
			switch(op) {
				case 1:
					anexarDato();
					break;
				case 2:
					anexaDatos2();
					break;
				case 3:
					borrar();
					break;
				case 4:
					autosAntiguos();
					break;
				case 5:
					imprimir();
					break;
				case 6:
					salir = true;
					break;
				default:
					System.out.println("Digite un numero entre 1 y 6");
					break;
			}
			System.out.println("___________");
			System.out.println(" ");
		}
	}
	/**
	 * Metodo main que ejecuta el metodo run()
	 */
	public static void main(String[] args) {
		Concesionario arch = new Concesionario();
		arch.run();
	}

}
