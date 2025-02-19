package Ejercicio1;
/**
 Programa la clase Tienda para crear objetos
 * @author Daniel Felipe Velasquez Rincon
 * @since 2020-10-02
 * @version 3
 */

import java.util.Scanner;
import java.util.Iterator;

public class Tienda {
	private Scanner leerDato =new Scanner(System.in);
	
	private Producto[] listaProductos;
	private Cliente[] listaClientes;
	private int nClientes;
	private int nProductos;
	/**
	 * @param listaProductos
	 * @param listaClientes
	 */
	public Tienda(int nProductos, int nClientes) {
		super();
		//Composicion
		listaProductos =new Producto[nProductos];
		listaClientes =new Cliente[nClientes];
	}
	
	/**
	 * Método menu de opciones para acceso a las opciones del programa
	 */
	public void run() {
		int op=0;
		boolean salir =false;
		while(!salir) {
			System.out.println(" ");
			System.out.println("Bienvenido a la tienda ");
			System.out.println("-----------");
			System.out.println("1. Registrar cliente");
			System.out.println("2. Ingresar producto");
			System.out.println("3. Buscar producto");
			System.out.println("4. Catalogo de productos");
			System.out.println("5. Lista de clientes");
			System.out.println("6. Salir");
			System.out.println("Digite una de las opciones");
			op= leerDato.nextInt();
			switch(op) {
				case 1:
					//registrarCliente();
					registrarCliente();
					break;
				case 2:
					ingresarProducto();
					break;
				case 3:
					buscarProducto();
					break;
				case 4:
					catalogoProducto();
					break;
				case 5:
					listaCliente();
					break;
				case 6:
					salir=true;
					break;
				default:
					System.out.println("Digite un numero entre 1 y 6");
					break;
			}
			System.out.println("-----------------------------");
			System.out.println(" ");
		}
		
	}
	/**
	 * Metodo para asignar los datos de los clientes del arreglo de la clase Cliente
	 */
	public void registrarCliente() {
		System.out.println("Datos del cliente");
		System.out.println("Identificacion...");
		int id =leerDato.nextInt();
		System.out.println("Nombre...");
		String nombre =leerDato.next();
		System.out.println("Apellido...");
		String apellido =leerDato.next();
		System.out.println("Telefono...");
		int telefono =leerDato.nextInt();
		System.out.println("Correo...");
		String correo =leerDato.next();
		System.out.println("Fecha nacimiento...");
		System.out.println("Dia...");
		int dia =leerDato.nextInt();
		System.out.println("Mes...");
		String mes =leerDato.next();
		System.out.println("Año...");
		int año =leerDato.nextInt();
		System.out.println(" ");
		
		
		listaClientes[nClientes] =new Cliente(id, nombre, apellido, telefono, correo);
		listaClientes[nClientes].agregarFechaNacimiento(dia, mes, año);
		

		
		for(int i=0;i<listaClientes.length;i++) {
			if(listaClientes[i]==null) {
				listaClientes[i] =listaClientes[nClientes];
			}
		}
	}
	
	/**
	 * Metodo para asignar los datos de los productos del arreglo de la clase Producto
	 */
	public void ingresarProducto() {
		System.out.println("Datos del producto");
		System.out.println("Codigo...");
		int codigo =leerDato.nextInt();
		System.out.println("Descripcion...");
		String descripcion =leerDato.next();
		System.out.println("Precio...");
		int precio =leerDato.nextInt();
		System.out.println("Cantidad...");
		int cantidad =leerDato.nextInt();
		System.out.println("Fecha vencimiento...");
		System.out.println("Dia...");
		int dia =leerDato.nextInt();
		System.out.println("Mes...");
		String mes =leerDato.next();
		System.out.println("Año...");
		int año =leerDato.nextInt();
		System.out.println(" ");
		
		listaProductos[nProductos] =new Producto(codigo, descripcion, precio, cantidad);
		listaProductos[nProductos].agregarFechaVencimiento(dia, mes, año);
		
		for(int i=0;i<listaProductos.length;i++) {
			if(listaProductos[i]==null) {
				listaProductos[i] =	listaProductos[nProductos];
			}
		}
	}
	
	/**
	 * Metodo usando el codigo de un producto, para recorrer y buscar los datos de un producto por el arreglo de la clase Producto
	 */
	public void buscarProducto() {
		Producto producto = null;
		System.out.println("Ingrese el codigo del producto...");
		int codigo = leerDato.nextInt();
		
		for(Producto p : listaProductos) {
			if(codigo == p.getCodigo()) {
				producto = p;
				break;
			}
		}
		if(producto == null) {
			System.out.println("No encontrado");
		}else {
			System.out.println(producto);
		}
		System.out.println(" ");
	}
	
	/**
	 * Método para mostar por consola todos los productos que se ingresaron
	 */
	public void catalogoProducto() {
		System.out.println("Catalogo de los productos ingresados");
		for(Producto p : listaProductos) {
			System.out.println(p);
		}
		System.out.println(" ");
	}
	
	/**
	 * Método para mostar por consola todos los clientes que se registraron
	 */
	public void listaCliente() {
		System.out.println("Lista de clientes registrados");
		for(Cliente c : listaClientes) {
			System.out.println(c);
		}
		System.out.println(" ");
	}

	/**
	 * @return the listaProductos
	 */
	public Producto[] getListaProductos() {
		return listaProductos;
	}

	/**
	 * @param listaProductos the listaProductos to set
	 */
	public void setListaProductos(Producto[] listaProductos) {
		this.listaProductos = listaProductos;
	}

	/**
	 * @return the listaClientes
	 */
	public Cliente[] getListaClientes() {
		return listaClientes;
	}

	/**
	 * @param listaClientes the listaClientes to set
	 */
	public void setListaClientes(Cliente[] listaClientes) {
		this.listaClientes = listaClientes;
	}
	
	
	
	/**
	 * Metodo para asignar los datos de los clientes del arreglo de la clase Cliente
	 * @param cliente es una instancia de la clase Cliente que contiene los datos de un cliente 
	 */
	/**public void registrarClientes(Cliente cliente) {
		for(int i=0; i<listaClientes.length; i++) {
			if(listaClientes[i] == null) {
				listaClientes[i] = cliente;
				break;
			}
		}
	}
	
	/**
	 * Método para mostar por consola todos los clientes que se registraron
	 */
	/**public void listaCliente() {
		System.out.println("Clientes...");
		for(Cliente c: listaClientes) {
			System.out.println(c);
		}
	}
	
	/**
	 * Metodo para asignar los datos de los productos del arreglo de la clase Producto
	 * @param producto es una instancia de la clase Producto que contiene los datos de un producto
	 */
	/**public void ingresarProducto(Producto producto) {
		for(int i=0; i<listaProductos.length; i++) {
			if(listaProductos[i] == null) {
				listaProductos[i] = producto;
				break;
			}
		}
	}
	
	/**
	 * Metodo usando el codigo de un producto, para recorrer y buscar los datos de un producto por el arreglo de la clase Producto
	 * @param codigo
	 * @return
	 */
	/**public Producto buscarProducto(int codigo) {
		Producto producto = null;
		for(Producto p : listaProductos) {
			if(codigo == p.getCodigo()) {
				producto = p;
				break;
			}
		}
		return producto;
	}
	
	/**
	 * Método para mostar por consola todos los productos que se ingresaron
	 */
	/**public void catalogoProductos() {
		System.out.println("Productos...");
		for(Producto p: listaProductos) {
			System.out.println(p);
		}
	}
	**/


	
	
	

}
