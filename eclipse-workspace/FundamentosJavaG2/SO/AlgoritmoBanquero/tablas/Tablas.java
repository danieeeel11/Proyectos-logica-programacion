package tablas;

import java.util.ArrayList;
import java.util.Scanner;

public class Tablas {
	
	private int numProcesos;
	private int numRecursos;
	int recursosIniciales[];
	int maximos[][];
	int enUso[][];
	int necesarios[][];
	int recursosDisponibles[];
	ArrayList<Integer> procesosFin = new ArrayList<>();
	
	Scanner sc = new Scanner(System.in);
	
	public Tablas(int numProcesos, int numRecursos) {
		super();
		this.numProcesos = numProcesos;
		this.numRecursos = numRecursos;
	}

	public void crearTablas() {
		recursosIniciales = new int[numRecursos];
		//x, y
		maximos = new int[numProcesos][numRecursos];
		//Creando la matriz
		enUso = new int[numProcesos][numRecursos];
		necesarios = new int[numProcesos][numRecursos];
		recursosDisponibles = new int[numRecursos];
	}
	
	public void recursosIniciales(){
		for (int i = 0; i < numRecursos; i++) {
			System.out.print("¿Cuantos recursos de R" + (i+1) + "? " );
			int recursos = sc.nextInt();
			//Se rellena el vector
			recursosIniciales[i] = recursos;
		}
	}
	
	public void recursosMaximos(){
		System.out.println("Recursos Maximos: ");
		for (int i = 0; i < numProcesos; i++) {
			String recursos = sc.next();
			String aux[] = recursos.split("");
			for (int j = 0; j < numRecursos; j++) {
				//int recursos = sc.nextInt();
				maximos[i][j] = Integer.valueOf(aux[j]); 
			}
		}
	}
	
	public void recursosUso() {
		System.out.println("\nRecursos En Uso: ");
		for (int i = 0; i < numProcesos; i++) {
			String recursos = sc.next();
			String aux[] = recursos.split("");
			for (int j = 0; j < numRecursos; j++) {
				//int recursos = sc.nextInt();
				//Relleno la matriz
				enUso[i][j] = Integer.valueOf(aux[j]);
			}
		}
	}
	
	public void recursosNecesarios() {
		for (int i = 0; i < numProcesos; i++) {
			for (int j = 0; j < numRecursos; j++) {
				if(!procesosFin.contains((i+1))) {
					int recursos = maximos[i][j] - enUso[i][j];
					necesarios[i][j] = recursos;
				}
			}
		}
	}
	
	public void recursosDisponibles() {
		for (int i = 0; i < numRecursos; i++) {
			int conteoColumnas = 0;
			for (int j = 0; j < numProcesos; j++) {
				//j: Proceso      i: Recurso   solo para este caso
				//Se va autosumando
				conteoColumnas = enUso[j][i] + conteoColumnas;	
			}
			recursosDisponibles[i] = recursosIniciales[i] - conteoColumnas;
		}
	}
	public boolean solicitud() {
		boolean posible = false;
		System.out.print("¿Que solicitud requiere?: ");
		String solicitud = sc.next();
		
		String vectorSolicitud[] = solicitud.split(",");
		
		System.out.println("  Procesos en espera:");
		for (int i = 0; i < numProcesos; i++) {
			int m = i+1;
			if (!procesosFin.contains(m)) {
				System.out.print("  P" + (i+1));
			}
		}
		
		System.out.print("\n¿Que proceso requiere?: ");
		//Leerlo por consola
		int p = sc.nextInt();
		
		while (procesosFin.contains(p)|| p>numProcesos) {
			System.out.print(" ! Ingrese un Proceso valido: ");
			p = sc.nextInt();
		}
		
		boolean aceptado = true;
		for (int i = 0; i < numRecursos; i++) {
			if (Integer.valueOf(vectorSolicitud[i]) > necesarios[(p-1)][i]) {
				aceptado = false;
			}
		}
		
		if (aceptado) {
			for (int i = 0; i < numRecursos; i++) {
				if (Integer.valueOf(vectorSolicitud[i]) > recursosDisponibles[i]) {
					aceptado = false;
				}
			}
			if (aceptado) {
				for (int i = 0; i < numRecursos; i++) {
					enUso[(p-1)][i] = enUso[(p-1)][i] + Integer.valueOf(vectorSolicitud[i]);
				}
				recursosNecesarios();
				recursosDisponibles();
				
				int finProceso = 0;
				for (int i = 0; i < numRecursos; i++) {
					if (necesarios[(p-1)][i] == 0) {
						finProceso++;
					}
				}
				if (finProceso == numRecursos) {
					for (int i = 0; i < numRecursos; i++) {
						recursosDisponibles[i] = enUso[(p-1)][i] + recursosDisponibles[i];
					}
					for (int i = 0; i < numRecursos; i++) {
						enUso[(p-1)][i] = 0;
					}
					procesosFin.add(p);
					System.out.println("-> Proceso " + p + " finalizado");
				}
				for (int i = 0; i < numProcesos ; i++) {
					int contador = 0;
					for (int j = 0; j < numRecursos; j++) {
						if (necesarios[i][j] <= recursosDisponibles[j]) {
							contador++;
						}
					}
					if (contador == numRecursos) {
						posible = true;
					}
				}
			}
		}else {
			System.out.println("La solicitud no es aceptada");
			solicitud();
		}
		return posible;
	}
	
	public void impr() {
		System.out.println("\n\nIniciales: ");
		for (int i = 0; i < numRecursos; i++) {
			if(i==0) {
				System.out.print("|");
			}
			System.out.print(recursosIniciales[i]);
			if(i==(numRecursos-1)) {
				System.out.print("|");
			}
			System.out.print("\t");
		}
		System.out.println("\n\nRecursos Maximos:  \tRecursos En Uso:  \tNecesarios: ");
		for (int i = 0; i < numProcesos; i++) {
			for (int j = 0; j < numRecursos; j++) {
				if(j==0) {
					System.out.print("|");
				}
				System.out.print(maximos[i][j]);
				if(j==(numRecursos-1)) {
					System.out.print("|");
				}
				System.out.print("\t");
			}
			for (int j = 0; j < numRecursos; j++) {
				if(j==0) {
					System.out.print("|");
				}
				System.out.print(enUso[i][j]);
				if(j==(numRecursos-1)) {
					System.out.print("|");
				}
				System.out.print("\t");
			}
			for (int j = 0; j < numRecursos; j++) {
				if(j==0) {
					System.out.print("|");
				}
				System.out.print(necesarios[i][j]);
				if(j==(numRecursos-1)) {
					System.out.print("|");
				}
				System.out.print("\t");
			}
			System.out.println();
		}
		System.out.println("\nDisponibles: ");
		for (int i = 0; i < numRecursos; i++) {
			if(i==0) {
				System.out.print("|");
			}
			System.out.print(recursosDisponibles[i]);
			if(i==(numRecursos-1)) {
				System.out.print("|");
			}
			System.out.print("\t");
		}
		System.out.println("\n\n");
	}
	
	public void inicial() {
		crearTablas();
		recursosIniciales();
		recursosMaximos();
		recursosUso();
		recursosNecesarios();
		recursosDisponibles();
		impr();
	}
	
	public void accion() {
		if(procesosFin.size() != numProcesos) {
			boolean sol = solicitud();
			if (sol) {
				System.out.println("Solicitud aceptada");
				impr();
				accion();
			}else {
				System.out.println("Solicitud denegada");
			}
		}else {
			System.out.println("\n¡ Procesamiento finalizado !");
		}
		
	}
}