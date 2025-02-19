package controladorMA;

import modeloMA.OperacionMA;
import vistaMA.EntradaySalidaMA;

public class AppGrafo {
	private OperacionMA operacion;
	private EntradaySalidaMA lector;
	public AppGrafo() {
		this.operacion = new OperacionMA();
		this.lector = new EntradaySalidaMA();
	}
	public void funcionar() {
		int opcion=0;
		String menu= "\nMenu Principal" + "\n" + 
				"Seleccione proceso a realizar" + "\n" +
				"1. Generar matriz" + "\n" + 
				"2. Verificar si la arista existe" + "\n" +
				"3. Obtener el peso de una arista" + "\n" +
				"4. Imprimir matriz de adyacencia" + "\n" +
				"5. Imprimir matriz de incidencia" + "\n" +
				"6. Imprimir matriz de pesos" + "\n" +
				"7. Eliminar arista" + "\n" +
				"8. Liberar grafo" + "\n" +
				"9. Salir:" + "\n" +
				"Opcion:";
		do {
			lector.imprimirInformacion(menu);
			opcion = lector.leerOpcion();
			switch(opcion) {
				case 1:
					generarMatriz();
					break;
				case 2:
					verificarArista();
					break;
				case 3:
					obtenerPesoArista();
					break;
				case 4:
					imprimirAdyacencia();
					break;
				case 5:
					imprimirIncidencia();
					break;
				case 6:
					imprimirPesos();
					break;
				case 7:
					removerArista();
					break;
				case 8:
					liberarGrafo();
					break;
			}
		}while(opcion!=9);
	}
	
	public void generarMatriz() {
		if(operacion.getMatriz()==null) {
			lector.imprimirInformacion("\nIngrese el tamaño de la matriz que desea:");
			int tam = lector.leerDatoInt();
			operacion.generarGrafo(tam);
		}else {
			lector.imprimirInformacion("La matriz ya contiene elementos");
		}
		
	}
	public void verificarArista() {
		if(operacion.getMatriz()!=null) {
			lector.imprimirInformacion("\nIngrese el valor de la arista a verificar:");
			int arista = lector.leerDatoInt();
			operacion.verificarArista(arista);
		}else {
			lector.imprimirInformacion("No hay matriz generada");
		}
		
	}
	public void obtenerPesoArista() {
		if(operacion.getMatriz()!=null) {
			lector.imprimirInformacion("\nIngrese los vertices para obtener el peso de la arista que los conecta:");
			lector.imprimirInformacion("Vertice 1");
			int a = lector.leerDatoInt();
			lector.imprimirInformacion("Vertice 2");
			int b = lector.leerDatoInt();
			operacion.obtenerPesoArista(a, b);
		}else {
			lector.imprimirInformacion("No hay matriz generada");
		}
		
	}
	public void imprimirAdyacencia() {
		if(operacion.getMatriz()!=null) {
			lector.imprimirInformacion("\nMatriz de adyacencia");
			operacion.imprimirAdyacencia();
		}else {
			lector.imprimirInformacion("No hay matriz generada");
		}
		
	}
	public void imprimirIncidencia() {
		if(operacion.getMatriz()!=null) {
			lector.imprimirInformacion("\nMatriz de incidencia");
			operacion.imprimirIncidencia();
		}else {
			lector.imprimirInformacion("No hay matriz generada");
		}
		
	}
	public void imprimirPesos() {
		if(operacion.getMatriz()!=null) {
			lector.imprimirInformacion("\nMatriz de pesos");
			operacion.imprimirPesos();
		}else {
			lector.imprimirInformacion("No hay matriz generada");
		}
		
	}
	public void removerArista() {
		if(operacion.getMatriz()!=null) {
			lector.imprimirInformacion("\nIngrese el valor de la arista a borrar:");
			int arista = lector.leerDatoInt();
			operacion.removerArista(arista);
		}else {
			lector.imprimirInformacion("No hay matriz generada");
		}
		
	}
	public void liberarGrafo() {
		operacion.liberarGrafo();
	}
	
}
