package Collections;
/**
 * Clase principal que contiene el main de funcion, contiene los metodos del tda de la funcion, para ejecutar 
 * operaciones con un arreglo estatico
 * @author Laura Sofia Ojeda Leon & Daniel Felipe Velasquez Rincon
 * @version 1
 * @since 10-03-2021
 *
 */
public class EjFuncion {

	public static void main(String[] args) {
		Funcion op = new Funcion();
		op.agregarInicio(4);
		op.agregarFinal(20);
		op.agregarFinal(5);
		op.agregarInicio(9);
		op.borrar(1);
		op.modificar(2, 11);
		System.out.println("Se encuentra el dato: " + op.consultar(9));
		
		System.out.println("El tamaño del arreglo es: " + op.tamanio);
		op.mostrar();

	}

}
