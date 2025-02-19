package Ejercicio1;

import java.util.Scanner;

public class Tienda {
	private Scanner leerDato =new Scanner(System.in);
	private Producto[] arregloProducto;
	private Cliente[] arregloCliente;
	private String nombreTienda;
	/**
	 * @param arregloProducto
	 * @param arregloCliente
	 * @param nombreTienda
	 */
	public Tienda(int nProducto, int nCliente, String nombreTienda) {
		super();
		arregloProducto = new Producto[nProducto];
		arregloCliente = new Cliente[nCliente];
		this.nombreTienda = nombreTienda;
	}
	
	public void run() {
		int op=0;
		boolean salir =false;
		while(!salir) {
			System.out.println(" ");
			System.out.println("Bienvenido a la tienda " + this.nombreTienda);
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
					catalogoProductos();
					break;
				case 5:
					listaClientes();
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
	
	public void registrarCliente() {
		System.out.println("Datos del cliente");
		System.out.println("Identificacion...");
		int id =leerDato.nextInt();
		System.out.println("Nombre...");
		String nombre =leerDato.next();
		System.out.println("Telefono...");
		String telefono =leerDato.next();
		System.out.println("Correo...");
		String correo =leerDato.next();
		System.out.println("Fecha nacimiento...");
		System.out.println("Dia...");
		int dia =leerDato.nextInt();
		System.out.println("Mes...");
		int mes =leerDato.nextInt();
		System.out.println("Año...");
		int año =leerDato.nextInt();
		System.out.println(" ");
		
		Fecha fechaNacimiento =new Fecha(dia, mes, año);
		Cliente registrarCliente =new Cliente(id, nombre, telefono, correo, fechaNacimiento);
		
		for(int i=0;i<arregloCliente.length;i++) {
			if(arregloCliente[i]==null) {
				arregloCliente[i] = registrarCliente;
			}
		}
	}
	
	public void ingresarProducto() {
		System.out.println("Datos del producto");
		System.out.println("Codigo...");
		int codigo =leerDato.nextInt();
		System.out.println("Descripcion...");
		String descripcion =leerDato.next();
		System.out.println("Precio...");
		long precio =leerDato.nextLong();
		System.out.println("Cantidad...");
		int cantidad =leerDato.nextInt();
		System.out.println("Fecha vencimiento...");
		System.out.println("Dia...");
		int dia =leerDato.nextInt();
		System.out.println("Mes...");
		int mes =leerDato.nextInt();
		System.out.println("Año...");
		int año =leerDato.nextInt();
		System.out.println(" ");
		
		Fecha fechaVencimiento =new Fecha(dia, mes, año);
		Producto ingresarProducto =new Producto(codigo, descripcion, precio, cantidad, fechaVencimiento);
		
		for(int i=0;i<arregloProducto.length;i++) {
			if(arregloProducto[i]==null) {
				arregloProducto[i] = ingresarProducto;
			}
		}
	}
	
	public void buscarProducto() {
		Producto producto = null;
		System.out.println("Ingrese el codigo del producto...");
		int codigo = leerDato.nextInt();
		
		for(Producto p : arregloProducto) {
			if(codigo==p.getCodigo()) {
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
	
	
	public void catalogoProductos() {
		System.out.println("Catalogo de los productos ingresados");
		for(Producto p : arregloProducto) {
			System.out.println(p);
		}
		System.out.println(" ");
	}
	
	
	public void listaClientes() {
		System.out.println("Lista de clientes registrados");
		for(Cliente c : arregloCliente) {
			System.out.println(c);
		}
		System.out.println(" ");
	}

}
