package Floyd;

import java.util.Scanner;

public class MainFloyd {

	public static void main(String[] args) {
		int tamMatriz = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Tamaño de la matriz: ");
		tamMatriz = sc.nextInt();
		Floyd fd = new Floyd(tamMatriz);
		fd.leerDatos();
		fd.generarFloyd();
		//fd.imprimirMatriz();
		sc.close();
	}

}
