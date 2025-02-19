package Ej2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Clase principal que contiene el main del Ejercicio2, que contiene los metodos contendidos en el run()
 * Se ejecutan operaciones con un listado de la clase Bus
 * @author Laura Sofia Ojeda Leon & Daniel Felipe Velasquez Rincon
 * @version 2
 * @since 14-05-2021
 */
public class Transporte {
	public static ArrayList<Bus> listaBuses = new ArrayList<Bus>();
	static Scanner leerDato =new Scanner(System.in);
	/**
	 * Metodo para generar un nombre aleatorio en base a arrays de nombres y apellidos
	 * @return el nombre de tipo String, compuesto por nombre y apellido
	 */
	public static String nomAleatorio() {
		String aleaNom = new String();
		String[] nombres = { "Andrea", "David", "Baltasar", "Barry", "Bartolomeo",
				"Carlos", "Zaramay", "Marcos", "Davinson", "Polo", "Pepito", "Pachito", 
				"Carlota", "Estefania", "Gabriel", "Dayana", "Hulio", "Roco"};
		String[] apellidos = { "Ruiz", "Guerrero", "Cardenas", "Montoya", "Cuccitini", 
				"Dos Santos", "Gaucho", "Rodriguez","Garcia", "Sanchez", "Cantona", 
				"McKennie", "Araujo", "Alba", "Lavezzi", "Ramos", "Paez", "Montero" };
		aleaNom = nombres[(int)(Math.floor(Math.random()*((nombres.length-1)-0+1)+0))] + " "+ apellidos[(int)(Math.floor(Math.random()*((apellidos.length-1)-0+1)+0))];
		return aleaNom;
	}
	/**
	 * Metodo para obtener un numero aleatorio entre 1 y 100, sin repeticiones
	 * @param aleaNum la cual es la lista de enteros entre 1 y 100
	 * @return un numero de aleaNum
	 */
	public static int aleaSinRepe(List<Integer> aleaNum) {
	    Random ra = new Random();
	    int num=0;
	    int random = ra.nextInt(aleaNum.size());
	    num = aleaNum.get(random);
	    aleaNum.remove(random);
	    return num;
	  }
	/**
	 * Metodo para generar y agregar buses al listado de buses
	 */
	public static void agregarBus() {
		List<Integer> aleaNum = new ArrayList<Integer>();
		for (int i = 1; i < 101; i++) {
			aleaNum.add(i);
		}
		System.out.println("\nCuantos buses estan inscritos en la empresa?");
		int n = leerDato.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("Numero del bus: ");
			int numero = aleaSinRepe(aleaNum);
			System.out.print(numero);
			
			System.out.print("\nConductor ");
			System.out.print("\nIdentificacion: ");
			int id = (int) (Math.random()*(1999999999-1000000000+1)+1000000000);
			System.out.print(id);
			System.out.print("\nNombre: ");
			String nombre = nomAleatorio();
			System.out.print(nombre);
			
			System.out.print("\nKilometros recorridos ");
			System.out.print("\nLunes:  ");
			int lunes= (int) (Math.random()*(1000-10+1)+10);
			System.out.print(lunes);
			System.out.print("\nMartes:  ");
			int martes= (int) (Math.random()*(1000-10+1)+10);
			System.out.print(martes);
			System.out.print("\nMiercoles:  ");
			int miercoles= (int) (Math.random()*(1000-10+1)+10);
			System.out.print(miercoles);
			System.out.print("\nJueves:  ");
			int jueves= (int) (Math.random()*(1000-10+1)+10);
			System.out.print(jueves);
			System.out.print("\nViernes:  ");
			int viernes= (int) (Math.random()*(1000-10+1)+10);
			System.out.print(viernes);
			System.out.print("\nSabado:  ");
			int sabado= (int) (Math.random()*(1000-10+1)+10);
			System.out.print(sabado);
			System.out.print("\nDomingo:  ");
			int domingo= (int) (Math.random()*(1000-10+1)+10);
			System.out.print(domingo);
			
			//System.out.println("\n");
			Conductor con = new Conductor(id,nombre);
			Km km = new Km(lunes,martes,miercoles,jueves,viernes,sabado,domingo);
			km.setKmSemana();
			System.out.println("\nTotal semana: " + km.getKmSemana());
			System.out.println("\n");
			Bus bus = new Bus(numero,km,con);
			listaBuses.add(bus);
		}
		System.out.println("Listado original de buses: ");
		imprimir();
	}
	/**
	 * Metodo para ordenar el listado de buses de acuerdo al numero del bus
	 */
	public static void orderNBus() {
		System.out.println("Lista de buses ordenados por el numero del bus: ");
		listaBuses.sort(Comparator.comparingInt(Bus::getNumero));
		imprimir();
	}
	/**
	 * Metodo para ordenar el listado de buses de acuerdo al kilometraje total de la semana
	 */
	public static void orderSemana() {
		System.out.println("Lista de buses ordenados el total de km recorridos en la semana (mayor a menor): ");
		Comparator<Bus> ordSemana = (p1,p2)->Integer.compare(p2.getKm().getKmSemana(),p1.getKm().getKmSemana());
		listaBuses.sort(ordSemana);
		imprimir();
	}
	/**
	 * Metodo para obtener el bus cuyo kilometraje de la semana sea el mayor de los buses inscritos
	 */
	public static void mayorKm() {
		System.out.println("Bus con el mayor kilometraje de la semana: ");
		Comparator<Bus> mayorKmSem = (p1,p2)->Integer.compare(p2.getKm().getKmSemana(),p1.getKm().getKmSemana());
		listaBuses.sort(mayorKmSem);
		Bus busMayor = listaBuses.get(0);
		System.out.println("Bus: " + busMayor.getNumero());
		System.out.println("Conductor: " + busMayor.getConductor());
		System.out.println("Kilometros recorridos: " + busMayor.getKm().getKmSemana());
	}
	/**
	 * Metodo para obtener el promedio de los kilometrajes de la semana de todos los buses inscritos
	 */
	public static void promedioKmSemana() {
		System.out.println("\nPromedio de kilometraje total de los buses inscritos:");
		int sumaKm=0;
		for (int i = 0; i < listaBuses.size(); i++) {
			Bus bus = listaBuses.get(i);
			sumaKm += bus.getKm().getKmSemana(); 
		}
		System.out.println((float)sumaKm/listaBuses.size());
	}
	
	/**
	 * Metodo para imprimir la listaBuses
	 */
	public static void imprimir() {
		listaBuses.forEach(System.out::println);
		System.out.println();
	}
	/**
	 * Metodo run donde se implementan los metodos de la clase, dentro de un menu de opciones
	 */
	public static void run() {
		int op=0;
		boolean salir = false;
		System.out.println("Bienvenido a Buses S.A. - empresa de transporte intermunicipal");
		System.out.println("----------------------------------------------");
		System.out.println("Buses: ");
		agregarBus();
		while(!salir) {
			System.out.println("1. Agregar al listado de buses inscritos");
			System.out.println("2. Listado de buses ordenados segun el numero de bus");
			System.out.println("3. Listado de buses ordenados segun el el kilometraje total de la semana");
			System.out.println("4. Mostrar el bus con mayor kilometraje de la semana");
			System.out.println("5. Promedio del kilometraje de todos los busos en la semana");
			System.out.println("6. Salir");
			System.out.println("Digite una opcion");
			op = leerDato.nextInt();
			switch(op) {
				case 1:
					agregarBus();
					break;
				case 2:
					orderNBus();
					break;
				case 3:
					orderSemana();
					break;
				case 4:
					mayorKm();
					break;
				case 5:
					promedioKmSemana();
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
	 * Metodo main para ejecutar el metodo run()
	 * @param args
	 */
	public static void main(String[] args) {
		run();
	}

}
