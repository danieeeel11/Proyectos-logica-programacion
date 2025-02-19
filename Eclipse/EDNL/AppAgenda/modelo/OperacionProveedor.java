package modelo;

import java.util.ArrayList;
import java.util.List;

public class OperacionProveedor implements IOperacionProveedor{
	private List<Proveedor> listaProveedores;
	
	public OperacionProveedor() {
		this.listaProveedores = new ArrayList<>();
	}
	@Override
	public void anexarProveedor(Proveedor unProveedor) {
		this.listaProveedores.add(unProveedor);
	}

	@Override
	public void listarProveedor() {
		for (int i = 0; i < listaProveedores.size(); i++) {
			System.out.println(listaProveedores.get(i));;
		}
	}

	@Override
	public void consultarProveedor(String id) {
		for (int i = 0; i < listaProveedores.size(); i++) {
			if(id.equals(listaProveedores.get(i).getId())) {
				System.out.println(listaProveedores.get(i));
			}
		}
	}

	@Override
	public void actualizarProveedor(String id, String nombre, String apellido
			,String correoPer, String correoOrg, String nCelular) {
		for (int i = 0; i < listaProveedores.size(); i++) {
			if(id.equals(listaProveedores.get(i).getId())) {
				borrarProveedor(id);
				anexarProveedor(new Proveedor(id,nombre,apellido,correoPer,correoOrg,nCelular));
			}
		}
	}

	@Override
	public void borrarProveedor(String id) {
		for (int i = 0; i < listaProveedores.size(); i++) {
			if(id.equals(listaProveedores.get(i).getId())) {
				listaProveedores.remove(i);
			}
		}
	}
	
}
