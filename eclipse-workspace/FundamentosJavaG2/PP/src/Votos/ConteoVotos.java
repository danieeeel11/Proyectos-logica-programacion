package Votos;

import java.util.Scanner;

public class ConteoVotos {
	public static int count(String votos) {
		int contA = 0;
		int contB = 0;
		int j=0;
		char[] vot =votos.toCharArray();
		int aux = vot.length/2;
		for (int i = 0; i < vot.length; i++) {
			if(vot[i] == 'A') {
				contA++;
			}else{
				contB++;
			}
			if(contA>aux) {
				System.out.println("El votante A ya gano con " + contA + " votos de " + vot.length);
				j=i+1;
				//System.out.println("Luego de " + j + " votos contados, el concursante ya es ganador");
				break;
			}else if(contB>aux) {
				System.out.println("El votante B ya gano con " + contB + " votos de " + vot.length);
				j=i+1;
				//System.out.println("Luego de " + j + " votos contados, el concursante ya es ganador");
				break;
			}
			if(i == vot.length-1) {
				System.out.println("Se dio un empate entre los concursantes");
				j=i+1;
				break;
			}
		}
		return j;
	}
	
	public static void cout(String votos) {
		int contA = 0;
		int contB = 0;
		int j=0;
		char[] vot =votos.toCharArray();
		int aux = vot.length/2;
		for (int i = 0; i < vot.length; i++) {
			if(vot[i] == 'A') {
				contA++;
			}else{
				contB++;
			}
			if(contA>aux) {
				System.out.println("El votante A ya gano con " + contA + " votos de " + vot.length);
				j=i+1;
				System.out.println("Luego de " + j + " votos contados, el concursante ya es ganador");
				break;
			}else if(contB>aux) {
				System.out.println("El votante B ya gano con " + contB + " votos de " + vot.length);
				j=i+1;
				System.out.println("Luego de " + j + " votos contados, el concursante ya es ganador");
				break;
			}
			if(i == vot.length-1) {
				System.out.println("Se dio un empate entre los concursantes");
				j=i+1;
				break;
			}
		}
	}
	
	public static int counti(String votos) {
		int contA = 0;
		int contB = 0;
		int j=0;
		char[] vot =votos.toCharArray();
		int aux = vot.length/2;
		for (int i = 0; i < vot.length; i++) {
			if(vot[i] == 'A') {
				contA++;
			}else{
				contB++;
			}
			if(contA>aux) {
				System.out.println("El votante A ya gano con " + contA + " votos de " + vot.length);
				j=i+1;
				System.out.println("Luego de " + j + " votos contados, el concursante ya es ganador");
				break;
			}else if(contB>aux) {
				System.out.println("El votante B ya gano con " + contB + " votos de " + vot.length);
				j=i+1;
				System.out.println("Luego de " + j + " votos contados, el concursante ya es ganador");
				break;
			}
			if(i == vot.length-1) {
				System.out.println("Se dio un empate entre los concursantes");
				j=i+1;
				break;
			}
		}
		return j;
	}
	
}
