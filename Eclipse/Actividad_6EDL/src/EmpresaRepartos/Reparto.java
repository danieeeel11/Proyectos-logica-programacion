package EmpresaRepartos;

public class Reparto {
	private int nReparto;
	private String UPZ;
	private String fecha;
	private Cliente cliente;
	private boolean entregado;
	private Domiciliario domi;
	private int semana;
	//private int numeroDomi = 0;
	//static final int precio = 10000;
	
	public Reparto(int nReparto, String uPZ, Cliente cliente, boolean entregado, Domiciliario domi) {
		super();
		this.nReparto = nReparto;
		this.UPZ = uPZ;
		//this.fecha = fecha;
		this.cliente = cliente;
		this.entregado = entregado;
		this.domi = domi;
	}
	
	public int getnReparto() {
		return nReparto;
	}
	public void setnReparto(int nReparto) {
		this.nReparto = nReparto;
	}
	public String getUPZ() {
		return UPZ;
	}
	public void setUPZ(String uPZ) {
		UPZ = uPZ;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public boolean isEntregado() {
		return entregado;
	}
	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}
	public Domiciliario getDomi() {
		return domi;
	}
	public void setDomi(Domiciliario domi) {
		this.domi = domi;
	}
	public int getSemana() {
		return semana;
	}
	public void setSemana(int semana) {
		this.semana = semana;
	}

	/*public int getNumeroDomi() {
		return numeroDomi;
	}
	public void setNumeroDomi(int numeroDomi) {
		this.numeroDomi = numeroDomi*precio;
	}
	public void setNumeroDomi() {
		this.numeroDomi = 0*precio;
	}
	public static int getPrecio() {
		return precio;
	}*/

	@Override
	public String toString() {
		return "[Reparto= " + nReparto + ", Semana:"+ semana +", UPZ:" + UPZ + ", fecha:" + fecha +
				", entregado:" + entregado + ",     Cliente=" + cliente +",     Domiciliario=" + domi  + "]";
	}

	
}
