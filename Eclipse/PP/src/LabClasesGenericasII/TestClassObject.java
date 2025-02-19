package LabClasesGenericasII;
/**
 * Programa principal para precargar los datos
 * String, Integer, Double, Character y Boolean, 
 * para luego asignarlos al array e imprimirlos
 * @author Daniel Felipe Velásquez Rincón
 * @version 1
 * @date 11-02-2021
 */
public class TestClassObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassObject ob = new ClassObject(5);
		
		String nombre = "Juan";
		ob.add(nombre);
		String name = (String)ob.get(0);
		System.out.println("Imprimir cadena " + name);
		System.out.println(" " + ob.getClass());
		
		Integer numero = 12;
		ob.add(numero);
		int n = (Integer)ob.get(1);
		System.out.println("Imprimir objeto Integer " + n);
		
		Double valor = 150.00;
		ob.add(valor);
		double d = (Double)ob.get(2);
		System.out.println("Imprimir objeto Double " + d);
		
		Character letra = 'S';
		ob.add(letra);
		char c = (Character)ob.get(3);
		System.out.println("Imprimir objeto Character " + c);
		
		Boolean estado = true;
		ob.add(estado);
		boolean b = (Boolean)ob.get(4);
		System.out.println("Imprimir objeto Boolean " + b);
	}


}
