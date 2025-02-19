package modeloVA;

/**
 * 
 * @author Laura Ojeda & Daniel Velasquez
 *
 */
public class Fecha {
	private String fecha;
	private String hora;
	
	public Fecha(String fecha, String hora) {
		this.fecha = fecha;
		this.hora = hora;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	@Override
	public String toString() {
		return "[" + fecha + " | " + hora + "]";
	}
	
	
}
