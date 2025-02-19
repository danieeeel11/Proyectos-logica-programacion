package modelo;

import java.util.Comparator;
import java.util.Scanner;
//import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class OperacionCliente implements IOperacionCliente{
	private Set<Cliente> listaClientes = new TreeSet<Cliente>();
	//private EyS lector;
	private Scanner sc = new Scanner(System.in);
	/**
	 * false = no esta vacio
	 * true = esta vacio
	 * @return
	 */
	public boolean estado() {
		if(listaClientes.isEmpty()) {
			return true;
		}
		return false;
	}
	
	@Override
	public void listarCliente(Cliente c) {
		this.listaClientes.add(c);
	}

	@Override
	public void actualizarCliente(int id) {
		//Scanner sc = new Scanner(System.in);
		if(!estado()) {
			boolean encontrado = false;
			for (Cliente cliente : listaClientes) {
				if(id==cliente.getId()) {
					System.out.println("Modificacion de datos");
					System.out.println("Id:");
					cliente.setId(sc.nextInt());
					System.out.println("Nombre:");
					cliente.setNombre(sc.next());
					System.out.println("Apellido:");
					cliente.setApellido(sc.next());
					System.out.println("Direccion:");
					cliente.setDireccion(sc.next());
					System.out.println("Correo organizacion:");
					cliente.setCorreoOrg(sc.next());
					System.out.println("Correo persona:");
					cliente.setCorreoPer(sc.next());
					System.out.println("Numero celular");
					cliente.setTelefonico(sc.nextInt());
					encontrado = true;
				}
			}
			if(!encontrado) {
				System.out.println("El cliente no fue encontrado");
			}else {
				System.out.println("El cliente fue actualizado");
			}
		}else {
			System.out.println("La lista esta vacia");
		}
	}

	@Override
	public void mostrarPrimerCliente() {
		int i=0;
		for (Cliente cliente : listaClientes) {
			if(i==0) {
				System.out.println(cliente);
				break;
			}
			i++;
		}
	}

	@Override
	public void mostrarUltimoCliente() {
		int i=0;
		for (Cliente cliente : listaClientes) {
			if(i==listaClientes.size()-1) {
				System.out.println(cliente);
				break;
			}
			i++;
		}
	}

	@Override
	public void consultarCliente(int id) {
		if(!estado()) {
			boolean encontrado = false;
			for (Cliente cliente : listaClientes) {
				if(id==cliente.getId()) {
					System.out.println(cliente);
					encontrado = true;
				}
			}
			if(!encontrado) {
				System.out.println("El cliente no fue encontrado");
			}else {
				System.out.println("El cliente fue encontrado");
			}
		}else {
			System.out.println("La lista esta vacia");
		}
	}

	@Override
	public void borrarCliente(int id) {
		if(!estado()) {
			boolean encontrado = false;
			for (Cliente cliente : listaClientes) {
				if(id==cliente.getId()) {
					listaClientes.remove(cliente);
					encontrado = true;
					break;
				}
			}
			if(!encontrado) {
				System.out.println("El cliente no fue encontrado");
			}else {
				System.out.println("El cliente fue removido");
			}
		}else {
			System.out.println("La lista esta vacia");
		}
	}

	@Override
	public void borrarPrimerCliente() {
		if(!estado()) {
			int i=0;
			for (Cliente cliente : listaClientes) {
				if(i==0) {
					listaClientes.remove(cliente);
					System.out.println("El primer cliente fue removido");
					break;
				}
				i++;
			}
		}else {
			System.out.println("La lista esta vacia");
		}
		
	}

	@Override
	public void borraUltimoCliente() {
		if(!estado()) {
			int i=0;
			for (Cliente cliente : listaClientes) {
				if(i==listaClientes.size()-1) {
					listaClientes.remove(cliente);
					System.out.println("El ultimo cliente fue removido");
					break;
				}
				i++;
			}
		}else {
			System.out.println("La lista esta vacia");
		}
	}

	@Override
	public void ordenarClienteId() {
		//listaClientes.stream().sorted(Comparator.comparingInt(Cliente::getId));
		listaClientes.forEach(System.out::println);
	}

	@Override
	public void ordenarClienteNom() {
		listaClientes.stream().sorted(Comparator.comparing(Cliente::getNombre)).forEach(System.out::println);
	}

	@Override
	public void ordenarClienteAp() {
		listaClientes.stream().sorted(Comparator.comparing(Cliente::getApellido)).forEach(System.out::println);
	}

	@Override
	public void ordenarClienteTel() {
		listaClientes.stream().sorted(Comparator.comparingInt(Cliente::getTelefonico)).forEach(System.out::println);
		
	}

}
