package modeloA;

import java.util.ArrayList;

public class AutomataA {
	private String cadena;
	private char [] cadenaA;
	private boolean aceptacion;
	String[][] tablaT = new String[5][3];
	ArrayList<Integer> aux = new ArrayList<>();
    int contador;
    
    public AutomataA(String cadena) {
    	this.cadena = cadena;
    	this.cadenaA = cadena.toCharArray();
    	this.contador = 0;
    	this.aceptacion = false;
    }
    
    public String[][] declararTabla() {
    	String[][] tAux = new String[5][3];
    	
    	tAux[0][0] = "  ";
    	tAux[0][1] = "0 ";
    	tAux[0][2] = "1 ";
    	
    	tAux[1][0] = "q0";
    	tAux[1][1] = "  ";
    	tAux[1][2] = "  ";
    	
    	tAux[2][0] = "q1";
    	tAux[2][1] = "  ";
    	tAux[2][2] = "  ";
    	
    	tAux[3][0] = "q2";
    	tAux[3][1] = "  ";
    	tAux[3][2] = "  ";
    	
    	tAux[4][0] = "q3";
    	tAux[4][1] = "  ";
    	tAux[4][2] = "  ";
    	
    	return tAux;
    }
    
    public void evaluarCad() {
    	tablaT = declararTabla();
    	this.contador = 0;
    	this.aceptacion = false;
    	q0();
    	if(!aceptacion) {
    		System.out.println(cadena + ", la cadena no esta definida");
    	}else {
    		System.out.println(cadena + ", la cadena esta definida");
    		tablaTransicion();
    	}
    }
 
    public void q0() {
    	if(contador == cadenaA.length) {
    		this.aceptacion = true;
    	}
    	System.out.println("Estado q0");
        if(contador < cadenaA.length){
            if(cadenaA[contador] == '1'){
                contador++;
                tablaT[1][2] += "q1,";
                q1();
            }
            else if (cadenaA[contador] == '0'){
                contador++;
                tablaT[1][1] += "q2,";
                q2();
            }
        }
    }
    
    public void q1() {
    	this.aceptacion = false;
    	System.out.println("Estado q1");
    	if(contador < cadenaA.length){
		    if(cadenaA[contador] == '1'){
		        contador++;
		        tablaT[2][2] += "q0,";
		        q0();
		    }else if (cadenaA[contador] == '0'){
		        contador++;
		        tablaT[2][1] += "q3,";
		        q3();
		    }
        }
    }
    
    int count = 0;
    String[][] MatrizAux = declararTabla();
    String way = " ";
    
    public void q2() {
    	this.aceptacion = false;
    	System.out.println("Estado q2");
    	System.out.println("First option? -> q0");
        if(contador<cadenaA.length){
            if(cadenaA[contador] == '1'){
                contador++;
                count++;
                if(count == 0) {
                	MatrizAux = tablaT;
                	
                }
                way = tablaT[3][2];
                int c = contador; 
                
                tablaT[3][2] += "q0,";
                q0();
                if(!aceptacion) {
                	count = 0;
                	System.out.println("No, Second option: -> q3");
                	tablaT = MatrizAux;
                	tablaT[3][2] = way + "q3,";
                	contador = c;
                	q3();
                }else {
                	System.out.println("Yes");
                }
            }
        }
    }
    
    public void q3() {
    	this.aceptacion = false;
    	System.out.println("Estado q3");
    	if(contador < cadenaA.length){
            if(cadenaA[contador] == '1'){
                contador++;
                tablaT[4][2] += "q2,";
                q2();
            }else if (cadenaA[contador] == '0'){
                contador++;
                tablaT[4][1] += "q1,";
                q1();
            }
        }
    }
    
    public void tablaTransicion() {
    	System.out.println("\nTabla de transicion del automata");
    	for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(tablaT[i][j] + "\t");
				if(j == 0) {
					System.out.print("|");
				}
			}
			System.out.println();
			if(i == 0) {
					System.out.println("--------+-------------");
			}
		}
	}

	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}

	public boolean isAceptacion() {
		return aceptacion;
	}

	public void setAceptacion(boolean aceptacion) {
		this.aceptacion = aceptacion;
	}
}
