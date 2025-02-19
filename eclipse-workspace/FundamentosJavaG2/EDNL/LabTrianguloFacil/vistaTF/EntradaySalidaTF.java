package vistaTF;

import java.util.Scanner;

public class EntradaySalidaTF {
	private Scanner leer;
	
	public EntradaySalidaTF() {
		this.leer = new Scanner(System.in);
	}
	
	public String leerTexto() {
		String dato = "";
		while(dato.length()==0) {
			dato = leer.nextLine();
		}
		return dato;
	}
	
	public int leerDatoInt() {
		int dato =0;
		try {
			dato=leer.nextInt();
		}catch (Exception e){
			System.out.println("El dato ingresado no es un numero");
			dato=0;
		}
		return dato;
	}
	
	public int leerOpcion() {
		int numero = 0;
		try {
			numero = leer.nextInt();
		 } catch (Exception e) {
			 leer.nextLine();
			 System.out.println("El dato ingresado no es un numero");
			 numero = 0;
		 }
		 return numero;

	}
	
	public void imprimirInformacion(String msg) {
		System.out.println(msg);
	}
}
