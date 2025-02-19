package modeloVA;

/**
 * 
 * @author Laura Ojeda & Daniel Velasquez
 *
 */
public interface IOperacionAlquiler {
	public abstract void llenarData();
	//public abstract void llenarDataCliente();
	//public abstract void llenarDataVehiculos();
	public abstract void alquilar(String id);
	public abstract void devolver(String id);
	public abstract void consultaCliente(String id);
	public abstract void consultaAutoPlaca(String placa);
	public abstract void consultaAutoMarca(String marca);
	public abstract void consultaAutoColor(String color);
	public abstract void consultaAutosAlquilados();
	public abstract void consultaAutosDisponibles();
	public abstract void consClientesMorosos();
	public abstract void actualizarDataCliente(String id);
	public abstract void mediaAquileres();
	public abstract void mediaRecortadaAlquileres();
	public abstract void mediaWinzorizadaAlquileres();
	public abstract void varianza();
	public abstract void mediaArmonicaVelocidadesAutos();
	public abstract void imprimirListados();
}
