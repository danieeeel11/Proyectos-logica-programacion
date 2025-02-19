package Ej2;

public class NPerfectC {
	/**
	 * Identifica si un numero entero es perfecto o no
	 * @param dato es un numero entero enviado como parametro desde una clase externa
	 * @return si el numero es perfecto o false si el numero no es perfecto
	 */
	public static boolean perfecto(int dato) {
		int suma=0;
		boolean numeroP = false;
		for(int i=1 ; i<dato ; i++) {
			if(dato % i == 0) {
				suma = suma +i;
				System.out.println(i);
			}
		}
		if(suma == dato) {
			numeroP = true;
		}
		return numeroP;
	}
}
