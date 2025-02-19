package Collections;

public class EjFunciones {

	public static void main(String[] args) {
		Funciones op = new Funciones();
		//System.out.println(op.vacia());
		op.agregarInicio(100);
		op.agregarFinal(15);
		op.agregarFinal(10);
		op.agregarFinal(5);
		op.borrar(1);
		//op.modificar(1,80);
		//System.out.println(op.consultar(80))
		//op.agregarInicio(4);
		op.agregarInicio(7);
		op.agregarInicio(50);
		System.out.println("El tamaño del arreglo es : " + op.tamanio);
		//op.agregarInicio(10);
		System.out.println();
		op.mostrar();
	}
}
