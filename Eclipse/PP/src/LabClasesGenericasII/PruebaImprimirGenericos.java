package LabClasesGenericasII;
/**
 * Programa principal para precargar los arrays de tipo
 * Integer, Double y String para implementar el metodo generico
 * imprimir y mostrarlos por pantalla
 * @author Daniel Felipe Velásquez Rincón
 * @version 1
 * @date 11-02-2021
 */
public class PruebaImprimirGenericos {

	public static void main(String[] args) {
		ImprimirGenerico ig = new ImprimirGenerico();
		Integer[] integers = {1,2,3,4,5};
		Double[] doubles = {1.0,2.0,3.0,4.0,5.0};
		String[] strings = {"One","Two","Three","Four","Five"};
		ig.imprimir(integers);
		ig.imprimir(doubles);
		ig.imprimir(strings);
	}

}
