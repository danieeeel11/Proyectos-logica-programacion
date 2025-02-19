package modelo;

public interface IOperacionProveedor {
	public abstract void anexarProveedor (Proveedor unProveedor);
	public abstract void listarProveedor ();
	public abstract void consultarProveedor(String id);
	public abstract void actualizarProveedor(String id, String nombre, String apellido
			,String correoPer, String correoOrg, String nCelular);
	public abstract void borrarProveedor(String id);
}
