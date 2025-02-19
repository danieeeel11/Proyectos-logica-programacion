package ArrayObjetos;

import java.util.Arrays;
import java.util.Scanner;

public class AppEstudiante {

	public static void main(String[] args) {
		Scanner leerDato = new Scanner(System.in);
		Estudiante[] listaEstudiante = new Estudiante[5];
		
		for (int i = 0; i < listaEstudiante.length; i++) {
			System.out.println("Entrar el id");
			int id = leerDato.nextInt();
			System.out.println("Entrar el nombre");
			String nombre = leerDato.next();
			System.out.println("Entrar la nota");
			double nota = leerDato.nextDouble();
			
			listaEstudiante[i] = new Estudiante(id, nombre, nota);
			
		}
		System.out.println(Arrays.toString(listaEstudiante));

	}

}
