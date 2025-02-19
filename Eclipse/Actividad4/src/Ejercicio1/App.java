package Ejercicio1;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leerDato =new Scanner(System.in);
		System.out.println("Digite el numero de clientes...");
		int nClientes =leerDato.nextInt();
		System.out.println("Digite el numero de productos...");
		int nProductos =leerDato.nextInt();
		
		new Tienda(nProductos,nClientes).run();
		
	}

}
