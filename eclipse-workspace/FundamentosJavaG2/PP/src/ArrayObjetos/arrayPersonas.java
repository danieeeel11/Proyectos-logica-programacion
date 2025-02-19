package ArrayObjetos;
/**
 * Programa principal para precargar los datos de
 * una persona, asignarlos a una posicion de un arreglo
 * e imprimir el arreglo por pantalla 
 * @author Daniel Felipe Velásquez Rincón
 * @version 1
 * @date 16-02-2021
 */
public class arrayPersonas {

	public static void main(String[] args) {
		Persona[] arrayPersonas = new Persona[5];
		arrayPersonas[0] = new Persona("Maria", 12);
		arrayPersonas[1] = new Persona("Juan", 18);
		arrayPersonas[2] = new Persona("Mario", 17);
		arrayPersonas[3] = new Persona("Laura", 20);
		arrayPersonas[4] = new Persona("Carlos", 21);
		
		System.out.println("Array de personas");
		
		for (int i = 0; i < arrayPersonas.length; i++) {
			System.out.println(arrayPersonas[i].getNombre() + " " + arrayPersonas[i].getEdad());
		}
		
		System.out.println();
		System.out.println("Segunda impresion");
		for (Persona persona : arrayPersonas) {
			System.out.println(persona.getEdad() + " " + persona.getNombre());
		}
	}

}
