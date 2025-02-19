package modelo;

public interface IOperacionProveedo {
	public abstract void anexarProveedor (Proveedo unProveedor);
	public abstract void listarProveedor ();
	public abstract void consultarProveedor(String id);
	public abstract void borrarLista();
}
