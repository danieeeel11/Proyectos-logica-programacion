package modeloVA;

/**
 * 
 * @author Laura Ojeda & Daniel Velasquez
 *
 */
public class Cliente {
	private String cod;
	private String nombre;
	private String domicilio;
	private Fecha fechaNac;
	private Fecha fechaAlta;
	private String id;
	private String tarjNum;
	private String tipTarj;
	
	public Cliente(String cod, String nombre, String domicilio, Fecha fechaNac, Fecha fechaAlta, String id,
			String tarjNum, String tipTarj) {
		this.cod = cod;
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.fechaNac = fechaNac;
		this.fechaAlta = fechaAlta;
		this.id = id;
		this.tarjNum = tarjNum;
		this.tipTarj = tipTarj;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public Fecha getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Fecha fechaNac) {
		this.fechaNac = fechaNac;
	}

	public Fecha getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Fecha fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTarjNum() {
		return tarjNum;
	}

	public void setTarjNum(String tarjNum) {
		this.tarjNum = tarjNum;
	}

	public String getTipTarj() {
		return tipTarj;
	}

	public void setTipTarj(String tipTarj) {
		this.tipTarj = tipTarj;
	}

	@Override
	public String toString() {
		return "Cliente [Cod= " + cod + ", Nombre= " + nombre + ", \n\t\tDomicilio= " + domicilio + ", \n\t\tFecha Nacimiento= " + fechaNac
				+ ", Fecha Alta= " + fechaAlta + ", \n\t\tId= " + id + ", Num Tarjeta= " + tarjNum + ", Tipo Tarjeta= " + tipTarj + "]";
	}
	
	
}
