package LabClasesGenericasII;
/**
 * Programa principal para precargar los arrays de tipo
 * Integer, Double y String para implementar el metodo
 * imprimir y mostrarlos por pantalla
 * @author Daniel Felipe Velásquez Rincón
 * @version 1
 * @date 11-02-2021
 */
public class PruebaImprimirGenericosClass {

	public static void main(String[] args) {
		Integer[] integers = {1,2,3,4,5};
		Double[] doubles = {1.0,2.0,3.0,4.0,5.0};
		String[] strings = {"One","Two","Three","Four","Five"};
		
		ImpresionGenericaClass <Integer> imprimirIntegers = new ImpresionGenericaClass<Integer>();
		imprimirIntegers.imprimir(integers);
		
		ImpresionGenericaClass <Double> imprimirDoubles = new ImpresionGenericaClass<Double>();
		imprimirDoubles.imprimir(doubles);
		
		ImpresionGenericaClass <String> imprimirStrings = new ImpresionGenericaClass<String>();
		imprimirStrings.imprimir(strings);
		
		
	}

}
