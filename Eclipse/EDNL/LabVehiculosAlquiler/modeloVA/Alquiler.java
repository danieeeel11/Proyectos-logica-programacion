package modeloVA;

/**
 * 
 * @author Laura Ojeda & Daniel Velasquez
 *
 */
public class Alquiler {
	private String codCliente;
	private String codVh;
	private Fecha fechaAlquiler;
	private Fecha fechaDevolucion;
	private String tarifa;
	private int totalH;
	private int totalKm;
	private Pago pago;
	private int totalCobro;
	private boolean devuelto;
	private String observaciones;
	
	public Alquiler(String codCliente, String codVh, Fecha fechaAlquiler, boolean devuelto, String observaciones) {
		//super();
		this.codCliente = codCliente;
		this.codVh = codVh;
		this.fechaAlquiler = fechaAlquiler;
		//this.fechaDevolucion = fechaDevolucion;
		this.tarifa = "Hora: 50.000 | Km: 1.000";
		//this.totalH = totalH;
		//this.totalKm = totalKm;
		//this.pago = pago;
		//this.totalCobro = pago.getPrecioH()+pago.getPrecioNum();
		this.devuelto = devuelto;
		this.observaciones = observaciones;
	}

	public String getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(String codCliente) {
		this.codCliente = codCliente;
	}

	public String getCodVh() {
		return codVh;
	}

	public void setCodVh(String codVh) {
		this.codVh = codVh;
	}

	public Fecha getFechaAlquiler() {
		return fechaAlquiler;
	}

	public void setFechaAlquiler(Fecha fechaAlquiler) {
		this.fechaAlquiler = fechaAlquiler;
	}

	public Fecha getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(Fecha fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	public String getTarifa() {
		return tarifa;
	}

	public void setTarifa(String tarifa) {
		this.tarifa = tarifa;
	}

	public int getTotalH() {
		return totalH;
	}

	public void setTotalH(int totalH) {
		this.totalH = totalH;
	}

	public int getTotalKm() {
		return totalKm;
	}

	public void setTotalKm(int totalKm) {
		this.totalKm = totalKm;
	}

	public Pago getPago() {
		return pago;
	}

	public void setPago(Pago pago) {
		this.pago = pago;
	}

	public int getTotalCobro() {
		return totalCobro;
	}

	public void setTotalCobro(double precio) {
		this.totalCobro = (int)precio + pago.getPrecioH()+pago.getPrecioNum();
	}

	public boolean isDevuelto() {
		return devuelto;
	}

	public void setDevuelto(boolean devuelto) {
		this.devuelto = devuelto;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	@Override
	public String toString() {
		return "Alquiler [\n\t\tCod Cliente= " + codCliente + ", Cod Vehiculo= " + codVh + ", \n\t\tFecha Alquiler= " + fechaAlquiler
				+ ", Fecha Devolucion= " + fechaDevolucion + ", \n\t\tTarifa= " + tarifa + ", Total Horas= " + totalH + ", Total Km= "
				+ totalKm + ", \n\t\tPago= " + pago + ", Total Cobro= " + totalCobro + ", Devuelto?= " + devuelto
				+ ", \n\t\tObservaciones= " + observaciones + "]";
	}

	
	
}
