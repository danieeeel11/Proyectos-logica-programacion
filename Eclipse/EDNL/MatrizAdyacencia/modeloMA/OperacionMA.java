package modeloMA;

import java.util.ArrayList;
import java.util.Random;

public class OperacionMA implements IOperacionMA {
	//private int n;
    private int[][] matriz;
    private int[][] matrizAd;
    private int[][] matrizIn;
    private ArrayList<Integer> caminos = new ArrayList<>();
    
	public int[][] getMatriz() {
		return matriz;
	}

	@Override
	public void generarGrafo(int tam) {
		Random r = new Random();
		if(tam == 0) {
			int tam2 = r.nextInt((6-1)+2)+2;
			matriz = new int[tam2+1][tam2+1];
		}else {
			matriz = new int[tam+1][tam+1];
		}
		for (int i = 0; i< matriz.length; i++){
			for (int j = 0; j< matriz.length; j++) {
				if(i == 0) {
					matriz[i][j] = j;
				}
				if(j == 0) {
					matriz[i][j] = i;
				}
				if(i>0 && j>0) {
					if(i==j) {
						matriz[i][j] = 0;
					}else {
						if(matriz[j][i] != 0) {
							matriz[i][j] = matriz[j][i];
						}else {
							int num = r.nextInt((20-1)+1)+1;
							for (int k = 0; k < matriz.length; k++) {
								for (int k2 = 0; k2 < matriz.length; k2++) {
									while(num==matriz[k][k2]) {
										num = r.nextInt((20-1)+1)+1;
									}
								}
						
							}
							matriz[i][j] = num;
							caminos.add(num);
						}
					}
				}
			}            
		}
		//caminos.forEach(System.out::println);
		matrizIncidencia();
		matrizAdyacencia();
		
	}
	
	public void matrizAdyacencia() {
		matrizAd= new int[matriz.length][matriz.length];
		for (int i = 0; i< matrizAd.length; i++){
			for (int j = 0; j< matrizAd.length; j++) {
				if(i == 0) {
					matrizAd[i][j] = j;
				}
				if(j == 0) {
					matrizAd[i][j] = i;
				}
				if(i>0 && j>0) {
					if(matriz[i][j] != 0) {
						matrizAd[i][j] = 1;
					}
				}
			}
		}
	}
	
	public void matrizIncidencia() {
		matrizIn = new int[matriz.length][caminos.size()+1];
		int index = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < caminos.size()+1; j++) {
				//System.out.print("a");
				if(i == 0) {
					if(j>0) {
						matrizIn[i][j] = caminos.get(index);
						index++;
					}else{
						matriz[i][j] = 0;
					}
					
				}
				if(j == 0) {
					matrizIn[i][j] = i;
					
				}
				if(i>0 && j>0) {
					int[] in = busqueda(matrizIn[0][j]);
					if(in != null) {
						int a = in[0];
						matrizIn[a][j] = 1;
						int b = in[1];
						matrizIn[b][j] = 1;
					}
					
				}
			}
		}
	}
	
	@Override
	public int[] busqueda(int arista) {
		int [] index = null;
		//boolean encontrado = false;
		for (int i = 1; i< matriz.length; i++){
			for (int j = 1; j< matriz.length; j++) {
				if(matriz[i][j]==arista) {
					//encontrado = true;
					index = new int[2];
					index[0] = i;
					index[1] = j;
				}
			}
		}
		return index;
	}
	
	@Override
	public void verificarArista(int arista) {
		boolean encontrado = false;
		for (int i = 1; i< matriz.length; i++){
			for (int j = 1; j< matriz.length; j++) {
				if(matriz[i][j]==arista) {
					encontrado = true;
					System.out.println("Arista " + arista + " con conexion " + i + " a " + j);
					
				}
			}
		}
		if(!encontrado) {
			System.out.println("No hay registros de la arista");
		}
	}
	
	@Override
	public void obtenerPesoArista(int a, int b) {
		boolean encontrado = false;
		for (int i = 1; i< matriz.length; i++){
			for (int j = 1; j< matriz.length; j++) {
				if(i==a && j == b) {
					if(matriz[i][j]!=0) {
						encontrado = true;
						System.out.println("La arista que conecta " + a  + " con " +  b  + ", tiene un valor de " + matriz[i][j]);
					}
				}
				
			}
		}
		if(!encontrado) {
			System.out.println("No hay valor para la arista");
		}
	}

	@Override
	public void imprimirAdyacencia() {
		for (int i=0; i< matrizAd.length; i++) {
            for (int j=0; j< matrizAd.length; j++) {
                System.out.print( matrizAd[i][j] + "\t" );
            }
            System.out.println();
        }
		
	}

	@Override
	public void imprimirIncidencia() {
		for (int i=0; i< matriz.length; i++) {
            for (int j=0; j< caminos.size()+1; j++) {
                System.out.print( matrizIn[i][j] + "\t" );
            }
            System.out.println();
        }
	}
	
	@Override
	public void imprimirPesos() {
		for (int i=0; i< matriz.length; i++) {
            for (int j=0; j< matriz.length; j++) {
                System.out.print( matriz[i][j] + "\t" );
            }
            System.out.println();
        }
		
	}

	@Override
	public void removerArista(int arista) {
		boolean encontrado = false;
		for (int i = 1; i< matriz.length; i++){
			for (int j = 1; j< matriz.length; j++) {
				if(matriz[i][j] == arista) {
					encontrado = true;
					matriz[i][j] = 0;
					System.out.println("Arista " + arista + " con conexion " + i + " a " + j + " ha sido borrada");
				}
			}
		}
		if(!encontrado) {
			System.out.println("No hay registros de la arista");
		}
		matrizIncidencia();
		matrizAdyacencia();
	}
	
	@Override
	public void liberarGrafo() {
		matriz=null;
		System.out.println("El grafo ha sido borrado");
	}
	
	
}
