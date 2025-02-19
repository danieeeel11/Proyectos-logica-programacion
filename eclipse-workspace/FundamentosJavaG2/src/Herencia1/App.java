package Herencia1;

import ActividadRComposicionCorreccion.Fecha;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fecha fecha =new Fecha(8,11,2020);
		
		Perecedero miProductoP =new Perecedero(100, "Leche", 1500, fecha);
		
		NoPerecedero miProductoNP =new NoPerecedero(200, "Jabon", 1500, "Rey");
		
		System.out.println(miProductoP);
		System.out.println(miProductoNP);
		
		Perecedero[] arregloP =new Perecedero[10];
		
		System.out.println("Imprimir los datos del arreglo");
		Producto[] arregloProducto =new Producto[4];
		arregloProducto[0] =miProductoP;
		arregloProducto[1] =miProductoNP;
		
		Perecedero miProductoP1 =new Perecedero(100, "Pan", 2500, fecha);
		arregloProducto[2] =miProductoP1;
		
		for(Producto producto : arregloProducto) {
			System.out.println(producto);
		}
		

	}

}
