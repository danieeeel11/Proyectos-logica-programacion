package controlTF;

import java.util.Scanner;

import modeloTF.TrianguloFacil;

public class Controlador {
	private TrianguloFacil operacion = new TrianguloFacil();
	
	Scanner leer = new Scanner(System.in);
	
	public void run() {
		
		System.out.println("¿Cuantos numeros de vertices requiere?");
		
		int nv =leer.nextInt();
		
		operacion.accion(nv);
	}

}
