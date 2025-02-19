package POO;

import java.util.Scanner;

public class AppTienda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leerDato =new Scanner(System.in);
		
		System.out.println("Entrar codigo de la categoria ");
		int categoria = leerDato.nextInt();
		System.out.println("Entrar nombre de la categoria ");
		String nombre = leerDato.next();
		Categoria miCategoria =new Categoria(categoria, nombre);
		
		System.out.println("Entrar codigo del producto ");
		int codigo = leerDato.nextInt();
		System.out.println("Entrar nombre del producto ");
		nombre = leerDato.next();
		System.out.println("Entrar marca del producto ");
		String marca = leerDato.next();
		System.out.println("Entrar precio del producto ");
		long precio = leerDato.nextLong();
		System.out.println("Entrar descuento del producto ");
		int descuento = leerDato.nextInt();
		Producto producto1 =new Producto(codigo, nombre, marca, precio, descuento, miCategoria);
		
		System.out.println("Categoria " + producto1.getCategoria().getDescripcionCategoria());
		System.out.println("Nombre del producto " + producto1.getDescripcionProducto());
		System.out.println("Marca del producto " + producto1.getMarca());
		System.out.println("Precio base " + producto1.getPrecio());
		System.out.println("Porcentaje descuento " + producto1.getDescuento());
		
		long valordescuento = (producto1.getPrecio() * (producto1.getDescuento()/100));
		long precioFinal = (producto1.getPrecio() - valordescuento);
		System.out.println("Precio final del producto " + precioFinal);

	}

}
