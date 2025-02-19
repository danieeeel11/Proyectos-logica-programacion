package Warshall;

import java.util.Scanner;

public class Warshall {

	private int[][] matriz;
	private int tamMatriz;
	
	public void leerMatriz() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Tamaño matriz");
		tamMatriz = sc.nextInt();
		matriz = new int[tamMatriz+1][tamMatriz+1];
		for (int i = 1; i <= tamMatriz; i++) {
			for (int j = 1; j <= tamMatriz; j++) {
				matriz[i][j] = 0;
			}
		}
		int adjunto = 0;
		System.out.println("\nDigite las posiciones donde se establece una conexion");
		for (int i = 1; i <= tamMatriz; i++) {
			System.out.println("\nAdjunto del vertice: " + i);
			System.out.print("[" + i + "][");
			adjunto = sc.nextInt();
			while (adjunto != 99) {
				matriz[i][adjunto] = 1;
				System.out.println("  Para terminar digite adyacente 99");
				System.out.print("[" + i + "][");
				adjunto = sc.nextInt();
			}
		}
	}
	
	public void imprimirMatriz() {
		for (int i = 1; i <= tamMatriz; i++) {
			for (int j = 1; j <= tamMatriz; j++) {
				System.out.print("\t" + matriz[i][j]);
			}
			System.out.println();
		}
	}
	
	public void warshall() {
		System.out.println("\nM" + 0);
		imprimirMatriz();
		for (int k = 1; k <= tamMatriz; k++) {
			for (int i = 1; i <= tamMatriz; i++) {
				if(i != k) {
					if(matriz[i][k] == 1) {
						for (int j = 1; j <= tamMatriz; j++) {
							if (matriz[i][j] == 0) {
								matriz[i][j] = matriz[k][j];
							}
						}
					}
				}
			}
			System.out.println("M" + k);
			imprimirMatriz();
		}
	}
	
	public boolean estaConectada() {
		boolean estado = true;
		System.out.println();
		for (int i = 1; i <= tamMatriz; i++) {
			for (int j = 1; j <= tamMatriz; j++) {
				if(matriz[i][j] == 0) {
					estado = false;
					return estado;
				}
			}
		}
		return estado;
	}
	
	public static void main(String[] args) {
		Warshall objW = new Warshall();
		objW.leerMatriz();
		objW.warshall();
		if (objW.estaConectada()) {
			System.out.println("Grafo fuertemente conectado");
		}else {
			System.out.println("Grafo no es fuertemente conectado");
		}
	}

}
