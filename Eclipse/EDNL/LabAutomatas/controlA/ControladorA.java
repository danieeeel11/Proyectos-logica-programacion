package controlA;

import modeloA.AutomataA;
import vistaA.EntradaySalidaA;

public class ControladorA {
	private EntradaySalidaA eys = new EntradaySalidaA();
	//private AutomataA op = new AutomataA();
	
	public void run() {
		eys.imprimirInformacion("Digite La cadena:");
        String cadena = eys.leerTexto();
        AutomataA automata = new AutomataA(cadena);
        automata.evaluarCad();
        /*op.cadenaA = cadena.toCharArray();
        op.evaluarCad();
 
        if(op.aceptacion){
            //System.out.println("\n");
        	eys.imprimirInformacion("\nLa Cadena es Aceptada");
            //System.out.println("\nLa Cadena es Aceptada");
        }else{
            //System.out.println("\n");
        	eys.imprimirInformacion("\nLa Cadena no es Aceptada");
            //System.out.println("\nLa Cadena no es Aceptada");
        }*/
	}
}
