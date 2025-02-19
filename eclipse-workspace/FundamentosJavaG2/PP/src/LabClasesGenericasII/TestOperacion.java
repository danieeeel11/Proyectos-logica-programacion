package LabClasesGenericasII;
/**
 * Programa principal para precargar dos datos
 * enteros, dos datos doubles y dos datos strings
 * para compararlos y determinar cual es mayor e 
 * imprimir el mayor 
 * @author Daniel Felipe Velásquez Rincón
 * @version 1
 * @date 11-02-2021
 */
public class TestOperacion {
	public static void main(String[] args) {
		System.out.println("Operacion mayor(2,5) -> " + Operacion.obtenerMayor(2, 5));
		System.out.println("Operacion mayor(2.3, 4.5) -> " + Operacion.obtenerMayor(2.3, 4.5));
		System.out.println("Operacion mayor(\"Alirio\", \"Ricardo\") -> " + Operacion.obtenerMayor("Alirio", "Ricardo"));
	}
}
