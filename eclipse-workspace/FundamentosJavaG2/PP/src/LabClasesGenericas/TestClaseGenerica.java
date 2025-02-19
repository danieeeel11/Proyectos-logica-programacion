package LabClasesGenericas;
/**
 * Programa principal para precargar los datos
 * String, Integer, para luego asignarlos a una 
 * instancia de un objeto e imprimirlos
 * @author Daniel Felipe Velásquez Rincón
 * @version 1
 * @date 09-02-2021
 */
public class TestClaseGenerica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClaseGenerica<String> obj = new ClaseGenerica<String>();
		obj.setDato("Universidad");
		System.out.println(obj.getDato());
		
		ClaseGenerica<Integer> obj1 = new ClaseGenerica<Integer>();
		obj1.setDato(12);
		System.out.println(obj1.getDato());
	}

}
