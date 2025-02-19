package Ejercicio1;
/**
 * App de la agencia , con el run y el dato de numero de vuelos
 * @author Daniel Velasquez y julian Cardenas
 * @since 24-10-2020
 * @version 1
 * 
 */

import java.util.Scanner;

public class AppTiquetesMuyBaratoscom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leerDato =new Scanner(System.in);
		System.out.println("Digite el numero de vuelos que desea crear...");
		int nV = leerDato.nextInt();
		
		new Agencia(nV).run();
	}

}
