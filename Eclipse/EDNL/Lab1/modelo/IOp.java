package modelo;

public interface IOp {
	public abstract void listarCliente(Clientee c);
	public abstract void actualizarCliente(int id);
	public abstract void mostrarPrimerCliente();
	public abstract void mostrarUltimoCliente();
	public abstract void consultarCliente(int id);
	public abstract void borrarCliente(int id);
	public abstract void borrarPrimerCliente();
	public abstract void borraUltimoCliente();
	public abstract void ordenarClienteId();
	public abstract void ordenarClienteNom();
	public abstract void ordenarClienteAp();
	public abstract void ordenarClienteTel();
}
