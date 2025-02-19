package vista;

import java.util.Scanner;

public class EntradaSalida {
	private Scanner sc;
	
	public EntradaSalida() {
		this.sc = new Scanner(System.in);
	}
	
	public String leerTexto() {
		String dato = "";
		while(dato.length()==0) {
			dato = sc.nextLine();
		}
		return dato;
	}
	
	public int leerOpcion() {
		String dato = "";
		while(dato.length()==0) {
			dato=sc.nextLine();
		}
		return Integer.parseInt(dato);
	}
	
	public void imprimirMensaje(String msg) {
		System.out.println(msg);
	}
}
