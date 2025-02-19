package LabClasesGenericasII;
/**
 * Clase de tipo Generica que contiene le metodo imprimir array
 * @author Daniel Felipe Vel�squez Rinc�n
 * @version 1
 * @date 11-02-2021
 */
public class ImpresionGenericaClass <E> {
	/**
	 * Programaci�n generica a nivel de metodos
	 * @param arreglo
	 */
	public void imprimir(E[] arreglo) {
		for(E elemento : arreglo) {
			System.out.println(elemento + " ");
		}
		System.out.println();
	}
}
