package Genericidad;
/**
 * Programa principal para precargar los datos
 * String, Integer, Double, Character y Boolean, 
 * para luego asignarlos e imprimirlos
 * @author Daniel Felipe Velásquez Rincón
 * @version 1
 * @date 09-02-2021
 */
public class TestClaseObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClaseObject ob = new ClaseObject();
		
		String nombre = "Juan";
		ob.setObj(nombre);
		System.out.println("Imprimir cadena " + ob.getObj());
		System.out.println(" " + ob.getClass());
		
		Integer numero = 12;
		ob.setObj(numero);
		System.out.println("Imprimir objeto Integer " + ob.getObj());
		
		Double valor = 150.00;
		ob.setObj(valor);
		System.out.println("Imprimir objeto Double " + ob.getObj());
		
		Character letra = 'S';
		ob.setObj(letra);
		System.out.println("Imprimir objeto Character " + ob.getObj());
		
		Boolean estado = true;
		ob.setObj(estado);
		System.out.println("Imprimir objeto Boolean " + ob.getObj());
		
		
	}

}
