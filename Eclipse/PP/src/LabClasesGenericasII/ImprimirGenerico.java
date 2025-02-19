package LabClasesGenericasII;
/**
 * Clase que contiene un metodo Generico para imprimir array
 * @author Daniel Felipe Velásquez Rincón
 * @version 1
 * @date 11-02-2021
 */
public class ImprimirGenerico {
	public <E> void imprimir(E[] arreglo) {
		for(E elemento :  arreglo) {
			System.out.println(elemento + " ");
		}
		System.out.println();
	}
}
