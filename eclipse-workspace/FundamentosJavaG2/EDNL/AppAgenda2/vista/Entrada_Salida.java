package vista;

import java.util.Scanner;

public class Entrada_Salida {
	private Scanner leer;
	
	public Entrada_Salida() {
		this.leer = new Scanner(System.in);
	}
	
	public String leerTexto() {
		String dato = "";
		while(dato.length()==0) {
			dato = leer.nextLine();
		}
		return dato;
	}
	
	public long leerDatolong() {
		long dato=0;
		String aux="";
		try {
			while(aux.length()==0){
				aux = leer.nextLine();
			}
			dato = Long.parseLong(aux);
		}catch (Exception e){
			System.out.println("El dato ingresado no es un numero");
			dato=0;
		}
		return dato;
	}
	
	public int leerOpcion() {
		String dato = "";
		int numero = 0;
		try {
			while (dato.length() == 0) {
				dato = leer.nextLine();
			}
			numero = Integer.parseInt(dato);
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
