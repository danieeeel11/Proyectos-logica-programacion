package TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA = new Producto(3,"Producto A",2,12);
		Producto productoB = new Producto(1,"Producto B",12,8);
		Producto productoC = new Producto(2,"Producto C",5,9);
		
		Set<Producto> coleccionProducto = new TreeSet<Producto>();
		coleccionProducto.add(productoA);
		coleccionProducto.add(productoB);
		coleccionProducto.add(productoC);
		
		String ticket = "id   Nombre   Cantidad   Precio   Total\n";
		System.out.println(ticket);
		double total = 0;
		for (Producto producto : coleccionProducto) {
			System.out.println(producto.getId() + "   " + producto.getNombre() + "\t  " + producto.getCantidad() + 
					"  \t" + producto.getPrecio() + "  \t" + producto.getCantidad()*producto.getPrecio());
		}
		
		Producto comparadorProducto = new Producto();
		Set<Producto> ordenaNombre = new TreeSet<Producto>(comparadorProducto);
		ordenaNombre.add(productoA);
		ordenaNombre.add(productoB);
		ordenaNombre.add(productoC);
		System.out.println("\nOrden alfabetico");
		for (Producto producto : ordenaNombre) {
			System.out.println(producto.getId() + "   " + producto.getNombre() + "\t  " + producto.getCantidad() + 
					"  \t" + producto.getPrecio() + "  \t" + producto.getCantidad()*producto.getPrecio());
		}

	}

}
