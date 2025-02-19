package Ejercicio1;
/**
 * Clase Agencia donde estan los metodos del menu, como la creacion del vuelo, la compra del tiquete, busccar pasajero
 * y mostrar los vuelos
 * @author Daniel Velasquez y julian Cardenas
 * @since 24-10-2020
 * @version 1
 * 
 */

import java.util.Scanner;

public class Agencia {
	private Scanner leerDato =new Scanner(System.in);
	private Vuelo[] arregloVuelos;
	/**
	 * @param arregloVuelos
	 */
	public Agencia(int nVuelos) {
		super();
		arregloVuelos = new Vuelo[nVuelos];
	}
	
	//Metodo run para correr el menú del programa
	public void run() {
		int op=0;
		boolean salir = false;
		while(!salir) {
			System.out.println(" ");
			System.out.println("Bienvenido a la agencia TiquetesMuyBaratos.com");
			System.out.println("----------------------------------------------");
			System.out.println("1. Crear vuelo");
			System.out.println("2. Comprar tiquetes");
			System.out.println("3. Consultar pasajero");
			System.out.println("4. Lista vuelos");
			System.out.println("5. Salir");
			System.out.println("Digite una opcion");
			op = leerDato.nextInt();
			switch(op) {
				case 1:
					crearVuelo();
					break;
				case 2:
					comprarTiquete();
					break;
				case 3:
					buscarPasajero(arregloVuelos);
					break;
				case 4:
					dataVuelos();
					break;
				case 5:
					salir = true;
					break;
				default:
					System.out.println("Digite un numero entre 1 y 5");
					break;
			}
			System.out.println("----------------------------------------------");
			System.out.println(" ");
		}
	}
	
	//METODO PARA CREAR VUELO
	public void crearVuelo() {
		System.out.println("Bienvenido, crear nuevo vuelo");
		System.out.println("Numero del vuelo...");
		int nVuelo = leerDato.nextInt();
		System.out.println("Ciudad de salida...");
		String ciudadSalida = leerDato.next();
		System.out.println("Ciudad de llegada...");
		String ciudadLlegada = leerDato.next();
		System.out.println(" ");
		System.out.println("Datos del piloto");
		System.out.println("Identificacion...");
		int id = leerDato.nextInt();
		System.out.println("Nombre...");
		String nombreP = leerDato.next();
		System.out.println("Horas de vuelo...");
		int horasVuelo = leerDato.nextInt();
		System.out.println(" ");
		System.out.println("Numero de puestos...");
		int nPuestos = leerDato.nextInt();
		System.out.println(" ");
		
		Piloto miPiloto = new Piloto(id,nombreP,horasVuelo);
		Vuelo miVuelo = new Vuelo(nVuelo,ciudadSalida,ciudadLlegada,miPiloto,nPuestos);
		
		for(int i=0;i<arregloVuelos.length;i++) {
			if(arregloVuelos[i] == null) {
				arregloVuelos[i] = miVuelo;
				break;
			}
		}
	}
	
	//METODO PARA COMPRAR TIQUETE
	public void comprarTiquete() {
		System.out.println("Bienvenido, comprar tiquete");
		System.out.println("Vuelos disponibles");
		for(Vuelo m : arregloVuelos) {
			System.out.println(m.getnVuelo());
			//System.out.println(miVuelo.setnVuelo(nVuelo));
		}
		System.out.println("¿Para que vuelo quiere comprar el tiquete?");
		int vuelo = leerDato.nextInt();
		for(Vuelo miVuelo : arregloVuelos) {
			if(vuelo == miVuelo.getnVuelo()) {
				int vueloAsig = vuelo;
				System.out.println("Su vuelo sera el " + vueloAsig);
				System.out.println("Datos puesto");
				//System.out.println("Su puesto es..." + arregloVuelos[i].);
				
				int n = 100;
				int numero = n;
				numero++;
				
				System.out.println("Datos pasajero");
				System.out.println("Identificacion...");
				int id = leerDato.nextInt();
				System.out.println("Nombre...");
				String nombrePa = leerDato.next();
				System.out.println("Edad...");
				int edad = leerDato.nextInt();
				System.out.println("Genero...");
				String genero = leerDato.next();
				System.out.println(" ");
				
				Pasajero miPasajero = new Pasajero(id,nombrePa,edad,genero);
				Puesto miPuesto = new Puesto(numero,miPasajero);
				
				for(int j=0;j<arregloVuelos.length;j++) {
					arregloVuelos[j].agregarPuesto(miPuesto);
					break;
					//if(miVuelo.getPuestos()[i]== null) {
					//	miVuelo.getPuestos()[i] = miPuesto;
					//}
				}
				break;
			}else{
				System.out.println("Vuelo no encontrado");
				System.out.println("Vuelva a ingresar una opcion");
				System.out.println(" ");
				break;
			}
		}
	}
	
	//METODO PARA BUSCAR PASAJERO
	public void buscarPasajero(Vuelo[] arregloVuelos) {
		System.out.println("Ingrese identificacion del pasajero");
		int id= leerDato.nextInt() ;
		for (int i = 0; i < arregloVuelos.length; i++) {
			arregloVuelos[i].buscarPasajero(id);
			break;
		}
		
		
		
	}
	//METODO PARA MOSTRR LOS VUELOS
	public void dataVuelos() {  
		System.out.println("Registro de vuelos");
		for(Vuelo v : arregloVuelos) {
			System.out.println(v);
		}
		System.out.println(" ");
	}

	
	

}
