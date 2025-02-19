package Votos;

import java.util.Scanner;

public class AppVotos {

	public static void main(String[] args) {
		Scanner leerDato =new Scanner(System.in);
		System.out.println("Bienvenido al centro de conteo");
		System.out.println("Ingrese los votos censados (A y B) ej:<<AABBABAB>>");
		String votos = leerDato.next();
		//ConteoVotos.cout(votos);
		System.out.println(ConteoVotos.count(votos));
	}

}
