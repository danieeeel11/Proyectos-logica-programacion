package Ej1;

import java.util.Scanner;
/**
 * Clase principal que contiene el main del ejercicio1, que contiene el metodo main
 * donde se determina si una palabra es palindroma o no
 * @author Laura Sofia Ojeda Leon & Daniel Felipe Velasquez Rincon
 * @version 2
 * @since 07-04-2021
 *
 */
public class Palabra {
	/**
	 * Main del ejercicio1
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner leerDato =new Scanner(System.in);
		TdaPila miPila = new TdaPila<>();
		boolean estado = true;
		while(estado) {
			System.out.println("\nIngrese una palabra, para determinar si es o no palindromo");
			String palabra = leerDato.next();
			char[] caracter =palabra.toCharArray();
			for (char c : caracter) {
				miPila.apilar(c);
			}
			for (int i = 0; i < caracter.length; i++) {
				if(caracter[i] != (char)miPila.desapilar()) {
					System.out.println("La palabra no es palindroma");
					break;
				}else if(i==caracter.length-1){
					System.out.println("La palabra es palindroma");
				}
			}
			System.out.println("\nQuiere continuar?");
			System.out.println("1:si, 2:no");
			int r = leerDato.nextInt();
			if(r == 1) {
				estado= true;
			}else {
				estado=false;
			}
		}
	}
}
