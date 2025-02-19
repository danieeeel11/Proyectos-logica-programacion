package Floyd;

import java.util.Scanner;

public class Floyd {
	private int[][] matriz;
	private String[][] matrizRe;
	private int tamMatriz;
	
	public Floyd(int tamMatriz) {
		this.tamMatriz = tamMatriz;
		matriz = new int[tamMatriz+1][tamMatriz+1];
		matrizRe = new String[tamMatriz+1][tamMatriz+1];
	}
	
	public void inicializar() {
		String[] letra = {" ", "A", "B", "C", "D", "E"};
		for (int i = 1; i <= tamMatriz; i++) {
			for (int j = 1; j <= tamMatriz; j++) {
				if(i == j) {
					matriz[i][j] = 0;
				}else {
					matriz[i][j] = 99;
				}
				matrizRe[i][j] = letra[j];
			}
		}
	}
	
	public void leerDatos() {
		inicializar();
		int adjunto = 0;
		int costo = 0;
		Scanner sc = new Scanner(System.in);
		for (int k = 1; k <= tamMatriz; k++) {
			System.out.println("\nAdyacente al vertice " + k);
			System.out.print("[" + k + "][");
			adjunto = sc.nextInt();
			while(adjunto != 99) {
				System.out.print("Digite costo: ");
				costo = sc.nextInt();
				matriz[k][adjunto] = costo;
				System.out.println("  Para terminar digite adyacente 99");
				System.out.print("[" + k + "][");
				adjunto = sc.nextInt();
			}
		}
		sc.close();
	}
	
	public void imprimirMatriz() {
		for (int i = 1; i <= tamMatriz; i++) {
			for (int j = 1; j <= tamMatriz; j++) {
				System.out.print("\t" + matriz[i][j]);
			}
			System.out.print("\t");
			for (int j = 1; j <= tamMatriz; j++) {
				System.out.print("\t" + matrizRe[i][j]);
			}
			System.out.println();
		}
	}
	
	public void generarFloyd() {
		System.out.print("\nMATRIZ DE PONDERACIONES     \tMATRIZ DE RECORRIDOS");
		System.out.println("\nM" + 0);
		imprimirMatriz();
		String[] letra = {" ", "A", "B", "C", "D", "E"};
		for (int k = 1; k <= tamMatriz; k++) {
			for (int i = 1; i <= tamMatriz; i++) {
				if(matriz[i][k] != 99 && matriz[i][k] != 0) {
					for (int j = 1; j <= tamMatriz; j++) {
						if(j != k) {
							if(matriz[i][k] + matriz[k][j] < matriz[i][j]) {
								matriz[i][j] = matriz[i][k] + matriz[k][j];
								matrizRe[i][j] = letra[k];
							}
						}
					}
				}
			}
			System.out.println("M" + k);
			imprimirMatriz();
		}
	}
}
