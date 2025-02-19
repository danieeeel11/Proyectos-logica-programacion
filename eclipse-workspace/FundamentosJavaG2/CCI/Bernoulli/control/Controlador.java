package control;

import java.util.Scanner;

import modelo.Operacion;
import vista.EntradaySalida;

public class Controlador {
	private Operacion op = new Operacion();
	private EntradaySalida eys = new EntradaySalida();
	
	Scanner leer = new Scanner(System.in);
	
	public void run() {
		eys.imprimirInformacion("TEOREMA DE BERNOULLI\n");
		eys.imprimirInformacion("¿Cual es el espacio muestral del experimento?");
		double s = eys.leerDatoInt();
		eys.imprimirInformacion("¿Cuantos eventos del experimento se considera un exito?");
		double n = eys.leerDatoInt();
		
		op.accion(s, n);
	}
}
