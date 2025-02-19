package modeloTF;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TrianguloFacil {
	private int n;
	
	private int [] x;
	
	private int [] y;
	
	Scanner leer = new Scanner(System.in);
	
	//cuantos caminos uno quiere
	
	public void recibe(int nv) {
		
		n = nv;
		
		System.out.println("¿Cuántos caminos desea?");
		
		boolean validar = false;
		
		while(!validar) {
			
			int val = leer.nextInt();
			
			if (val >= 0 && val < ((n*(n-1))/2)){
				
				x = new int [val];
				
				y = new int [val];
				
				validar = true;
			}
		}
	}
	
	public void camino(int num1, int num2, int i) {
		
		x [i] = num1;
		
		y [i] = num2;
		
	}
	
	public void agregarCaminos() {
		
		for (int i = 0; i < x.length; i++) {
			
			System.out.println("Digite el camino");
			
			int num1 = leer.nextInt();
			
			int num2 = leer.nextInt();
			
			boolean post= false;
			while(!post) {
				if (busqueda(num1, num2)) {
					
					camino(num1, num2, i);
					
					post = true;
				}
			}
		}
	}
	
	public boolean busqueda(int num1, int num2) {
		
		boolean posibilidad = true;
		
		if (num1 >= 0 && num1 < n) {
			
			if (num2 >= 0 && num2 < n) {
				
				for (int i = 0; i < x.length; i++) {
					
					if (x[i] ==num1 && y [i] == num2) {
						
						posibilidad = false;
						
					}else if(x[i] ==num2 && y [i] == num1) {
						
						posibilidad = false;
					}
				}
			}
		}
		if (posibilidad ) {
			
			return true;
		}
		
		return false;
	}
	
	public void comprobarTri() {
		
		ArrayList<Integer> numAristas = new ArrayList<>(); 

		numAristas.add(0);
		
		for (int i = 0; i < x.length; i++) {
			
			numAristas.add(1);
			
			int p = x[i];
			int v = y[i];
			
			for (int j = 0; j < x.length; j++) {
				
				if (x[j] == p && y[j]== v) {
					
				}else {
					
					if (x[j] == p || y[j]== v) {
						
						//con es conexion inicial
						int conI = 0;
						
						//conexion final
						int conF = 0;
						
						if (x[j] == p) {
							
							conI = y[j];
							
							conF = v;
							
						} else {
							
							conI = x[j];
							
							conF = p;

						}
						numAristas.add(2);
						if (comTresAristas(conI, conF)) {
							numAristas.add(3);
						}
					} else if (x[j] == v || y[j]== p){
						
						//con es conexion inicial
						int conI = 0;
						
						//conexion final
						int conF = 0;
						
						if (x[j] == v) {
							
							conI = y[j];
							
							conF = p;
							
						} else {
							
							conI = x[j];
							
							conF = v;

						}
						numAristas.add(2);
						if (comTresAristas(conI, conF)) {
							numAristas.add(3);
						}
					}
				}
			}	
		}
		
		//nA : numero Aristas
		int nA = Collections.max(numAristas);
		
		int resta = 3-nA;
		
		System.out.println("Faltan: " + resta + " aristas para completar el triangulo");
		
	}
	
	public boolean comTresAristas(int p, int v) {
		
		for (int i = 0; i < x.length; i++) {
			
			if (x[i]==p && y[i]==v) {
				
				return true;
				
			}else if(x[i]==v && y[i]==p) {
				
				return true;
				
			}
		}
		return false;
	}
	
	public void accion(int nv) {
		
		recibe(nv);
		agregarCaminos();
		comprobarTri();
	}
}
