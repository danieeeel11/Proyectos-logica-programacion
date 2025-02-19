package controlLA;

import modeloLA.Grafo;
import vistaLA.EntraySalidaLA;

/**
 * 
 * @author Laura Ojeda & Daniel Velasquez
 *
 */

public class ListaAdyacenciaGrafo {
	private EntraySalidaLA leer;
	private Grafo op;
	
	public ListaAdyacenciaGrafo() {
		this.leer = new EntraySalidaLA();
		this.op = new Grafo();
	}
	
	public void run() {
		leer.imprimirInformacion("¿Cuantos nodos desea?");
		int nodos = leer.leerDatoInt();
		op.declarar(nodos);
		op.caminos();
		op.listar();
	}

}
