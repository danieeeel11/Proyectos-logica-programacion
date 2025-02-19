package modelo;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Op implements IOp{
	private Set<Clientee> listaClientes;
	
	public Op() {
		this.listaClientes = new TreeSet<>();
	}
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
	public void listarCliente(Clientee c) {
		this.listaClientes.add(c);
	}

	@Override
	public void actualizarCliente(int id) {
		Scanner sc = new Scanner(System.in);
		if(!estado()) {
			boolean encontrado = false;
			for (Clientee cliente : listaClientes) {
				if(id==cliente.getId()) {
					cliente.setId(sc.nextInt());
					cliente.setNombre(sc.next());
					cliente.setApellido(sc.next());
					cliente.setDireccion(sc.next());
					cliente.setCorreoOrg(sc.next());
					cliente.setCorreoPer(sc.next());
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
		for (Clientee cliente : listaClientes) {
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
		for (Clientee cliente : listaClientes) {
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
			for (Clientee cliente : listaClientes) {
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
			for (Clientee cliente : listaClientes) {
				if(id==cliente.getId()) {
					listaClientes.remove(cliente);
					encontrado = true;
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
			for (Clientee cliente : listaClientes) {
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
			for (Clientee cliente : listaClientes) {
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
		listaClientes.stream().sorted(Comparator.comparingInt(Clientee::getId));
	}

	@Override
	public void ordenarClienteNom() {
		listaClientes.stream().sorted(Comparator.comparing(Clientee::getNombre));
	}

	@Override
	public void ordenarClienteAp() {
		listaClientes.stream().sorted(Comparator.comparing(Clientee::getApellido));
	}

	@Override
	public void ordenarClienteTel() {
		listaClientes.stream().sorted(Comparator.comparingInt(Clientee::getTelefonico));
		
	}
	
	public void imprimirListado() {
		if(!estado()) {
			Iterator<Clientee> iterator = listaClientes.iterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		}else {
			System.out.println("Lista Vacia");
		}
	}
}
