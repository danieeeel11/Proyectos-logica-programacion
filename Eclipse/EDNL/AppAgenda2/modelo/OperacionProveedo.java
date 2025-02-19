package modelo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class OperacionProveedo implements IOperacionProveedo{
	private Set<Proveedo> listaProveedores;
	
	public OperacionProveedo() {
		this.listaProveedores = new HashSet<>();
	}
	
	public boolean evaluarEstadoColeccion() {
		if(listaProveedores.isEmpty()) {
			return true;
		}
		return false;
	}
	
	@Override
	public void anexarProveedor(Proveedo unProveedor) {
		this.listaProveedores.add(unProveedor);
	}

	@Override
	public void listarProveedor() {
		if(!evaluarEstadoColeccion()) {
			Iterator<Proveedo> iterator = listaProveedores.iterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		}else {
			System.out.println("Lista Vacia");
		}
	}

	@Override
	public void consultarProveedor(String id) {
		if(!evaluarEstadoColeccion()) {
			for (Proveedo pro : listaProveedores) {
				if(id.equals(pro.getId())) {
					System.out.println(pro.getNombre() + " " + pro.getApellido()
					+ " " + pro.getnCelular());
				}
			}
		}else {
			System.out.println("Lista Vacia");
		}
	}
	@Override
	public void borrarLista() {
		if(!evaluarEstadoColeccion()) {
			this.listaProveedores.clear();
		}else {
			System.out.println("Lista Vacia");
		}
	}
	
	
	
}
